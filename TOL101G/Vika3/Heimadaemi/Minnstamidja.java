/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Minnstamidja {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (b < a && b < c)
            System.out.println("miðjustakið af " + a + "," + b + "," + c + " er minnst:true");
        else System.out.println("miðjustakið af " + a + "," + b + "," + c + " er minnst:false");
    }
}
