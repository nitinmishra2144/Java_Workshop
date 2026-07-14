    import java.util.*;
public class Greter_In_3 {
public static void main(String []gg){
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c =sc.nextInt();
    if (  a>b && a>c){
System.out.println("A is Greater = " +a);  
  }else if( b > c){
         System.out.println("B is greater = "+b);
  
  }else{
    System.out.println("C is greater ="+c);
  }sc.close();
}    
}
