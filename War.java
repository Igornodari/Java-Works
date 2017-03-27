
package war;

import java.util.Random;
import java.util.Scanner;

public class War {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random randomizer = new Random();
      
      int x = 0 , y=0 ,atk, def, win_atk= 0 , win_def =0;
      
      do{
        System.out.println("informe o numero de ataques:(Até 3)" );
         atk = scan.nextInt();
      }while (atk>3);
      do{
        System.out.println("informe o numero de defesas:(Até 3) ");
        def= scan.nextInt();
      }while (def>3);
      
      for (int batalha = 1; batalha<=atk;batalha++){
         x = randomizer.nextInt (6)+1; 
         y = randomizer.nextInt (6)+1;
         
      if (x>y){
          System.out.printf("numero de ataque %d / n de defesa: %d\n\n",x,y);
          win_atk++;
      }else{
          System.out.printf("numero de ataque: %d / n de defesa: %d\n\n",x,y);
          win_def++;
          
       if (win_def>=win_atk){
           System.out.printf("DEFESA vence o jogo com %d batalha(s) vencidas\n",win_def);
           
       }else{
            System.out.printf("ATAQUE vence o jogo com %d batalha(s) vencidas\n",win_atk);
            
           
       }
          
          
          
      }   
      }
      
        
        
      
      
     
    }
    
}
