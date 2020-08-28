package prototypePattern2;

public class Belge implements Cloneable {

    private long id;

    private String ad;

    private BelgeTuru belgeTuru;

    private Kategori kategori;

    private String veri;

    public Belge(long id, String ad, BelgeTuru belgeTuru, Kategori kategori, String veri) {
        this.id = id;
        this.ad = ad;
        this.belgeTuru = belgeTuru;
        this.kategori = kategori;
        this.veri = veri;
    }

    public Belge() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public BelgeTuru getBelgeTuru() {
        return belgeTuru;
    }

    public void setBelgeTuru(BelgeTuru belgeTuru) {
        this.belgeTuru = belgeTuru;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getVeri() {
        return veri;
    }

    public void setVeri(String veri) {
        this.veri = veri;
    }

    @Override
    public String toString() {
        return "Belge{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", belgeTuru=" + belgeTuru +
                ", kategori=" + kategori +
                ", veri='" + veri + '\'' +
                '}';
    }

    /*
    * Shallow Copy
    *   @Override
    protected Belge clone() throws CloneNotSupportedException {
        return (Belge)super.clone();
    }
    *
    * */

    @Override
    protected Belge clone() throws CloneNotSupportedException {
        Belge belge = (Belge) super.clone();
        BelgeTuru belgeTuru = belge.getBelgeTuru().clone();
        Kategori kategori = belge.getKategori().clone();

        belge.setKategori(kategori);
        belge.setBelgeTuru(belgeTuru);
        return belge;
    }
}
