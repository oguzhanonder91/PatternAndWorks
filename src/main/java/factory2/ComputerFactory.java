package factory2;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram , String hdd , String cpu){
        if("PC".equalsIgnoreCase(type)){
            return new Pc(ram,hdd,cpu);
        }else if("SERVER".equalsIgnoreCase(type)){
            return new Server(ram,hdd,cpu);
        }
        return null;
    }
}
