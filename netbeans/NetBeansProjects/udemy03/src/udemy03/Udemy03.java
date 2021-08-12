
package udemy03;

import java.util.Scanner;


public class Udemy03 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int x;
        System.out.println("Digite um número : ");
        x= sc.nextInt();
        
        if (x > 9) {
            System.out.println(" O númrto é maior do que 9");
        } else  if (x < 9){
            System.out.println(" O número é menor do que 9");
                   } else{
            System.out.println("O número é igual a 9");
                 }
        
   
    }
    
}
