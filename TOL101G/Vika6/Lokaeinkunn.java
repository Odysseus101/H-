/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : fær fjórar einkunir og reiknar út rétta vægið á lokareinkun
 *
 *
 *****************************************************************************/

public class Lokaeinkunn {
    public static void main(String[] args) {
        int N = args.length;
        int[] einkunn = new int[N];
        int[] vaegi = new int[] { 10, 20, 20, 50 };
        boolean[] reikna = new boolean[N];
        double lokaeinkun = 0.0;

        if (N == 4) {
            for (int i = 0; i < N; i++) {
                einkunn[i] = Integer.parseInt(args[i]);
                System.out.println(einkunn[i]);
            }
            if (einkunn[3] > einkunn[0]) {
                vaegi[3] = vaegi[3] + vaegi[0];
                reikna[0] = true;
            }
            if (einkunn[3] > einkunn[1]) {
                vaegi[3] = vaegi[3] + vaegi[1];
                reikna[1] = true;
            }
            if (einkunn[3] > einkunn[2]) {
                vaegi[3] = vaegi[3] + vaegi[2];
                reikna[2] = true;
            }
            for (int j = 0; j < N; j++) {
                if (!reikna[j]) {
                    lokaeinkun = lokaeinkun + (einkunn[j] * (vaegi[j] * 0.01));
                }
                System.out.println(lokaeinkun);
            }
            System.out.println(lokaeinkun);
        }
        else {
            System.out.println("Rangur fjöldi");
        }
    }
}
