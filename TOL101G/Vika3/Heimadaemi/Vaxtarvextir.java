/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Vaxtarvextir {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double i = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        i = i / 100;

        System.out.println("Vaxtagreiðslan er:" + (p * ((Math.pow((1 + i), n) - 1))));
    }
}
