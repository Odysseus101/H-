/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Runa {
    public static void main(String[] args) {

        try {
            int tala = Integer.parseInt(args[0]);
            int o = 0;
            
            if (tala < 0) {
                tala = tala * -1;
            }
            for (int i = 0; i < tala; i++) {
                int b = 1 + i;
                int g = tala % b;
                if (g == 0) {
                    System.out.print("1");
                    o++;
                }
                if (g > 0 || g < 0) {
                    System.out.print("0");
                }
            }
            System.out.println();
            System.out.println(o);
        }
        catch (NumberFormatException e) {
            System.out.println("Ólöglegt inntak");
        }
    }
}
