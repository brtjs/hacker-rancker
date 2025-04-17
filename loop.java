// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.IOException;
import java.util.Scanner;

public class loop {
   public loop() {
   }

   public static void main(String[] var0) throws IOException {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 <= 10; ++var3) {
         int var4 = var2 * var3;
         System.out.println("" + var2 + " x " + var3 + " = " + var4);
      }

      var1.close();
   }
}
