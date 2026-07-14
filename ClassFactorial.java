public class ClassFactorial {
    import java.util.*;
public class Factorial {
public static void main(String []gg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number : ");
    int n = sc.nextInt();
    int rev=1;
    for(int i =n; i>=1;i--){
        rev = rev * i;}
    System.out.println("The Factorial of a number is = "+rev);
sc.close();
}    
}
}
