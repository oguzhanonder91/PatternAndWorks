package abstractfactory;

/**
 * Created by oguzhanonder on 26/10/16.
 */
public class RenkFactory extends AbstractFactory {
    @Override
    Renk getRenk(String color) {
        if(color.equals("Yesil")){
            return new Yesil();
        }else if(color.equals("Mavi")){
            return new Mavi();
        }else{
            return null;
        }
    }

    @Override
    Sekil getSekil(String shape) {
        return null;
    }
}
