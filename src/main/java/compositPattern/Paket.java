package compositPattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Paket implements FiyatApi{
    private String ad;
    private List<Urun> uruns;

    public Paket(String ad) {
        this.ad = ad;
        uruns = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Urun> getUruns() {
        return uruns;
    }

    public void setUruns(List<Urun> uruns) {
        this.uruns = uruns;
    }

    @Override
    public BigDecimal fiyatHesapla() {
        return Util.urunlerinFiyati(uruns);
    }
}
