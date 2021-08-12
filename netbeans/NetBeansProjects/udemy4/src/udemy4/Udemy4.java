package udemy4;

import java.util.Scanner;


public class Udemy4 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int soma = 0;
        System.out.println("Digite um número: ");
        x = sc.nextInt();
        
        while (x != 0) {
            System.out.println("Digite outro número: ");
            soma = soma + x;
            x = sc.nextInt();
        }
             System.out.println("A soma dos números é: " + soma);   
    }
    
}
