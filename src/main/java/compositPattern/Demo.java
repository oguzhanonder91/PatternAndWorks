package compositPattern;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {

        Urun domates = new Urun("Domates", BigDecimal.TEN);
        Urun patates = new Urun("Patates" , BigDecimal.valueOf(12));
        Urun sogan = new Urun("Sogan",BigDecimal.valueOf(5));

        Paket paket = new Paket("Akşam Paketi");
        paket.getUruns().add(domates);
        paket.getUruns().add(patates);
        paket.getUruns().add(sogan);

        Urun laptop = new Urun("Laptop",BigDecimal.valueOf(2500));


        Urun yag = new Urun("Yağ",BigDecimal.valueOf(25));

        Kumanya kumanya = new Kumanya("Ramazan Kumanyası");
        kumanya.getPakets().add(paket);
        kumanya.getUruns().add(yag);

        Sepet sepet = new Sepet("Benim Sepetim");

        sepet.getFiyatApis().add(paket);
        sepet.getFiyatApis().add(laptop);
        sepet.getFiyatApis().add(kumanya);

        System.out.println("Toplam Ödenecek Tutar :  " + sepet.toplamOdenecekTutar());

    }
}
