// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.IOException;
import java.util.Scanner;

public class loop {
   public loop() {
   }

   public static void main(String[] var0) throws IOException {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      for(int i = 1; i <= 10; i++) {
         int result = N * i;
         System.out.println("" + N + " x " + i + " = " + result);
      }

      sc.close();
   }
}
