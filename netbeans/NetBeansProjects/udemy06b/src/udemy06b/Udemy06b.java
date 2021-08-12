package udemy06b;

import java.util.Scanner;
import entidades.Retangulo;
public class Udemy06b {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        Retangulo x;
        x = new Retangulo();
        
        System.out.println("entre com largura e altura do retangulo: ");
        x.altura = sc.nextDouble();
        x.largura = sc.nextDouble();
        
        
        
        System.out.println("Area: " + x.area());
        System.out.println("Perimetro: "+ x.perimetro());
        System.out.println("Diagonal: "+ x.diagonal());
        
    }
}