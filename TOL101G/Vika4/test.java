/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class test {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 6; i++) {
            // hvert er f hér
            f = f + g;
            g = f - g;
        }
    }
}
