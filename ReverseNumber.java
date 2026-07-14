    import java.util.Scanner;
public class ReverseNumber {
public static void main(String []gg){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Number : ");
int rev = 0;
int n = sc.nextInt();
while(n > 0){
    int Digit = n%10;
    rev = rev*10 + Digit;
    n /= 10;
}
System.out.println("The reverse NUmber is = "+rev);
sc.close();
}    
}

