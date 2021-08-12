
package application;
import java.util.Scanner;
import entities.transacao;

public class Banco {
    
    
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            
            transacao Transacao = new transacao();
            
            System.out.println("Digite o número da conta: ");
            Transacao.numeroConta = sc.nextInt();
            
            System.out.println("Digite o nome do titular da conta: ");
            sc.nextLine();
            Transacao.nomeTitular = sc.nextLine();
            
             System.out.println("Quer fazer um depósito inicial? Digite S ou N");
            String decisao = sc.nextLine();
            
            if (decisao.equals("S")){
                 System.out.println("Digite o valor do depósito inicial");
                 Transacao.valorDeposito = sc.nextDouble();
                 
                   
            }
            else { 
               Transacao.valorDeposito = 0;
            
            }
            
            
            System.out.println(Transacao);
            
            System.out.println("Digite quanto gostaria de sacar da conta: ");
            Transacao.valorSaque = sc.nextDouble();
            Transacao.saque();
            
            System.out.println(Transacao);
            
            
        }
}
