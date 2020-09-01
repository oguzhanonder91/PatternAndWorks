package compositPattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {

    private String ad;

    private List<FiyatApi> fiyatApis;

    public Sepet(String ad) {
        this.ad = ad;
        fiyatApis = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<FiyatApi> getFiyatApis() {
        return fiyatApis;
    }

    public void setFiyatApis(List<FiyatApi> fiyatApis) {
        this.fiyatApis = fiyatApis;
    }

    public BigDecimal toplamOdenecekTutar(){
        BigDecimal toplam = BigDecimal.ZERO;
        for (FiyatApi fiyatApi:fiyatApis) {
            toplam = toplam.add(fiyatApi.fiyatHesapla());
        }
        return toplam;
    }
}
