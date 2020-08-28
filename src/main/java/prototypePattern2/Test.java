package prototypePattern2;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Simule simule = new Simule();

        Date ilkTarih = new Date();
        Belge belge = simule.findBelgeById(1);
        saniyeFarkiVeBelgeYazdir(ilkTarih,belge);

        Date ilkTarih2 = new Date();
        Belge belge2 = simule.findBelgeById(2);
        saniyeFarkiVeBelgeYazdir(ilkTarih2,belge2);


        Date ilkTarih3 = new Date();
        Belge belgeClone = null;
        try {
            belgeClone = belge.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        belgeClone.setAd("Günlük");
        belgeClone.setVeri("Sevgili Günlük");
        belgeClone.getBelgeTuru().setAd("KİŞİSEL 2");
        saniyeFarkiVeBelgeYazdir(ilkTarih3, belgeClone);

        System.out.println(belge);


    }

    private static  long saniyeFarkiVeBelgeYazdir(Date ilkTarih , Belge belge){
        Date sonTarih = new Date();
        long fark = (sonTarih.getTime() / 1000 ) - (ilkTarih.getTime()/1000);

        System.out.println(belge);
        System.out.println("Fark :  "+ fark);
        System.out.println("--------------------------------------");

        return fark;
    }
}
