
package jo.ken.po;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
      Random randomizer = new Random();
        System.out.println("Insira o numero");
     int numeroUsuario;
     int escolhaComputador;
     
     numeroUsuario = scan.nextInt();
     escolhaComputador = randomizer.nextInt(3)+1; // gera um numero entre 2 e 3
      switch(escolhaComputador){
          case 1:
              System.out.println("Computador escolheu pedra");
              break;
          case 2:
              System.out.println("Computador escolheu papel");
              break;
          case 3:
              System.out.println("O computador escolhe tesoura");
              break;
      } 
     if (numeroUsuario == escolhaComputador){
         System.err.println("Empate");
     }
     else if((numeroUsuario - escolhaComputador)== -1||
              (numeroUsuario - escolhaComputador)== 2){
         System.err.println("Usuario vencedor");
     }
     else {
         System.err.println("computador vencedor");
        
    }
     
    }
    
}
