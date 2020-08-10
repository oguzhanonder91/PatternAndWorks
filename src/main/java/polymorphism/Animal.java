package polymorphism;

public class Animal {
    private int age;

    public void eat(){
        System.out.println("Animal eat");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
