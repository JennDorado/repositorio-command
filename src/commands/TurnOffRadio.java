package commands;

import devices.ElectronicDevices;

public class TurnOffRadio implements Command {

    private ElectronicDevices device;

    public TurnOffRadio(ElectronicDevices device) {
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
