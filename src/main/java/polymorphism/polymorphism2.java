package polymorphism;

public class polymorphism2 extends b implements c {

    public int age;

    @Override
    public void art() {
        this.age++;
    }

    static void method1() {
        polymorphism2 polymorphism2 = new polymorphism2();
        polymorphism2.age = 5;

        Object o = polymorphism2;
        ((polymorphism2) o).age = 10;
        b b = polymorphism2;

        ((polymorphism2) b).age = 15;

        c c = polymorphism2;
        c.art();

        System.out.println(polymorphism2.age);
        System.out.println(((polymorphism2) c).age);
        System.out.println(((polymorphism2) b).age);
    }


    public static void main(String[] args) {
        method1();
    }
}

class b {

}

interface c {
    void art();
}
