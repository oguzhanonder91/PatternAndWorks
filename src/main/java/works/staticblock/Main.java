package works.staticblock;

public class Main {

    static {
        System.out.println("Static block");
    }
    {
        System.out.println("non static");
    }

    public Main() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Main main2 = new Main();
    }
}
