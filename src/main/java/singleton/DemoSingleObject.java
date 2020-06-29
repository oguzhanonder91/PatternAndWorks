package singleton;

/**
 * Created by oguzhanonder on 25/10/16.
 */
public class DemoSingleObject {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
