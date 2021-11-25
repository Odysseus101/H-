/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Teningur {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        int c = 0;
        int[] b = new int[t];

        if (h > 0 && h < 7) {
            for (int i = 0; i < t; i++) {
                int g = StdRandom.uniform(1, 7);
                b[i] = g;

                if (b[i] == h) {
                    ++c;
                }
            }
            System.out.println(c);
        }
        else {
            System.out.println("Ólögleg hlið");
        }
    }
}
