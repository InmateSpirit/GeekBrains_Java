package GeekBrains;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        byte B = 1;
        short s = 2;
        int i = 1;
        long l = 800L;
        float f = 1.5f;
        double bl = 1.765;
        boolean T = true;
        boolean F = false;
        char C = 'a';
        String S = "sssss";
        System.out.println("jfhdsj");

        float E = Calculation(1,3, 10, 3);
        System.out.println(E);
        System.out.println(Calculation(34,2,56,32));
        if (Check(12,14) == true){
            System.out.println("True");
        }else System.out.println("False");
        PosorNeg(-143);
        CheckNegative(-24);
        _name("Ивиан");
        IsLeap(1604);
        IsLeap2(1900);



    }
    public static float Calculation(int a, int b, float c, float d){
       return a * (b + (c / d));
    }
    public static boolean Check(int a, int b ){
        if (a+b>=10 && a+b<=20){
            return true;
        } else
            return false;
    }
    public static void PosorNeg(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else
            System.out.println("Negative");
    }
    public static boolean CheckNegative(int a){
         if(a < 0)
         return true;
         else
         return false;
    }

    public static void _name(String Name) {
        System.out.println("Привет, " + Name + "!");
    }


    public static void IsLeap(int year){
        if (year%400==0)
            System.out.println("Год високосный");
        else if (year%100==0)
            System.out.println("Год не високосный");
        else if (year%4 ==0)
            System.out.println("Год високосный");
        else
            System.out.println("Год не високосный");
    }
    public static void IsLeap2(int year){
        if (year%400==0 && year%100!=0 && year%4==0)
            System.out.println("Год високосный");
        else System.out.println("Год не високосный");
    }

}
