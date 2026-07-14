public class ArmStrong {
    import java.util.*;
public class Armstrong {
public static void main(String []gg){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Number  :");
    int n = sc.nextInt();
    int original = n;
        int sum = 0;
    while( n > 0){
        int Digit =  n %10;
        sum  = sum + ( Digit * Digit * Digit);
        n /= 10;
    }
    if( sum == original){
        System.out.println("Number is Armstrong : ");
    }else{
        System.out.println("Number is not Armstrong : ");
    }sc.close();
}    
}

}
