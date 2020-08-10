package polymorphism;

public class Dog  extends Animal{

    private String type;

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
