package compositPattern;

import java.math.BigDecimal;

public class Urun implements FiyatApi{
    private String ad;
    private BigDecimal tutar;

    @Override
    public BigDecimal fiyatHesapla() {
        return tutar;
    }

    public Urun(String ad, BigDecimal tutar) {
        this.ad = ad;
        this.tutar = tutar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public BigDecimal getTutar() {
        return tutar;
    }

    public void setTutar(BigDecimal tutar) {
        this.tutar = tutar;
    }
}
