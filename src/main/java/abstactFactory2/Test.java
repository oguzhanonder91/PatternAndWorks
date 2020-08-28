package abstactFactory2;

public class Test {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(new PcFactory("4 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "1 TB", "2.9 GHz"));

        System.out.println("AbstractFactory PC config : " + pc);
        System.out.println("AbstractFactory Server config : " + server);

    }
}
