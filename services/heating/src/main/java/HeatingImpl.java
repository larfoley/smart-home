import heating.Empty;
import heating.HeatingGrpc;
import heating.HeatingStatus;
import heating.HeatingStrength;
import io.grpc.stub.StreamObserver;

import java.util.*;
import java.util.concurrent.TimeUnit;

class HeatingImpl extends HeatingGrpc.HeatingImplBase {
    private final int DEFAULT_HEATING_STRENGTH = 5;
    private final int MAX_HEATING_STRENGTH = 10;

    private boolean isOn;
    private int heatingStrength;
    private long runningTime;

    HeatingImpl() {
        this.isOn = false;
        this.heatingStrength = this.DEFAULT_HEATING_STRENGTH;
        this.runningTime = 0;

    }

    public static void main(String[] args) {
        new HeatingImpl();
    }

    @Override
    public void checkStatus(Empty request, StreamObserver<HeatingStatus> responseObserver) {
        responseObserver.onNext(getHeatingStatus());
        responseObserver.onCompleted();
    }

    @Override
    public void turnOn(Empty request, StreamObserver<HeatingStatus> responseObserver) {
        this.isOn = true;
        this.runningTime = new Date().getTime();

        responseObserver.onNext(getHeatingStatus());
        responseObserver.onCompleted();
    }

    @Override
    public void turnOff(Empty request, StreamObserver<HeatingStatus> responseObserver) {
        this.isOn = false;
        this.runningTime = 0;

        responseObserver.onNext(getHeatingStatus());
        responseObserver.onCompleted();
    }

    @Override
    public void adjustStrength(HeatingStrength request, StreamObserver<HeatingStrength> responseObserver) {
        int newStrength = request.getStrength();

        // Handle validation errors
        if (newStrength > this.MAX_HEATING_STRENGTH || newStrength <= 0) {
            throw new IllegalArgumentException("Invalid strength value");
        }

        this.heatingStrength = newStrength;

        responseObserver.onNext(HeatingStrength.newBuilder().setStrength(this.heatingStrength).build());
        responseObserver.onCompleted();
    }

    private String getRunningTimeString() {
        List<TimeUnit> units = new ArrayList<>(Arrays.asList(
                TimeUnit.DAYS,
                TimeUnit.HOURS,
                TimeUnit.MINUTES,
                TimeUnit.SECONDS
        ));

        String result = "";

        long nowTime = new Date().getTime();
        long startTime = this.runningTime == 0 ? nowTime : this.runningTime;
        long diffInMilliseconds = nowTime - startTime;

        for ( TimeUnit unit : units ) {
            long diff = unit.convert(diffInMilliseconds,TimeUnit.MILLISECONDS);
            long diffInMillisecondsForUnit = unit.toMillis(diff);

            diffInMilliseconds = diffInMilliseconds - diffInMillisecondsForUnit;

            result += diff + " " + unit.toString().toLowerCase() + " " ;
        }

        return result;
    }

    private HeatingStatus getHeatingStatus() {
        return HeatingStatus.newBuilder()
                .setIsOn(this.isOn)
                .setStrength(this.heatingStrength)
                .setRunningTime(getRunningTimeString())
                .build();
    }
}