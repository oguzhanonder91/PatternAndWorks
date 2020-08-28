package abstactFactory2;

public class Pc extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Pc(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    String getRam() {
        return this.ram;
    }

    @Override
    String getHdd() {
        return this.hdd;
    }

    @Override
    String getCpu() {
        return this.cpu;
    }
}
