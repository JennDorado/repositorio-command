package commands;

import devices.ElectronicDevices;

public class TurnOnRadio implements Command {

    private ElectronicDevices device;

    public TurnOnRadio(ElectronicDevices device) {
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
