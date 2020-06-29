package builderPattern;

/**
 * Created by oguzhanonder on 27/10/16.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
