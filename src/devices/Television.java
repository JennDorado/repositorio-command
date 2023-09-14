package devices;

public class Television implements ElectronicDevices {
    private int volume = 0;
    private String marca;

    public Television(String marca) {
        this.marca = marca;
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println(marca + "Television is on");
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println(marca + "Television is off");
    }

    @Override
    public void volumeUp() {
        // TODO Auto-generated method stub
        volume++;
        System.out.println(marca + "Television Volume at: '" + volume);
    }

    @Override
    public void volumeDown() {
        // TODO Auto-generated method stub
        volume--;
        System.out.println(marca + "Television Volume at: '" + volume);

    }
}
