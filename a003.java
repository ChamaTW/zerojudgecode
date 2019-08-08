import java.util.Scanner;;

public class A003 {
 public static void main(String args[]) {
  int M=0,D=0,S=0;
  @SuppressWarnings("resource")
  Scanner cin= new Scanner(System.in);
  while(cin.hasNext()){
   M =cin.nextInt();
   D =cin.nextInt();
   S=(M*2+D)%3;
   switch (S){
   case 0:
    System.out.println("普通");
    break;
   case 1:
    System.out.println("吉");
    break;
   case 2:
    System.out.println("大吉");
    break;
   default: 
    break;
   }
  }
 }
}
