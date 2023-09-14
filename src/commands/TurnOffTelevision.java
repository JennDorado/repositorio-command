package commands;

import devices.ElectronicDevices;

public class TurnOffTelevision implements Command {

    private ElectronicDevices device;

    public TurnOffTelevision(ElectronicDevices device) {
        this.device = device;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        device.off();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        device.on();
    }
}
