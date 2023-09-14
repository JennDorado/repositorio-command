package commands;

import devices.ElectronicDevices;

public class TurnOnTelevision implements Command {

    private ElectronicDevices device;

    public TurnOnTelevision(ElectronicDevices device) {
        this.device = device;

    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        device.on();

    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        device.off();
    }

}
