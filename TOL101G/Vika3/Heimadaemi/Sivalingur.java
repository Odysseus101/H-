/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : tekur inn tvær komma tölur(radíus og hæð), reiknar út flatarmál og rúmál
 *
 *
 *****************************************************************************/

public class Sivalingur {
    public static void main(String[] args) {
        double x, y;
        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double pi = Math.PI;

        x = (2 * pi * r * (h + r));
        y = (pi * (r * r) * h);

        System.out.println("Flatarmál sívalnings með radíus " + r + " og hæð " + h + " er:" + x);
        System.out.println("Rúmmál sívalnings með radíus " + r + " og hæð " + h + " er:" + y);
    }
}
