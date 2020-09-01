package compositPattern;

import java.math.BigDecimal;
import java.util.List;

public class Util {

    public static BigDecimal urunlerinFiyati(List<Urun> urunList){
        BigDecimal toplam = BigDecimal.ZERO;
        for ( Urun urun: urunList) {
            toplam = toplam.add(urun.fiyatHesapla());
        }

        return toplam;
    }

    public static BigDecimal paketFiyati(List<Paket> pakets){
        BigDecimal toplam = BigDecimal.ZERO;
        for (Paket paket: pakets) {
            toplam = toplam.add(paket.fiyatHesapla());
        }

        return toplam;
    }
}
