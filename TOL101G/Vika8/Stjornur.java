/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : kallar á stjarna sem prentar út eins margar stjörnur og er sett þegar þú keyrir foritið
 *
 *
 *****************************************************************************/

public class Stjornur {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        stjarna(x);

    }

    public static void stjarna(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }


}
