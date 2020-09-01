package bridgePattern;

public class Demo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(new RedCircle(),3,5,7);
        redCircle.draw();

        Circle greenCircle= new Circle(new GreenCircle(),8,9,3);
        greenCircle.draw();
    }
}
