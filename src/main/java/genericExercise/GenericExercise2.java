package genericExercise;

import java.util.Comparator;

/**
 * Created by oguzhanonder on 13/02/17.
 */
public class GenericExercise2 {

    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;

        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println("Sıralama Denemesi:" +maximum(6,2,9));
        System.out.println("Sıralama Denemesi:" +maximum(6.9,2.0,0.1));
        System.out.println("Sıralama Denemesi:" +maximum("baba","anne","kardeş"));

    }
}
