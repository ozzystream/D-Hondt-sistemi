import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IL_Sonuc_Hesaplayici {
    public static void il_sonuclari_hesapla(IL_Sonuclari il_sonuclari){
        System.out.println("İldeki toplam oy sayısı:" + il_sonuclari.getIl().getToplam_secmen_sayisi());
        System.out.println("İldeki toplam geçerli oy sayısı:" + il_sonuclari.getToplam_gecerli_oy_sayisi());
        System.out.println("-----------------------------------------------------");
        Integer index=0;
        Katilimci bolumde_ilk_gelen_katilimci=null;
        Integer milletvekili_sayisi_count = 0;
        Integer milletvekili_sayisi=il_sonuclari.getIl_milletvekili_sayisi();
        for(int i=0;i<milletvekili_sayisi;i++){
            Collections.sort(il_sonuclari.getPartiVeBagimsizList(), Comparator.comparingDouble(Katilimci::getBolunen_oy_sayisi));
            index=il_sonuclari.getPartiVeBagimsizList().size()-1;
            bolumde_ilk_gelen_katilimci=  il_sonuclari.getPartiVeBagimsizList().get(index);
            milletvekili_sayisi_count = bolumde_ilk_gelen_katilimci.getKazanilan_milletevekili_sayisi();
            Float bolunen_oy_sayisi = (float) bolumde_ilk_gelen_katilimci.getOy_sayisi() / ++milletvekili_sayisi_count;
            bolumde_ilk_gelen_katilimci.setBolunen_oy_sayisi(bolunen_oy_sayisi);
            bolumde_ilk_gelen_katilimci.setKazanilan_milletevekili_sayisi(milletvekili_sayisi_count);
        }
        ilSonucunuGor(il_sonuclari);
    }
    public static void ilSonucunuGor(IL_Sonuclari il_sonuclari){
        Collections.sort(il_sonuclari.getPartiVeBagimsizList(), Comparator.comparingDouble(Katilimci::getOy_sayisi));
        List<Katilimci> katilimciList=il_sonuclari.getPartiVeBagimsizList();
        int index=katilimciList.size()-1;
        int siralama=1;
        String aciklama="";
        Katilimci katilimci=null;
        while(index>=0){
            katilimci = katilimciList.get(index);
            if(katilimci instanceof BagimsizAday){
                aciklama = siralama + ". Bagimsiz Aday" + " " + ((BagimsizAday) katilimci).getAd_soyad() + " "
                        + katilimci.getOy_sayisi() + " "
                        + katilimci.getKazanilan_milletevekili_sayisi() + " "
                        + katilimci.getOy_orani();
            }
            else if(katilimci instanceof Parti){
                aciklama = siralama + ". Parti" + " " + ((Parti) katilimci).getAd() + " "
                        + katilimci.getOy_sayisi() + " "
                        + katilimci.getKazanilan_milletevekili_sayisi() + " "
                        + katilimci.getOy_orani();
            }
            System.out.println(aciklama);
            index--;
            siralama++;
        }
    }
}
