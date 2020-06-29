package abstractFactoryExample;

public class RoundedFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        if(type.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(type.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }else {
            return null;
        }
    }
}
