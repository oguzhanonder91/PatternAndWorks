package bridgePattern;

public class GreenCircle implements DrawApi {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Drawing green circle : " + radius + "," + x + "," + y);
    }
}
