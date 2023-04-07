public class Parti extends Katilimci{
    private String ad;
    public Parti(Long id, IL il, Integer oy_sayisi, String ad) {
        super(id, il, oy_sayisi);
        this.ad = ad;
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
