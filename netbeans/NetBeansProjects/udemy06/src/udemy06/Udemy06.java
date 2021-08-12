
package udemy06;

import java.util.Scanner;
import udemy06.Retangulo;
public class Udemy06 {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        Retangulo x;
        x = new Retangulo();
        x.largura = sc.nextDouble();
        System.out.println("entre com largura e altura do retangulo: ");
        x.altura = sc.nextDouble();
        
        
        
        System.out.println("Area: " + x.area());
        System.out.println("Perimetro: "+ x.perimetro());
        System.out.println("Diagonal: "+ x.diagonal());
        
        
     
     
    }
    
}
