public class IL {
    private Long id;
    private String plaka_no;
    private String ad;
    private Integer toplam_secmen_sayisi;
    public IL(Long id, String plaka_no, String ad, Integer toplam_secmen_sayisi) {
        this.id = id;
        this.plaka_no = plaka_no;
        this.ad = ad;
        this.toplam_secmen_sayisi = toplam_secmen_sayisi;
    }

    public Long getId() {
        return id;
    }

    public String getPlaka_no() {
        return plaka_no;
    }

    public String getAd() {
        return ad;
    }

    public Integer getToplam_secmen_sayisi() {
        return toplam_secmen_sayisi;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlaka_no(String plaka_no) {
        this.plaka_no = plaka_no;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setToplam_secmen_sayisi(Integer toplam_secmen_sayisi) {
        this.toplam_secmen_sayisi = toplam_secmen_sayisi;
    }
}
