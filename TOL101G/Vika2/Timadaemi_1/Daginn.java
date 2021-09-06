/******************************************************************************
 *  Compilation:  javac Daginn.java
 *  Execution:    java Daginn sigga gunna
 *
 *  Prints "Góðan daginn Sigga og Gunna"
 *  command-line argument.
 *
 *  % java UseArgument sigga gunna
 *
 ******************************************************************************/

public class Daginn {
    public static void main(String[] args) {
        System.out.println("Góðan daginn " + args[0] + " og " + args[1]);
    }

}
