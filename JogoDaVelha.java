
package jogo.da.velha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
     
     String a1 =""; 
     String a2 ="";
     String a3 ="";
     String b1 ="";
     String b2 ="";
     String b3 ="";
     String c1 ="";
     String c2 ="";
     String c3 ="";
                                     
      
     Scanner scan = new Scanner(System.in);
        
        System.out.println("De quem é a vez (X OU O) ? ");
        
        String player = scan.nextLine();
        
        if (!player.equals("X")|| ! player.equals("O")){
        
        System.err.println("Insira um caracter valido");
        }
        System.out.println("Selecione a casa a ser inserida sua peça :(a1 á c3)");
        
        String casaEscolhida = scan.nextLine();
        
    if (casaEscolhida.equals("a1")) {
			a1 = player;
		} else if (casaEscolhida.equals("a2")) {
			a2 = player;
		}
		else if (casaEscolhida.equals("a3")) {
			a3 = player;
		}
		else if (casaEscolhida.equals("b1")) {
			b1 = player;
		}
		else if (casaEscolhida.equals("b2")) {
			b2 = player;
		}
		else if (casaEscolhida.equals("b3")) {
			b3 = player;
		}
		else if (casaEscolhida.equals("c1")) {
			c1 = player;
		}
		else if (casaEscolhida.equals("c2")) {
			c2 = player;
		}
		else if (casaEscolhida.equals("c3")) {
			c3 = player;
		} else System.out.println("CASA INVALIDA");
            
            
    {
       
        System.out.println( "  " +a1+ " | " +b1+ " | " +c1+ "  ");
                
        System.out.println( "---+--+---");
        
        System.out.println( "  " +a2+ " | " +b2+ " | " +c2+ "  ");
                
        System.out.println( "---+--+---");
        
        System.out.println( "  " +a3+ " | " +b3+ " | " +c3+ "  ");
        
}
    }
}