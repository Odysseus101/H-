/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : tekur þrjár heiltölur og breytir i char og límir saman þrjú char eftir fyrirmælum
 *
 *****************************************************************************/

public class Stafaruna {
    public static void main(String[] args) {
        char k = 'q';
        char c = 'q';
        char a = 'q';
        char b = 'q';
        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);
        int z = (aTala + 2 * bil);

        for (int i = 0; i <= aTala; i++) {
            k = (char) i;
            a = k;
        }

        for (int i = 0; i <= bil; i++) {
            k = (char) i;
            b = k;
            //System.out.println(b);
        }
        for (int i = 0; i <= z; i++) {
            k = (char) i;
            c = k;
        }
        System.out.printf("%c%c%c%c%c%c%c", a, b, a, c, a, b, a);
    }
}
