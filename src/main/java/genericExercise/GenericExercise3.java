package genericExercise;

/**
 * Created by oguzhanonder on 13/02/17.
 */
public class GenericExercise3<T> {
    private T t;

    public T get() {
        return t;
    }

    public void add(T t){
        this.t=t;
    }

    public static void main(String[] args) {
        GenericExercise3<Integer> integerGenericExercise = new GenericExercise3<Integer>();
        GenericExercise3<String> stringGenericExercise = new GenericExercise3<String>();

        integerGenericExercise.add(3);
        stringGenericExercise.add(new String("Merhaba Dünya"));

        System.out.println("İnteger Deneme"+integerGenericExercise.get());
        System.out.println("String Deneme"+stringGenericExercise.get());
    }
}
