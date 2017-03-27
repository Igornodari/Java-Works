
package adivinha;


import java.util.Random;
import java.util.Scanner;


public class Adivinha {

    
    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
       Random randomizer = new Random();
       
        System.out.println("Escreva um numero de 1 a 10");
       
        int N1 ;
         
        N1 = leitor.nextInt();
         
        int Nsorteado ;
        
        Nsorteado = randomizer.nextInt();
       
        if ( Nsorteado == N1) 
        
       System.out.println("VOCÊ ACERTOU !!");
        
    else {
            System.err.println("O numero escolhido não é igual ao sorteado ! : VOCÊ ERROU ! ");

        }
        
        }
}
    
    

