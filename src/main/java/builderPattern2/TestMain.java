package builderPattern2;

public class TestMain {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500","2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.println(computer.toString());
    }
}
