package genericExercise;

/**
 * Created by oguzhanonder - 11.06.2018
 */

 enum Tipler{
    YABANCI,
    YERLI
}

class Kisi<KisiTip>{
    String ad;
    String soyad;
    KisiTip enumField;

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", enumField=" + enumField +
                '}';
    }
}

class Adres<AdresTip>{
    String il;
    String ilce;
    AdresTip adresTip;

    @Override
    public String toString() {
        return "Adres{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", adresTip=" + adresTip +
                '}';
    }
}

public class GenericExercise4 {
    public static <Tip> void  yazdir(Tip tip){
        System.out.println(tip.toString());
    }

    public static void main(String[] args) {
        Kisi kisi = new Kisi();
        kisi.ad="Ahmet";
        kisi.soyad = "Cebe";
        kisi.enumField=Tipler.YERLI;
        yazdir(kisi);

        Adres adres = new Adres();
        adres.adresTip = "Yukarı Günlüce Köyü";
        adres.il="Ardahan";
        adres.ilce="Posof";
        yazdir(adres);
    }
}
