public class CountDigit {
    import java.util.*;
public class CountDigit {
public static void main(String []gg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Number : ");
    int n = sc.nextInt();
    int count = 0;
    while( n > 0){
        n = n/10;
        count++;
    }System.out.println("The Digit of a number is ="+count);
     sc.close();
}    
}
}
