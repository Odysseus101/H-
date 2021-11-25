/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class InnanMarka {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            if (num <= 10 && num >= 5) {
                System.out.println("Innan marka");
            }
            else {
                System.out.println("Utan marka");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Ekki heiltala");
        }
    }
}
