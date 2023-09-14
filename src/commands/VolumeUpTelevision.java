package commands;

import devices.ElectronicDevices;

public class VolumeUpTelevision implements Command {
    private ElectronicDevices device;

    public VolumeUpTelevision(ElectronicDevices device) {
        this.device = device;

    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        device.volumeUp();

    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        device.volumeDown();

    }

}
