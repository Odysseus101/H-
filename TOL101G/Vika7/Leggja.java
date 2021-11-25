/******************************************************************************
 *  Nafn    : Kristján Kári Gunnarsson
 *  T-póstur: kkg6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Leggja {
    public static void main(String[] args) {
        double x = 0.5;
        double y = 0.5;
        double ytri_hringur = StdIn.readDouble();
        double innri_hringur = ((ytri_hringur * 0.01) * 90);
        double bordinn = ((ytri_hringur * 0.01) * 10);
        int halli_gradur = StdIn.readInt();
        double halli_radians = Math.toRadians(halli_gradur);
        double halli_formula_x = ((x * ((Math.cos(halli_radians)))) - (y * (Math
                .sin(halli_radians)))) + 0.5;
        double halli_formula_y = ((y * ((Math.cos(halli_radians)))) + (x * (Math
                .sin(halli_radians)))) + 0.5;
        double mmh = (ytri_hringur * 2) + 0.5;

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(x, y, ytri_hringur);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledCircle(x, y, innri_hringur);

        StdDraw.setPenColor(StdDraw.RED);
        //StdDraw.line(halli_formula_x, halli_formula_y, bordinn, bordinn);
        StdDraw.setPenRadius(bordinn);
        StdDraw.line(1, 1, 1, 1);
        StdDraw.line(x, y, x, y);
        StdDraw.line(0, 0, 0, 0);
        StdDraw.line(0, 1, 0, 1);
        StdDraw.line(1, 0, 1, 0);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.line(x, y, , y);
    }
}
