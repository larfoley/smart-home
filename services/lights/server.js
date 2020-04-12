const PROTO_PATH = __dirname + '/../../proto/lights.proto';

const grpc = require('grpc');
const protoLoader = require('@grpc/proto-loader');
const packageDefinition = protoLoader.loadSync(PROTO_PATH, {
      keepCase: true,
      longs: String,
      enums: String,
      defaults: true,
      oneofs: true
  }
);
const lights_proto = grpc.loadPackageDefinition(packageDefinition).lights;
const LightsImpl = require(__dirname + '/lights-impl.js');

class LightsServer {
  constructor() {
    this.port = 50060;
  }

  run() {
    const server = new grpc.Server()
    const lightsServiceImpl = new LightsImpl()

    server.addService(lights_proto.Lights.service, lightsServiceImpl);
    server.bind(`0.0.0.0:${this.port}`, grpc.ServerCredentials.createInsecure());
    server.start();
    console.log(`the lights serivce is now running at localhost:${this.port}`);
  }
}

function main() {
  server = new LightsServer()
  server.run()
}

main();
