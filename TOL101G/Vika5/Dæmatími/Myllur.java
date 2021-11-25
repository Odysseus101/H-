/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Myllur {
    public static void main(String[] args) {
        int amount = Integer.parseInt(args[0]);

        System.out.println("Myllurnar");

        if (amount > 0) {
            for (int i = 1; i <= amount; i++) {
                System.out.print(i);
                for (int j = 1; j <= i; j++) {
                    System.out.print("#");
                }
            }
        }

    }
}
