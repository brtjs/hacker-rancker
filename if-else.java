import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IfElse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}if(n % 2 != 0){
    System.out.println("weird");
}else{
    if(n<=2&&n>=5){
        System.out.println("Not Weird");
    }else if(n>=6&&n<=20){
        System.out.println("Weird");
    
    }else if(n>20){
        System.out.println("Weird");
    }
}