/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package médiaponderada;

/**
 *
 * @author igorl
 */
public class Médiaponderada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1;
        nota1 = 6.5;
        double nota2;
        nota2 = 8.0;
        double peso1;
        peso1 = 6.0;
        double peso2;
        peso2 = 4.0;
        double media;
        media = (nota1*peso1+nota2*peso2)/(peso1+peso2);
        System.out.println("A media ponderada é " + media);
        
    }
    
}
