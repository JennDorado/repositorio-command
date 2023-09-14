package commands;

import devices.ElectronicDevices;

public class VolumeUpRadio implements Command {

    private ElectronicDevices device;

    public VolumeUpRadio(ElectronicDevices device) {
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
