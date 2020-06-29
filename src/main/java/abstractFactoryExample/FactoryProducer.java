package abstractFactoryExample;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("ROUNDED")){
            return new RoundedFactory();
        }else if(type.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else{
            return null;
        }
    }

}
