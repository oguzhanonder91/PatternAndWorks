package FacadePattern;

public class TestMainClass {
    public static void main(String[] args) {
        FacadeFactory.getInstance().getFacadeImpl().doSomething();
    }
}
