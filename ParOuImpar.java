
package par.ou.impar;

import java.util.Scanner;

public class ParOuImpar {

 
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Escreva um numero");
       int num = scan.nextInt(); 
       
       if (num % 2==0)
           System.out.println("O Número é par !");
       else
           System.out.println("O Número é impar !");
       
                   
       
    }
    
}
