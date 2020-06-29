package decorator;

import java.io.IOException;

/**
 * Created by oguzhanonder on 18/10/16.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Daire şuan normal border");
        circle.draw();
        System.out.println(new Circle().getWidth());

        System.out.println("\nDaire şuan kırmızı border");
        redCircle.draw();

        System.out.println("\nDikdörtgen kırmızı border");
        redRectangle.draw();


    }
}
