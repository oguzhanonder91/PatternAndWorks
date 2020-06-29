package abstractfactory;

/**
 * Created by oguzhanonder on 26/10/16.
 */
public abstract class AbstractFactory {

    abstract Renk getRenk(String color);
    abstract Sekil getSekil(String shape);
}
