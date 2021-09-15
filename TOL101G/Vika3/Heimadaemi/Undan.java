/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Undan {
    public static void main(String[] args) {
        int d1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int ar1 = Integer.parseInt(args[2]);
        int d2 = Integer.parseInt(args[3]);
        int m2 = Integer.parseInt(args[4]);
        int ar2 = Integer.parseInt(args[5]);

        boolean h = (d1 <= d2 || m1 <= m2 || ar1 <= ar2);

        System.out.println("Fyrri dagsetningin er á undan seinni:" + h);
    }
}
