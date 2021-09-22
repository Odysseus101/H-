/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Gefur út Random tölur þangað tila að talan fer yfir 0.8
 *
 *
 *****************************************************************************/

public class Slembi {
    public static void main(String[] args) {
        double r = 0.0;
        while (r < 0.8) {
            System.out.println(r);
            r = StdRandom.uniform(0.0, 1.0);
        }
    }
}
