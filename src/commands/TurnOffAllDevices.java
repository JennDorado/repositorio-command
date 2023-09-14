package commands;

import java.util.List;

import devices.ElectronicDevices;

public class TurnOffAllDevices implements Command {
    List<ElectronicDevices> allDevices;

    public TurnOffAllDevices(
            List<ElectronicDevices> newDevices) {
        allDevices = newDevices;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        for (ElectronicDevices device : allDevices)
            device.off();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        for (ElectronicDevices device : allDevices)
            device.on();
    }

}
