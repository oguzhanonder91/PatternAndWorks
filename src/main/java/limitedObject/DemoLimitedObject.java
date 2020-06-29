package limitedObject;

/**
 * Created by oguzhanonder on 25/10/16.
 */
public class DemoLimitedObject {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            LimitedNewObject l = LimitedNewObject.getInstance();
            System.out.println(i+".nesne oluştu: " +l);
        }
        LimitedNewObject.a=0;
    }
}
