
package udemy02;

import java.util.Scanner;


public class Udemy02 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double b, B, h, area, x, y, z;
        double A, T , C;
        String s1;
        
       
        
        
        System.out.print("digite um número:");
        b = sc.nextDouble();
        
        
        
        System.out.print("digite outro numero: ");
        B = sc.nextDouble();
        
        System.out.print("SÕ MAIS UM NUMERO: ");
        h = sc.nextDouble();
        
        
        
        
        System.out.println("'digite um número que quer saber sua raiz quadrada");
        x = sc.nextDouble();
       
        
        System.out.println("digite um número que quer saber quanto é elevado ao quadrado");
        y = sc.nextDouble();
        
        System.out.println("digite um número que quer saber o seu valor absoluto");
        z = sc.nextDouble();
        
        System.out.println("digite uma frase de despedida");
        s1 = sc.next(); 
        
        
        
        area = (b+B) / 2 * h;
        A = Math.sqrt(x);
        T = Math.pow(y, 2);
        C = Math.abs(z);
        System.out.println(" a aréa da figura vale: " + area);
        System.out.println(" A raiz quadrada de " + x + "equivale a: "+ A);
        System.out.println( y+ " ao quadrado equivale a: "+ T);
        System.out.println("O valor absoluto de " + "equivale a: " + C);
        
       System.out.println(s1);
       
        
       
        
        sc.close();
    }
    
}
