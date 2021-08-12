
package udemy54;
import java.util.Scanner;
public class Udemy54 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,cont=0;
        System.out.println("Digite um numero entre 1 e 1000");
        x = sc.nextInt();
        
       if ( x % 2 == 1){
           
           for (int i = x; i < 1000; i = i + 2){
               
               System.out.println(i);
           
           }
           
       
           
        }
       else {
           
           for (int i = x + 1 ; i<1000; i = i + 2)
               
               System.out.println(i);
       
       }
            
         
        
        
        
    }
    
}
