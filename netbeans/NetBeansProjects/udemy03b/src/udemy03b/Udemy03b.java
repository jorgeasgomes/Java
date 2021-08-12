
package udemy03b;

import java.util.Scanner;


public class Udemy03b {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int min;
       double val;
       
        System.out.println("Digite quantos minutos gastou no mês");
        min = sc.nextInt();
        
        if (min < 100){
            System.out.println("O valor a pagar será de R$ 50,00");
            
        } else {
        val = (min - 100) * 2 + 50;
            System.out.println("O Valor a pagar será de R$ " + val);
        }
        
                
    }
    
}
