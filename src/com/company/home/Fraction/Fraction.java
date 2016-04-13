package com.company.home.Fraction;

import java.util.Scanner;

public class Fraction {
    //  сумма
    public static double summing (int a, int b, int c, int d) {
        double sum = 0;
        if(b == d){
            sum = (double) (a + c) / d;
            System.out.println((a+c) + "/" + d);
            return sum;
        }
        if(b != d){
            sum = (double) (a * d + b * c) / (b * d);
            System.out.println( (a * d + b * c) + "/" + (b * d));
            return sum;
        }
        return sum ;
    }
    //  вычитание
    public static double subtraction (int a, int b, int c, int d ){
        double sum = 0;
        if(b == d){
            sum = (double) (a - c) / d;
            System.out.println((a-c) + "/" + d);
            return sum;
        }
        if(b != d) {
            sum = (double) (a * d - b * c) / (b * d);
            System.out.println((a * d - b * c) + "/" + (b * d));
            return sum;
        }
        return sum;
    }
    //  деление
    public static double division (int a, int b, int c, int d){
        double sum = 0;
        sum = (double) (a * b) / (c * d);
        System.out.println((a*b) + "/" + (c*d));
        return sum;
    }
    //  умножение
    public static double multiplication (int a, int b, int c, int d){
        double sum = 0;
        sum = (a*c) / (b*d);
        System.out.println((a*c) + "/" + (b*d));
        return sum;
    }
    public static int myScanner() {
        Scanner in = new Scanner(System.in);
        String scan = in.nextLine();
        int answer = Integer.valueOf(scan);
        return answer;
    }
}