package abstractfactory;

import factory.*;

/**
 * Created by oguzhanonder on 26/10/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equals("sekil")){
            return new SekilFactory();
        }else if(choice.equals("renk")){
            return new RenkFactory();
        }else{
            return null;
        }
    }
}
