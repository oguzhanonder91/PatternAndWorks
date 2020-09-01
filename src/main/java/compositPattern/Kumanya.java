package compositPattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements FiyatApi{

    private String ad;

    private List<Paket> pakets;

    private List<Urun> uruns;

    public Kumanya(String ad) {
        this.ad = ad;
        uruns = new ArrayList<>();
        pakets = new ArrayList<>();
    }

    @Override
    public BigDecimal fiyatHesapla() {
        BigDecimal toplam = BigDecimal.ZERO;
        toplam = toplam.add(Util.urunlerinFiyati(uruns));
        toplam = toplam.add(Util.paketFiyati(pakets));

        return toplam;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Paket> getPakets() {
        return pakets;
    }

    public void setPakets(List<Paket> pakets) {
        this.pakets = pakets;
    }

    public List<Urun> getUruns() {
        return uruns;
    }

    public void setUruns(List<Urun> uruns) {
        this.uruns = uruns;
    }
}
