package calisma;

/**
 * Created by oguzhanonder on 16/10/16.
 */
public class Deneme {
    public static void main(String[] args) {
        Leyla leyla = new Leyla();
        Sirin sirin= new Sirin();

        Mecnun mecnun = new Mecnun(leyla);
        mecnun.collereDus();

        Mecnun mecnun1 = new Mecnun(sirin);
        mecnun1.collereDus();


        String s1 = new String("selam");
        String s2 = "selam";
        String s3 ="selam";

        if(s1==s2)
            System.out.println("s1==s2");

        if(s2==s3)
            System.out.println("s2==s3");
    }


}
