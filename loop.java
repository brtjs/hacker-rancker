
import java.io.IOException;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) throws IOException {
       
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        sc.close();
    }
}
