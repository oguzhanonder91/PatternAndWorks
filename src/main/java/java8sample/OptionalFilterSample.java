package java8sample;

import java.util.Optional;

/**
 * Created by oguzhanonder on 05/07/17.
 */
public class OptionalFilterSample {
    public static void main(String[] args) {
        String message = "gerdan";
        Optional<String> opt = Optional.ofNullable(message);
            opt
                .filter(m -> m.length() > 5)
                .ifPresent(System.out::println);
    }
}
