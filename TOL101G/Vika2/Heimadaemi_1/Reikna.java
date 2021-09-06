/******************************************************************************
 *  Compilation:  javac Reikna.java
 *  Execution:    java  Reikna
 *
 *  Prints "Góðan daginn Sigga og Gunna"
 *  command-line argument.
 *
 *  % java UseArgument sigga gunna
 *
 ******************************************************************************/
public class Reikna
{
    public static void main(String[] args)
    {
        int x,y;
        String z, v;
        x = 2+20/10*2;
        y = 2 / 3 / 2;
        z = "2" + true;
        v = 5.1 + 3.0 + "5";

        System.out.print(x+" "+y+" "+z+" "+v);

    }
}