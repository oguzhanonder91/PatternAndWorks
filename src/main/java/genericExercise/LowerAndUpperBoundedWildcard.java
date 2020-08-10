package genericExercise;

import java.util.ArrayList;
import java.util.List;

/*
Wildcard ifadeler önceden T,K,V gibi isimlendirmelerin yerine ? ile ifade edilir. Bilinmeyen tip anlamına gelir. Wildcard’lar 3'e ayrılır.
Unbounded, Upper Bounded ve Lower Bounded.

Unbounded Wildcard
Kalıtım ile sınırlandırılmamış wildcard anlamına gelir. Tipini bilmediğimiz verileri okumak için kullanılır.

Bounded Wildcard
Kalıtım ile sınırlandırılmış olan wildcard anlamına gelir. Kendi içinde ikiye ayrılır. Upper Bounded ve Lower Bounded.

Lower Bounded Wildcard
Kalıtım yapısını super anahtar kelimesi ile kullanır. Listeye ekleme yapıldığı zaman kullanırız.

Upper Bounded Wildcard
Kalıtım yapısını extends anahtar kelimesi ile kullanır. Listeden okuma yapıldığı zaman kullanırız.
 */

public class LowerAndUpperBoundedWildcard {

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(18);
        numbers.add(2.90);
        numbers.add(310l);
        addNumbersLowerBounded(numbers);
        showValuesUpperBounded(numbers);
    }

    public static void addNumbersLowerBounded (List<? super Number> list){
        for (int i = 0; i < 10 ; i++) {
            list.add(i);
        }
        System.out.println(list.size());
    }

    public static void showValuesUpperBounded(List<? extends Number> list){
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
