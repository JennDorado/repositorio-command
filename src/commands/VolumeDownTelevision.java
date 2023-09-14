package commands;

import devices.ElectronicDevices;

public class VolumeDownTelevision implements Command {
    private ElectronicDevices device;

    public VolumeDownTelevision(ElectronicDevices device) {
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
