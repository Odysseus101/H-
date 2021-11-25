/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Fær in mælingar af landsvæði og reiknar ef það sé dalur eða eitthvað annað
 *
 *
 *****************************************************************************/

public class Dalur {
    public static void main(String[] args) {
        int N = args.length;
        int[] maeling = new int[N];
        int[] z = new int[N];
        int x = Integer.parseInt(args[0]);
        int y = 0;
        int j = 0;
        int dalur = 0;

        for (int i = 0; i < N; i++) {
            maeling[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < N; i++) {
            if (maeling[0] < maeling[i]) {
                z[y] = i;
                y = y + 1;
            }
            x = Integer.min(x, maeling[i]);
        }
        for (int g = 0; g < N; g++) {
            if (maeling[g] == x) {
                j = j + 1;
            }
        }
        if (z[0] != (N - 1) && j != 1) {
            dalur = j;
        }
        System.out.println("Lengd dals er: " + dalur);
    }

}
