
package udemy03c;

import java.util.Scanner;


public class Udemy03c {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String dia;
        System.out.println("Digite um número para saber seu equivalente ao dia da semana: ");
        int num = sc.nextInt();
        switch (num) {
            
           
            case 1:
                dia = "domingo";
                break;
                
            case 2:
                dia = "segunda";
                break;
                
            case 3:
                dia = "terça";
                break;
                
            case 4:
                dia = "quarta";
                break;
            
            case 5:
                dia = "quinta";
                break;
                
            case 6:
                dia = "sexta";
                break;
                
            case 7:
                dia = "sabado";
                break;
                
            default:
                dia = " numero invalido. Digitar número de 1 a 7";
                break;
                
                
                
                
        
        
                        
           
                
                
        
        
        }
       System.out.println("o dia da semana é: " + dia);
    }
    
}
