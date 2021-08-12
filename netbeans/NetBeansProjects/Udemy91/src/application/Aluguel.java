
package application;
import java.util.Scanner;
import entities.Quartos;
public class Aluguel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quantos quartos deseja alugar: ");
        int n = sc.nextInt();
        
        double[]vect = new double[n];
        
        for (int i = 0; i<n; i++) {
            System.out.println("Quarto "+ i);
            System.out.println("Nome do Titular: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("email do titular: ");
            String email = sc.nextLine();
            System.out.println("Numero do quarto: ");
            int numeroQuarto = sc.nextInt();
            
        
        }
        
        System.out.println();
    
    
    }
    
}
