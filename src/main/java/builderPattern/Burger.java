package builderPattern;

/**
 * Created by oguzhanonder on 27/10/16.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
