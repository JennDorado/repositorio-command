package commands;

import devices.ElectronicDevices;

public class VolumeDownRadio implements Command {

    private ElectronicDevices device;

    public VolumeDownRadio(ElectronicDevices device) {
        this.device = device;

    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        device.volumeDown();

    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        device.volumeUp();
    }

}
