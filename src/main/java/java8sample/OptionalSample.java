package java8sample;

import java.util.Optional;

/**
 * Created by oguzhanonder on 05/07/17.
 */
public class OptionalSample {

    public static void main(String[] args) {
        Integer numara = null;
        Optional<Integer> opt = Optional.ofNullable(numara);
        opt.ifPresent(num -> {
            Double karesi = Math.pow(num , 2);
            System.out.println("Sonuç: " + karesi);
        });


       /* Integer numara = null;
        Optional<Integer> opt = Optional.ofNullable(numara);
        opt
                .map(num->Math.pow(num,2))
                .ifPresent(System.out::println);*/
    }
}
