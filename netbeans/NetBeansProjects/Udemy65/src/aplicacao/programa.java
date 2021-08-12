/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Triangulo;

import java.util.Scanner;
public class programa {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite os lados do triangulo X: ");
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();
        
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Digite os lados do triangula Y: ");
        y.a= sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
       
        double areax = x.area();
        
        
        double areay = y.area();
        
        System.out.println("ara triangulo x: " + areax);
        System.out.println("area triangulo y: " + areay);
        
        if (areax > areay){
            System.out.println("a maior é X");
            
           }
        else {
            System.out.println("a maior é Y");
        
        }
            }
    
}
