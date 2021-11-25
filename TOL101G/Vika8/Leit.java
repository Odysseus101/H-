/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Leit {
    public static int finna(int[] a, int x) {

        int saeti = 0;

        for (int j = 0; j < 10; j++) {
            
            if (x == a[j]) {

            }
        }
    }

}

    public static void main(String[] args) {

        int[] a = new int[10];
        int x = StdRandom.uniform(1, 10);

        for (int i = 0; i < 10; i++) {
            a[i] = StdRandom.uniform(1, 10);
        }
        System.out.println("2 er í sæti " + finna(a, 2));
        System.out.println(); // fylla hér inn í
    }

