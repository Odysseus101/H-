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
        swap(1, 2);
    }

    public static void swap(int a, int b) {

        int t = a;

        a = b;

        b = t;

        System.out.println(a + ": er a");
        System.out.println(b + ": er b");
        System.out.println(t + ": er t");
    }
}
