import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws Exception{
        SetFractions S1 = new SetFractions();

        FileReader fr = new FileReader("input.txt");
        //Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            Fraction F = new Fraction(a, b);
            S1.addFraction(F);
        }
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(-2, 3);
        Fraction f3 = new Fraction(3, 4);
        SetFractions S2 = new SetFractions();
        S2.addFraction(f1);
        S2.addFraction(f2);
        S2.addFraction(f3);
        System.out.println(S1.getMax().toString());
        System.out.println(S1.getMin().toString());
        Polynomial P1 = new Polynomial(S1);
        Polynomial P2 = new Polynomial(S2);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        Polynomial P3 = P1.sum(P2);
        System.out.println(P3.toString());
    }
}
