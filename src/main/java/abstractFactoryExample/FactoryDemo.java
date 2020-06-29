package abstractFactoryExample;

public class FactoryDemo {
    public static void main(String[] args) {
        AbstractFactory roundedFactory = FactoryProducer.getFactory("ROUNDED");
        Shape roundedRectangle = roundedFactory.getShape("RECTANGLE");
        Shape roundedSquare = roundedFactory.getShape("SQUARE");
        roundedRectangle.draw();
        roundedSquare.draw();

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape  normalRectangle =shapeFactory.getShape("RECTANGLE");
        Shape  normalSquare =shapeFactory.getShape("SQUARE");
        normalRectangle.draw();
        normalSquare.draw();
    }
}
