package prototypePattern;

/**
 * Created by oguzhanonder on 28/10/16.
 */
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Square :: draw() method.");
    }

    public Square(){
        type = "Square";
    }
}
