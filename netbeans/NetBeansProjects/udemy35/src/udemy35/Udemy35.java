
package udemy35;

import java.util.Scanner;
public class Udemy35 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // exemplo de condicional simples
        int x;
        x = 5;
        System.out.println("bom dia");
        
        if ( x > 5){
            
          System.out.println("boa tarde");}        
        
        System.out.println("boa noite");
        
        
        // exemplo condicional composta
        int hora;
        System.out.print("que horas são??: ");
        hora = sc.nextInt();
        if ( hora <= 12 ){
            System.out.println(" Realmente é bom dia");
        
        }
        
        
        else {
            if (hora < 18 ) {
                
                System.out.println(" Acho que é boa tarde");
            }
            else {
                System.out.println("Na verdade ja é noite");
            
            }
        }
        
    
        
    }
    
}
