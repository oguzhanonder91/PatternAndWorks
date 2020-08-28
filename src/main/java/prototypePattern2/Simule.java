package prototypePattern2;

public class Simule {

    public BelgeTuru findBelgeTuruById(long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BelgeTuru belgeTuru = new BelgeTuru();
        belgeTuru.setId(id);

        String ad ;

        if(id == 1){
            ad = "Kişisel";
        }else if(id == 2){
            ad = "Kurumsal";
        }else{
            ad = "Genel";
        }

        belgeTuru.setAd(ad);
        return  belgeTuru;
    }

    public Kategori findKategoriById(long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Kategori kategori = new Kategori();
        kategori.setId(id);

        String ad ;

        if(id == 1){
            ad = "Özel";
        }else if(id == 2){
            ad = "İş";
        }else{
            ad = "Genel";
        }

        kategori.setAd(ad);
        return  kategori;
    }

    public Belge findBelgeById(long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Belge belge = new Belge();
        belge.setId(id);

        belge.setBelgeTuru(findBelgeTuruById(id));
        belge.setKategori(findKategoriById(id));

        String ad ;
        String veri;

        if(id == 1){
            ad = "Mektup";
            veri = "Sevgili kardeşim";
        }else if(id == 2){
            ad = "Rapor";
            veri = "Personel Raporu.xls";
        }else{
            ad = "Genel";
            veri= "Genel Bilgilendirme";
        }

        belge.setAd(ad);
        belge.setVeri(veri);
        return  belge;
    }
}
