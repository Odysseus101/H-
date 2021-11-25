/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : tekur inn lágmarks einkun og síir ígegnum fyrir hversu margir stodust
 *
 *
 *****************************************************************************/

public class Einkunn {
    public static void main(String[] args) {
        //skilgreini:
        //lagmarkseinkun sem intak eitt
        double lagmarkseinkun = Double.parseDouble(args[0]);
        //count sem magn af tölum sem er farið ígegn
        int count = 0;
        //sodust sem magnið sem eru ekki undir lagmarkseinkun
        int stodust = 0;
        //sodust sem magnið sem eru undir lagmarkseinkun
        int stodust_ekki = 0;

        // svo lengi það er sent gögn keyrðu
        while (!StdIn.isEmpty()) {
            //intakkið sem er verið að skoða
            double einkun = StdIn.readDouble();
            // bætta við stodust ekki ef það er lægri
            if (einkun < lagmarkseinkun) {
                stodust_ekki++;
            }
            // bætta við stodust ekki ef það er hærri eða jaft og
            if (einkun >= lagmarkseinkun) {
                stodust++;
            }
            //bætavið fjölda
            count++;
        }

        // Reikna prósentu sem stóðust
        Double prosenta = ((count * 0.01)) * stodust;

        //prenta útkomu
        System.out.println(count + ": count");
        System.out.println(stodust + ": stodust");
        System.out.println(prosenta + ": prosenta");
        System.out.println(stodust + " nemendur náðu sem er " + prosenta + "%");
    }
}
