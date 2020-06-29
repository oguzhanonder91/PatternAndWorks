package java8sample;

import java.util.Arrays;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList();
        List<String> filtered = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) ->x).summaryStatistics();
        System.out.println(stats);


        System.out.println(new Date(System.currentTimeMillis()));
        List<Integer> numbersExample = Arrays.asList(3, 2, 2, 3, 7, 3, 5,4,5,2,4,5,6,56,45,34,345,653,4535,546,3);
        System.out.println(numbersExample.stream().mapToInt(i->i).sum());
        System.out.println(numbersExample.stream().mapToInt(i->i+1).sum());
        System.out.println(new Date(System.currentTimeMillis()));

        /*System.out.println(new Date(System.currentTimeMillis()));
        int total = 0 ;
        int totalExample =0;
        for (Integer integer : numbersExample) {
            total = total +integer;
            totalExample = totalExample + integer +1;
        }
        System.out.println(total);
        System.out.println(totalExample);
        System.out.println(new Date(System.currentTimeMillis()));*/

    }
}
