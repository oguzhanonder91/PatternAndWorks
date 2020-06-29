package factory;

/**
 * Created by oguzhanonder on 26/10/16.
 */
public class SekilFactory {

    public Sekil getSekil(String type){
        if(type.equals("Daire")){
            return new Daire();
        }else if(type.equals("Kare")){
            return  new Kare();
        }else if(type.equals("Dikdortgen")){
            return new Dikdortgen();
        }else{
            return null;
        }
    }
}
