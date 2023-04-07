import java.util.List;

public class IL_Sonuclari {
    private List<Katilimci> partiVeBagimsizList;
    private IL il;
    public static Integer toplam_gecerli_oy_sayisi;
    private Integer il_milletvekili_sayisi;
    public IL_Sonuclari(List<Katilimci> partiVeBagimsizList, IL il, Integer toplam_gecerli_oy_sayisi, Integer il_milletvekili_sayisi) {
        this.partiVeBagimsizList = partiVeBagimsizList;
        this.il = il;
        this.toplam_gecerli_oy_sayisi = toplam_gecerli_oy_sayisi;
        this.il_milletvekili_sayisi = il_milletvekili_sayisi;
    }

    public List<Katilimci> getPartiVeBagimsizList() {
        return partiVeBagimsizList;
    }

    public IL getIl() {
        return il;
    }

    public Integer getToplam_gecerli_oy_sayisi() {
        return toplam_gecerli_oy_sayisi;
    }

    public Integer getIl_milletvekili_sayisi() {
        return il_milletvekili_sayisi;
    }

    public void setPartiVeBagimsizList(List<Katilimci> partiVeBagimsizList) {
        this.partiVeBagimsizList = partiVeBagimsizList;
    }

    public void setIl(IL il) {
        this.il = il;
    }

    public void setToplam_gecerli_oy_sayisi(Integer toplam_gecerli_oy_sayisi) {
        this.toplam_gecerli_oy_sayisi = toplam_gecerli_oy_sayisi;
    }

    public void setIl_milletvekili_sayisi(Integer il_milletvekili_sayisi) {
        this.il_milletvekili_sayisi = il_milletvekili_sayisi;
    }
}
