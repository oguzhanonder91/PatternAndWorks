package abstactFactory2;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
       return computerAbstractFactory.createComputer();
    }

}
