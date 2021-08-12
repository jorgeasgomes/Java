
package application;
import java.util.Scanner;
import entities.Retangulo;

public class Programa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Retangulo retangulo = new Retangulo();
                
        System.out.println("Digite a base do retangulo");
        retangulo.base = sc.nextDouble();
        
        
        
        
        System.out.println("Digite a altura do retangulo");
        retangulo.altura = sc.nextDouble();
        
        System.out.println(retangulo);
    
    
    
    
    
    }
    
}
