
package teste1;
import java.util.Scanner;

public class Teste1 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       double z1 ,n1,n2,opcao;
        
        System.out.println("Digite um numero: ");
        n1 = input.nextDouble();
        System.out.println("Digite outro numero: ");
        n2 = input.nextDouble();
        System.out.println("        Digite uma das opções abaixo        ");
        System.out.println("1    Média entre os números digitados");
        System.out.println("2    Diferença do maior pelo menor");
        System.out.println("3    Produto entre os números digitados");
        System.out.println("4    Divisão do primeiro pelo segundo");
        System.out.println("5    Sair");
        opcao = input.nextInt();
        if (opcao == 1)  {
            z1 = (n1+n2)/2;
            System.out.println("a media equilvale a: "+ z1 );
        } else  { 
            if (opcao == 2) {
                z1 = (n1 - n2);
                System.out.println("A subtração dos numeros é : "+ z1);
            }
            }
        }
            
        
        
        
        
        
        
        
        
    
   
    }
