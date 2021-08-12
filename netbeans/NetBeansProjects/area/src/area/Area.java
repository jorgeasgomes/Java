
package area;

import java.util.Scanner;
import entities.Triangulo;

public class Area {

     
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      Triangulo x, y;
      x = new Triangulo();
      y = new Triangulo();
        System.out.println("digite um lado: ");
        x.a = sc.nextDouble();
        System.out.println("digite outro lado: ");
        x.b = sc.nextDouble();
        System.out.println("Digite mais um lado");
        x.c = sc.nextDouble();
        double xs = x.s();
        System.out.println("a soma é : " + xs);
    }    
    
}
