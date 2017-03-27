package baskara;

import java.util.Scanner;


public class Baskara {

 
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    
    
               
               
//ENTRADAS
System.out.print("x1:");
double x1 = Double.parseDouble(console.nextLine());
System.out.print("x2:");
double x2 = Double.parseDouble(console.nextLine());
System.out.print("c:");
double c = Double.parseDouble(console.nextLine());

//PROCESSAMENTO
double s = x1 + x2;
double p = x1 * x2;
double a = c / p;
double b = -(a * s);
//SAIDA
System.out.println(a + " x2 " + b + " x1 " + c + " = 0 ");


    }
    
}
