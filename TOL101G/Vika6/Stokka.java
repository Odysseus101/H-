/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Stokka {
    public static void main(String[] args) {
        int x = args.length;
        int[] b = new int[x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                int c = StdRandom.uniform(1, x);
                if (b[c] == 0 &&) {
                    b[i] = Integer.parseInt(args[c]);
                }
            }
            System.out.print(b[i] + " ");
        }

    }
}
