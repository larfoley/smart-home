module.exports = class LightsImpl {
  constructor() {
    this.lights = [
      { id: 1, isOn: false, brightness: 5 },
      { id: 2, isOn: false, brightness: 5 },
      { id: 4, isOn: false, brightness: 5 },
      { id: 5, isOn: false, brightness: 5 },
      { id: 6, isOn: false, brightness: 5 }
    ]
  }

  findLight(id) {
    return this.lights.find((light) => light.id == id);
  }

  getStatus(call, callback) {
    const response = {
      lights: this.lights
    }

    callback(null, response);
  }

  turnOn({ request }, callback) {
    console.log("Turning on a single light...");

    const id = request.id;
    const light = this.findLight(id);

    const response = {
      lightsTurnedOn: 0,
      totalLightsOn: 0
    }

    if (light) {
      light.isOn = true;
      response.lightsTurnedOn = 1
      response.totalLightsOn = this.lights.filter(l => l.isOn).length
      console.log("turned on light " + id);
    } else {
      console.error("Error: tried to turn on a light that does not exit");
    }

    console.log(response);

    callback(null, response);
  }

  turnOff({ request }, callback) {
    console.log("Turning off a single light...");
    const id = request.id;
    const light = this.findLight(id);

    const response = {
      lightsTurnedOff: 0,
      totalLightsOff: 0
    }

    if (light) {
      light.isOn = false;
      response.lightsTurnedOff = 1
      response.totalLightsOff = this.lights.filter(l => !l.isOn).length
      console.log("turned off light " + id);
    } else {
      console.error("Error: tried to turn off a light that does not exit");
    }

    callback(null, response);
  }

  turnOnMultiple(call, callback) {
    console.log("Turning on multiple lights...");

    let turnedOnCount = 0;

    call.on('data', ({ id }) => {
      const light = this.findLight(id);

      if (light) {
        console.log(`turned on light ${id}`);
        light.isOn = true;
        turnedOnCount++;
      }

    });

    call.on('end', (light) => {
      console.log("Finshed turning on lights");
      console.log("Updated status on lights: ", this.lights);

      const response = {
        lightsTurnedOn: turnedOnCount,
        totalLightsOn: this.lights.filter(l => l.isOn).length
      }

      callback(null, response);
    });
  }

  turnOffMultiple(call, callback) {
    console.log("Turning off multiple lights...");

    let turnedOffCount = 0;

    call.on('data', ({ id }) => {
      const light = this.findLight(id);

      if (light) {
        console.log(`turned of light ${id}`);
        light.isOn = false;
        turnedOffCount++;
      }

    });

    call.on('end', () => {
      console.log("Finshed turning off lights");
      console.log("Updated status off lights: ", this.lights);

      callback(null, {
        lightsTurnedOff: turnedOffCount,
        totalLightsOff: this.lights.filter(l => !l.isOn).length
      })
    });
  }
}
