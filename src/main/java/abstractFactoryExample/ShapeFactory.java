package abstractFactoryExample;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        if(type.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(type.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else {
            return null;
        }
    }
}
