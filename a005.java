import java.util.Scanner;
public class a005 {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   while(sc.hasNext()){
    int count = sc.nextInt();
     while(count--!=0){
    int[] a = new int[4];
   
    int b,i;
    for(i=0;i<4;i++){
     b = sc.nextInt();
     a[i] = b;
    
    }
    for(int c : a){
     System.out.print(c+" ");
    }
   if(a[0]+a[2]== 2*a[1] && a[1]+a[3]==2*a[2] ){
     System.out.println(2*a[3]-a[2]);
   }else{
    System.out.println(a[3]*a[3]/a[2]);
   }
   
   }
  }
 }
}
