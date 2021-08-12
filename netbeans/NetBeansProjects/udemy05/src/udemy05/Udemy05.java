
package udemy05;

import java.util.Scanner;


public class Udemy05 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, i  ;
        int soma = 0;
        
        System.out.println("digite quantas vezes quer que o progama repita: ");
        x = sc . nextInt();
        
        for(i=0; i<x;i++){
            System.out.println("digite um numero: ");
            y= sc.nextInt();
            soma = soma +y;
            
        
        }
        System.out.println("A soma de todos os número é: " + soma);
    }
    
}
