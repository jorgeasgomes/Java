
package udemy26;

import java.util.Scanner;
public class Udemy26 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        
        System.out.print("Digite um nome: ");
        x = sc.next();
        System.out.println("O nome digitado é " + x);
        // LEMBRAR DE CONCATENAR COM +
        
        
        System.out.print("Digite um número|: ");
        int y;
        y = sc.nextInt();
        System.out.println("Voce digitou um numero inteiro: " + y);
        
        
        System.out.println("Digite um numero real: ");
        double z;
        z = sc.nextDouble();
        System.out.println("o numero real que voce digitou é: " + z);
        
        System.out.println("digite qlqr nome: ");
        char w;
        w = sc.next().charAt(1);
        System.out.println("a letra " + w + " é a segunda da sua palavra");
        
        
                
        
    }
    
}
