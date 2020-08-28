package prototypePattern2;

public class Kategori implements Cloneable {

    private long id ;

    private String ad;

    public Kategori(long id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public Kategori() {
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

    @Override
    public String toString() {
        return "Kategori{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }

    @Override
    protected Kategori clone() throws CloneNotSupportedException {
        return (Kategori) super.clone();
    }
}
