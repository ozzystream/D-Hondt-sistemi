public class BagimsizAday extends Katilimci{
    private String ad_soyad;
    private String tckn;
    public BagimsizAday(Long id, IL il, Integer oy_sayisi, String ad_soyad, String tckn) {
        super(id, il, oy_sayisi);
        this.ad_soyad = ad_soyad;
        this.tckn = tckn;
    }
    public String getAd_soyad() {
        return ad_soyad;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }
}
