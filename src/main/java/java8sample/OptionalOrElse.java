package java8sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by oguzhanonder on 05/07/17.
 */



/*
* orElse metodu daha çok ternary (üçlü) şart ihtiyacı olduğu durumlarda ihtiyaç duyulabilir. Daha akıcı bir geliştirim deneyimi sunar.
*
*orElseGet - Varsa al, yoksa üret
Bu metod orElse metoduna çok benzer, fakat orElseGet metod parametresi olarak Supplier fonksiyonel arayüzü türünden nesne kabul eder.


orElseThrow - Varsa al, yoksa fırlat
Optional nesnesi bir değeri içeriyorsa (null olmayan) o değeri döndürür, null ise de sağlanan istisna nesnesini fırlatır. orElseThrow metodu Supplier türünden bir nesne kabul eder.
* */
public class OptionalOrElse {
    public static void main(String[] args) {
        Integer numara = null;
        Optional<Integer> opt = Optional.ofNullable(numara);
        int result = opt.orElse(0);
        System.out.println(result);


        List<String> names = Arrays.asList("Ali","Veli","Selami");
        Optional<List<String>> optList = Optional.ofNullable(names);
        names = optList.orElseGet(()-> new ArrayList());
        names = optList.orElseGet(ArrayList::new);
        System.out.println(names);


        Integer numara1 = null;
        Optional<Integer> optNumber = Optional.ofNullable(numara1);
        int result1 = optNumber.orElseThrow(RuntimeException::new);
        System.out.println(result1);

    }
}
