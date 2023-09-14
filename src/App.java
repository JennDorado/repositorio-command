import java.util.ArrayList;
import java.util.List;

import commands.TurnOffAllDevices;
import commands.TurnOffRadio;
import commands.TurnOffTelevision;
import commands.TurnOnRadio;
import commands.TurnOnTelevision;
import commands.VolumeUpRadio;
import commands.VolumeUpTelevision;
import devices.ElectronicDevices;
import devices.Radio;
import devices.Television;

public class App {
    public static void main(String[] args) throws Exception {
        ElectronicDevices RadioOne = new Radio("LG");

        TurnOnRadio onCommand = new TurnOnRadio(RadioOne);

        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnOffRadio offCommand = new TurnOffRadio(RadioOne);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        VolumeUpRadio volUpCommand = new VolumeUpRadio(RadioOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        ElectronicDevices televisionOne = new Television("SONY");

        TurnOnTelevision prenderCommand = new TurnOnTelevision(televisionOne);

        DeviceButton onTouch;
        onTouch = new DeviceButton(prenderCommand);
        onTouch.press();

        TurnOffTelevision apaCommand = new TurnOffTelevision(televisionOne);
        onTouch = new DeviceButton(apaCommand);
        onTouch.press();

        VolumeUpTelevision volUpCommandTV = new VolumeUpTelevision(televisionOne);
        onTouch = new DeviceButton(volUpCommandTV);
        onTouch.press();
        onTouch.press();
        onTouch.press();

        Television televisionTwo = new Television("Olimpo");
        Radio radioTwo = new Radio("Sonaky");

        List<ElectronicDevices> allDevices = new ArrayList<>();

        allDevices.add(televisionTwo);
        allDevices.add(radioTwo);

        TurnOffAllDevices turnOffAllDevices = new TurnOffAllDevices(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffAllDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();

    }

}
