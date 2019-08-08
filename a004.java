import java.util.Scanner;
public class a004{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a;
        while (cin.hasNext()){
            a=cin.nextInt();
            if((a>=0)&&(a%4==0)&&(a%100!=0)) System.out.println("閏年");
            else if (a%400==0) System.out.println("閏年");
            else System.out.println("平年");
        }
    }
}