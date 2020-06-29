package reflectionExample;

/**
 * Created by oguzhanonder - 11.06.2018
 */
public class ReflectionTest {
    private String s ;

    public ReflectionTest(String s) {
        s="Deneme Reflection";
    }

    public ReflectionTest() {
    }

    public void method1(){
        System.out.println("String : " + s);
    }

    public void method2(int n){
        System.out.println("Numara:" + n);
    }

    private void method3(){
        System.out.println("Private Method invoked");
    }
}
