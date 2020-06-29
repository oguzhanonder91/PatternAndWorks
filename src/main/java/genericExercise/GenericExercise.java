package genericExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oguzhanonder on 21/02/17.
 */
public class GenericExercise<T> {

    private List<T> list = new ArrayList<T>();

    private  T t ;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <T> void getWriteData(List<T> tList){
        for (T t1 : tList) {
            System.out.println(t1);
        }
    }


    public static void main(String[] args) {
        GenericExercise integer = new GenericExercise<Integer>();
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(0);
        integers.add(1);
        integer.setList(integers);
        integer.setT("Gerdan");


        GenericExercise string = new GenericExercise<String>();
        List<String> strings = new ArrayList<String>();
        strings.add("aaaaaa");
        strings.add("bbbbb");
        string.setT(10);
        string.setList(strings);


        integer.getWriteData(integers);
        string.getWriteData(strings);

        System.out.println(integer.getT());
        System.out.println(string.getT());

    }
}
