/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Vindur {
    public static void main(String[] args) {
        int vindur = Integer.parseInt(args[0]);
        if (vindur > 31) {
            System.out.println("Ofsaveður");
        }
        if (vindur >= 29 && vindur <= 31) {
            System.out.println("Fárviðri");
        }
        if (vindur >= 24 && vindur <= 28) {
            System.out.println("Rok");
        }
        if (vindur < 24) {
            System.out.println("Annað");
        }
    }
}
