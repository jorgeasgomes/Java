
package udemy39;

import java.util.Scanner;
public class Udemy39 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        System.out.println("Digite o numero para equivaler ao dia da semana");
        
        int x;
        
                
        x = sc.nextInt();
        
        switch (x){
            case 1 :
                dia = "domingo";
                break;
            case 2 :
                dia = "segunda";
                break;
            case 3 :
                dia = "terça";
                break;
            case 4 :
                dia = "quarta";
                break;
            case 5 :
                dia = "quinta";
                break;
            case 6 :
                dia = "sexta";
                break;
            case 7 :
                dia = "sábado";
                break;
            default :
                dia = "valor invalido";
                break;
                        
                
        
        }
        System.out.println("O Numero equivale a : " + dia );
    }
    
}
