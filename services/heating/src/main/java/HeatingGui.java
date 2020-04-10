import heating.HeatingStatus;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HeatingGui extends JFrame {
    private JComboBox comboBox;
    private String strengthOptions[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
    static HeatingClient client;
    private JButton toggleHeatingButton, offButton;
    private JLabel heatingPowerStatusLabel, heatingRunningTimeLabel, heatingStrengthLabel;


    public HeatingGui(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        client = new HeatingClient();

        this.comboBox = new JComboBox(strengthOptions);
        this.toggleHeatingButton = new JButton();
        this.heatingPowerStatusLabel = new JLabel();
        this.heatingRunningTimeLabel = new JLabel();
        this.heatingStrengthLabel = new JLabel();

        this.render();
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public JButton getToggleHeatingButton() {
        return toggleHeatingButton;
    }

    public static HeatingClient getClient() {
        return client;
    }

    public void render() {
        HeatingStatus status = client.checkStatus();

        heatingPowerStatusLabel.setBounds(50, 15, 300, 50);
        toggleHeatingButton.setBounds(50,50,100, 30);
        heatingRunningTimeLabel.setBounds(50, 15, 400, 160);
        heatingStrengthLabel.setBounds(50, 15, 500, 230);
        comboBox.setBounds(50,150,100, 20);
        comboBox.setSelectedIndex(status.getStrength() - 1);

        if (status.getIsOn()) {
            toggleHeatingButton.setText("Turn Off");
            heatingPowerStatusLabel.setText("The heating is on");

        } else {
            toggleHeatingButton.setText("Turn On");
            heatingPowerStatusLabel.setText("The heating is off");
        }

        heatingStrengthLabel.setText("Strength: " + status.getStrength());
        heatingRunningTimeLabel.setText("Running Time: " + status.getRunningTime());

        this.add(heatingPowerStatusLabel);
        this.add(heatingRunningTimeLabel);
        this.add(toggleHeatingButton);
        this.add(heatingStrengthLabel);
        this.add(comboBox);

        Runnable runnable = () -> this.updateRunningTime();
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);

        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void updateRunningTime() {
        HeatingStatus status = client.checkStatus();
        if (status.getIsOn()) {
            heatingRunningTimeLabel.setText("Running Time: " + status.getRunningTime());
            System.out.println(status.getRunningTime());
        }
    }

    public static void main(String[] args) {

        // Render gui and set up event listeners
        HeatingGui gui = new HeatingGui("Heating GUI");
        client = getClient();

        JComboBox comboBox = gui.getComboBox();

        comboBox.addActionListener(e -> {
            if (e.getSource() == comboBox) {
                int strength = Integer.parseInt((String) comboBox.getSelectedItem());
                client.adjustStrength(strength);
                gui.render();
            }
        });

        JButton toggleHeatingButton = gui.getToggleHeatingButton();

        toggleHeatingButton.addActionListener(e -> {
            if (e.getSource() == toggleHeatingButton) {

                if (client.checkStatus().getIsOn()) {
                    client.turnOff();
                } else {
                    client.turnOn();
                }

                gui.render();
            }
        });


//
//        HeatingStatus status = client.checkStatus();
//        status.getRunningTime()
//        HeatingGui f = new HeatingGui("Heating GUI");
//
//        JLabel statusTextField = new JLabel();
//        statusTextField.setText(status.toString());
//        System.out.println(status.toString());
//        statusTextField.setBounds(30,30,350, 140);
//        f.add(statusTextField);
//
//
        gui.render();
    }

}


