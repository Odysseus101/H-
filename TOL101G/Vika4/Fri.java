/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Fri {
    public static void main(String[] args) {
        String dagur = args[0];

        if (dagur.equals("M") || dagur.equals("Þ") || dagur.equals("I") || dagur.equals("F")
                || dagur.equals("Ö")) {
            System.out.println("Virkur dagur");
        }
        if (dagur.equals("L") || dagur.equals("S")) {
            System.out.println("Helgi");
        }
    }
}
