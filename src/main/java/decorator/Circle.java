package decorator;

/**
 * Created by oguzhanonder on 18/10/16.
 */
public class Circle implements Shape {

    private int width;
    @Override
    public void draw() {
        System.out.println("Shape: Daire");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
