package abstractfactory;

import factory.*;

/**
 * Created by oguzhanonder on 26/10/16.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory  sekilFactory= FactoryProducer.getFactory("sekil");
        Sekil sekil= sekilFactory.getSekil("Daire");
        sekil.draw();

        AbstractFactory renkFactory = FactoryProducer.getFactory("renk");
        Renk renk = renkFactory.getRenk("Yesil");
        renk.renkNe();
    }
}
