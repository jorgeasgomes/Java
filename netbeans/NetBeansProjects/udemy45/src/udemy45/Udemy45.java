
package udemy45;
import java.util.Scanner;

public class Udemy45 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int x, soma=0;
        System.out.println("Digite um número: ");
        x = sc.nextInt();
        while (x !=0 ) {
            soma = soma + x;
            System.out.println("Digite outro número: ");
            x = sc.nextInt();
            
        
        }
        System.out.println(soma);
    }
    
}
