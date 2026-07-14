    // Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Prime_or_Not {
   public Prime_or_Not() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter your Number : ");
      int var2 = var1.nextInt();

      while(var2 > 0) {
         if (var2 / var2 == 1) {
            System.out.println("Number is prime : " + var2);
         } else {
            System.out.println("Number is not prime : ");
         }
      }

      var1.close();
   }
}

