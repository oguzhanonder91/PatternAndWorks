package prototypePattern;

/**
 * Created by oguzhanonder on 28/10/16.
 */
public class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Inside Circle :: draw() method.");
    }

    public Circle(){
        type = "Circle";
    }
}
