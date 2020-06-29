package abstractfactory;

/**
 * Created by oguzhanonder on 26/10/16.
 */
public class SekilFactory extends AbstractFactory {
    @Override
    Renk getRenk(String color) {
        return null;
    }

    @Override
    Sekil getSekil(String shape) {
        if(shape.equals("Daire")){
            return new Daire();
        }else if(shape.equals("Kare")){
            return new Kare();
        }else if(shape.equals("Dikdortgen")){
            return new Dikdortgen();
        }else{
            return null;
        }
    }
}
