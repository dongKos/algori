package dongko.baeckjoon.ioCalc;

import java.util.Scanner;

public class Question11 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        
        int num = Integer.parseInt(num1);
        
        int num3 = num * Integer.parseInt(num2.charAt(2) + "");
        int num4 = num * Integer.parseInt(num2.charAt(1) + "");
        int num5 = num * Integer.parseInt(num2.charAt(0) + "");
        
        int num6 = num * Integer.parseInt(num2);
        
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }
}
