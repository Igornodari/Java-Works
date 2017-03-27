
package salariophr;



import java.util.Scanner;


public class SalarioPhr {

   
    public static void main(String[] args) 
    {
       Scanner SalarioPhr = new Scanner(System.in);
       
            String nome;
        
        System.out.println("Digite seu nome");
        
        nome = SalarioPhr.next();
        
        double hrtrab = 8;
     
        double valorhr = 15;
        
        double mes = 31 ;
         
        double Salario = (hrtrab * valorhr * mes );
                
        System.out.println( "O funcionario " + nome + " trabalhou " +hrtrab+ " horas por R$ " +valorhr+ " e deve receber R$" +Salario );
         
        
    }
    
}
