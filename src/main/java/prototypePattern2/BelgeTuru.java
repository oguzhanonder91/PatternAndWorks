package prototypePattern2;

public class BelgeTuru implements Cloneable {

    private long id;

    private String ad ;

    public BelgeTuru() {
    }

    public BelgeTuru(long id, String ad) {
        this.id = id;
        this.ad = ad;
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
        return "BelgeTuru{" +
                "id=" + id +
                " , ad='" + ad + '\'' +
                '}';
    }

    @Override
    protected BelgeTuru clone() throws CloneNotSupportedException {
        return (BelgeTuru) super.clone();
    }
}
