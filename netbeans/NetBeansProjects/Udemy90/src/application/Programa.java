
package application;
import java.util.Scanner;
import entities.Produto;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos produtos gostaria de armazenar: ");
        int n = sc.nextInt();
        
        Produto[] vect = new Produto[n];
        
        for(int i = 0; i< n; i++){
            System.out.print("Digite o nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine(); 
            System.out.print("DIgite o preco do produto: ");
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        
        
        }
        double soma = 0;
        for (int i = 0; i < n; i++){
            soma += vect[i].getPrecoDoProduto();
            
            
            
            
    
    }
        double media = soma / n;
        System.out.println("A media dos preços dos produtos é: "+ media);
    
    
    
    
    }
    
}
