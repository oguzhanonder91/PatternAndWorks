package lambdaSample;

/**
 * Created by oguzhanonder on 04/07/17.
 */
public class FooMain {
    public static void main(String[] args) {
        Foo foo = (x,y) ->(2*x+y);

        int sonuc = foo.apply(3,4);
        System.out.println("Sonuç:" + sonuc);
    }
}
