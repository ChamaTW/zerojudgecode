import java.util.Scanner;
import java.lang.Math.*;
public class a006 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            double a, b, c, d;
            a = cin.nextDouble();
            b = cin.nextDouble();
            c = cin.nextDouble();
            d = b*b - 4*a*c;
            if(d > 0)
                System.out.println("Two different roots x1=" + (int)((-b+Math.sqrt(d))/(2*a)) + " , x2=" + (int)((-b-Math.sqrt(d))/(2*a)));
            else if(d == 0)
                System.out.println("Two same roots x=" + (int)(-b/(2*a)));
            else
                System.out.println("No real root");
        }
    }
}