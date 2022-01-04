package com.ega;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. skaitlis
        System.out.println("Ievadiet 1. skaitli:");

        System.out.println("");
        int num1 = scanner.nextInt();

        //darbība
        System.out.println("Ievadiet '/', '*', '+', '-'  darbību:");
        System.out.println("");
        String oper;
        scanner.nextLine();//nepieciešams,jo nextint nolasa string automātiski, bez ievades iespējas.
        oper = scanner.nextLine();


        //2. skaitlis
        System.out.println("Ievadiet 2. skaitli:");

        System.out.println("");
        int num2 = scanner.nextInt();



        System.out.println("Rezultāts:");
        if(oper.equals("+")) System.out.println(num1 + num2);
        if(oper.equals("-")) System.out.println(num1 - num2);
        if(oper.equals("*")) System.out.println(num1 * num2);
        if(oper.equals("/")) System.out.println(num1 / num2);
        }
    }

