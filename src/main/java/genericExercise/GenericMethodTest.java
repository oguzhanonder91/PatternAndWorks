package genericExercise;

/**
 * Created by oguzhanonder on 10/02/17.
 */
public class GenericMethodTest {
    public static <E> void printOutArray(E[] inputArray){
        for (E e : inputArray) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'M', 'E', 'R', 'H', 'A' ,'B','A'};

        System.out.println("İnteger dizi");
        printOutArray(intArray);

        System.out.println("\nDouble Dizi:");
        printOutArray(doubleArray);

        System.out.println("\nChar Dizi:");
        printOutArray(charArray);
    }
}
