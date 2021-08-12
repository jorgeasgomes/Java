
package application;
import java.util.Scanner;
import entities.Product;
public class Program {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         Product produto = new Product();
         
         System.out.println("Area do Produto");
         System.out.println();
         System.out.print("Nome do Produto: ");
         
         // esse seria equivalente ao exercicio anterior
         // Triangulo x,y;
         // x = new Triangulo; para instanciar do triangulo uma variavel que eu
         // queira, no caso x
         produto.name = sc.nextLine();
         
         System.out.print("Preço do Produto: ");
         produto.price = sc.nextDouble();
         
         System.out.print("Quantidade no Estoque: ");
         produto.quantity = sc.nextInt();
         
         System.out.print("Informações do estoque: " + produto);
         System.out.println();
         System.out.print("Entre com a quantidade de produtos a serem adicionados no estoque: ");
         int quantity = sc.nextInt();
         produto.addProducts(quantity);
         
         
         System.out.println();
         System.out.print("Atualização: " + produto);
         System.out.println();
         
         
         System.out.print("Entre com a quantidade de produtos a serem retirados do estoque: ");
         quantity = sc.nextInt();
         produto.removeProducts(quantity);
         
         System.out.println("Atualização: " + produto);
         System.out.println();
                 
         
         
         
       
    }
    
}
