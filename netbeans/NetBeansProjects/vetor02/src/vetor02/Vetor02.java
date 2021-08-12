/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author jgome
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int i=1, j=1;
     try {
         i++;
         j--;
         if (i/j>1)
             i++;
         
     }
     catch (ArithmeticException e){
         System.out.println(0);
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.out.println(1);
     }
     catch (Exception e){
         System.out.println(2);
     }
     finally {
         System.out.println(3);
     }
        System.out.println(4);
    }
}