package factory2;

public class Test {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","4 GB" , "500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("SERVER","32 GB", "1 TB" , "2.9 GHz");

        System.out.println("Pc info : " + pc );
        System.out.println("Server info : " + server);
    }
}
