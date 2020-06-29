package factory;

/**
 * Created by oguzhanonder on 26/10/16.
 */
public class SekilDemo {
    public static void main(String[] args) {
        SekilFactory sekilFactory = new SekilFactory();

        Sekil daire = sekilFactory.getSekil("Daire");
        Sekil kare = sekilFactory.getSekil("Kare");
        Sekil dikdortgen = sekilFactory.getSekil("Dikdortgen");

        daire.draw();
        kare.draw();
        dikdortgen.draw();
    }
}
