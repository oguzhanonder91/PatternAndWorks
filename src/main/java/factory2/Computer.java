package factory2;

public abstract class Computer {

    abstract String getRam();
    abstract String getHdd();
    abstract String getCpu();

    @Override
    public String toString() {
        return "Ram = " + this.getRam() + ", Hdd = " + this.getHdd() + ", Cpu =  " + this.getCpu();
    }
}
