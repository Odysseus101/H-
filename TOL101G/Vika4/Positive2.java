/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Positive2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        try {
            if (a >= 0 && b >= 0) {
                System.out.println("Báðar jákvæðar");
            }
            else if (a < 0 && b < 0) {
                System.out.println("Hvorug jákvæð");
            }
            else {
                System.out.println("Önnur jákvæð");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Ekki heiltala");
        }
    }
}

