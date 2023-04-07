import java.util.ArrayList;
import java.util.List;

public class VeriBesleme {
    public static IL_Sonuclari doldur(){

        IL il =new IL(1L, "82", "GÜZEL İLİMİZ", 1500000);
        Katilimci katilimci_1=new Parti(1L, il, 420000, "A PARTİSİ");
        Katilimci katilimci_2=new Parti(2L, il, 450000, "B PARTİSİ");
        Katilimci katilimci_3=new Parti(3L, il, 240000, "C PARTİSİ");
        Katilimci katilimci_4=new Parti(4L, il, 60000, "D PARTİSİ");
        Katilimci katilimci_5=new BagimsizAday(5L, il, 20000, "Mahmut BAĞIMSIZ", "1111111111");

        List<Katilimci> katilimciList = new ArrayList<>();
        katilimciList.add(katilimci_1);
        katilimciList.add(katilimci_2);
        katilimciList.add(katilimci_3);
        katilimciList.add(katilimci_4);
        katilimciList.add(katilimci_5);

        IL_Sonuclari guzel_ilimizin_sonuclari=new IL_Sonuclari(katilimciList, il, 1200000, 14);
        return guzel_ilimizin_sonuclari;
    }
}
