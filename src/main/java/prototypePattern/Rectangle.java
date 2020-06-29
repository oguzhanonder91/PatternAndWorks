package prototypePattern;

/**
 * Created by oguzhanonder on 28/10/16.
 */
public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Rectangle : : draw() method.");
    }

    public Rectangle(){
        type="Rectangle";
    }
}
