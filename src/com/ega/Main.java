package com.ega;
import static java.lang.System.out;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String izv;
        do {
            //1. skaitlis
            out.println("1. skaitlis:");
            while (!sc.hasNextDouble()) {
                out.println("SKAITLI!!!:");
                sc.next();
            }
            double num1 = sc.nextDouble();

            //darbība
            boolean darbiba = true;
            String oper = null; // oper piešķīru 0 vērtību, jo switch met kļūdu. Kodā oper vērtība tiks piešķirta pēc ievades.
            while (darbiba) {
                out.println("Ievadiet '/', '*', '+', '-'  darbību:");
                sc.nextLine();//nepieciešams,jo nextint nolasa string automātiski, bez ievades iespējas.
                oper = sc.nextLine();
                if (oper.equals("+") || oper.equals("-") || oper.equals("/") || oper.equals("*")) {
                    darbiba = false;
                }
            }
            //2. skaitlis
            out.println("2. skaitlis:");
            while (!sc.hasNextDouble()) {
                out.println("Veselu skaitli!!!:");
                sc.next();
            }
            double num2 = sc.nextDouble();

            out.println("Rezultāts:");
            switch (oper) {
                case "+" -> out.println(num1 + num2);
                case "-" -> out.println(num1 - num2);
                case "*" -> out.println(num1 * num2);
                case "/" -> out.println(num1 / num2);
            }
            out.println("Vēlaties veikt nākošo aprēķinu? y/n?");
            sc.nextLine();
            izv = sc.nextLine();
        }
        while (izv.equals("y"));

    }
    }

