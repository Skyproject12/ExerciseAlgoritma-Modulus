package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double a=12345,b,c,d,e;

        Scanner scan = new Scanner(System.in);
       b=a%10;
       c=a/10;
       d=c%10;
       e=c/10;
       System.out.println(b+""+c+""+d+""+e);
        }
    }

