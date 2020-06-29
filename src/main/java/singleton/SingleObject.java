package singleton;

/**
 * Created by oguzhanonder on 25/10/16.
 */
public class SingleObject {

    private static  SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Merhaba Dünya");
    }
}
