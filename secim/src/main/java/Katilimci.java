public class Katilimci {
    private Long id;
    private IL il;
    private Integer oy_sayisi;
    private Float bolunen_oy_sayisi;
    private Integer kazanilan_milletevekili_sayisi;
    private Float oy_orani;
    public Katilimci(Long id, IL il, Integer oy_sayisi){
        this.id = id;
        this.il = il;
        this.oy_sayisi = oy_sayisi;
        this.bolunen_oy_sayisi = Float.valueOf(oy_sayisi);
        this.kazanilan_milletevekili_sayisi = 0;
    }

    public Long getId() {
        return id;
    }

    public IL getIl() {
        return il;
    }

    public Integer getOy_sayisi() {
        return oy_sayisi;
    }

    public Float getBolunen_oy_sayisi() {
        return bolunen_oy_sayisi;
    }

    public Integer getKazanilan_milletevekili_sayisi() {
        return kazanilan_milletevekili_sayisi;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setIl(IL il) {
        this.il = il;
    }

    public void setOy_sayisi(Integer oy_sayisi) {
        this.oy_sayisi = oy_sayisi;
    }

    public void setBolunen_oy_sayisi(Float bolunen_oy_sayisi) {
        this.bolunen_oy_sayisi = bolunen_oy_sayisi;
    }

    public void setKazanilan_milletevekili_sayisi(Integer kazanilan_milletevekili_sayisi) {
        if(!(this instanceof BagimsizAday)){
            this.kazanilan_milletevekili_sayisi=kazanilan_milletevekili_sayisi;
        }
        else {
            this.kazanilan_milletevekili_sayisi = 1;
        }
    }

    public Float getOy_orani() {
        oy_orani =  oy_sayisi/ (float) IL_Sonuclari.toplam_gecerli_oy_sayisi;
        oy_orani *=100;
        return oy_orani;
    }

    public void setOy_orani(Float oy_orani) {
        this.oy_orani = oy_orani;
    }
}
