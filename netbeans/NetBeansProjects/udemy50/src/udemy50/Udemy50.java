
package udemy50;
import java.util.Scanner;

public class Udemy50 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,i,soma=0;
        System.out.println("Digite quantas vezes voce quer repetir o numero");
        x = sc.nextInt();
        
        for (i=0; i<x ;i++){
            System.out.println("Digite um número: ");
            y = sc.nextInt();
            soma = soma + y;
            
            
        
        }
        System.out.println(soma);
    }
    
}
