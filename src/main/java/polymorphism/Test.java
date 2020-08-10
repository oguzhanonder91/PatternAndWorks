package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

        System.out.println("------------------------------");

        Animal dog2 = new Dog();
        Animal cat2 = new Cat();
        test(dog2);
        test(cat2);


        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog2);
        animals.add(animal);

        sample(animals);
        sample(dogs);
    }

    public static  void test (Animal animal){
        animal.eat();
    }

    public static void sample (List<? extends Animal> animals){
        System.out.println("test");
    }
}
