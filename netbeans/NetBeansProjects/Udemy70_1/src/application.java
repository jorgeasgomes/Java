import java.util.Scanner;
import entities.Funcionario;

public class application {
    
    
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.print("Digite o nome do funcionário: ");
        funcionario.name = sc.nextLine();
        
        System.out.print("Digite o salario bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        
        System.out.print("Digite quanto de imposto paga o funcionario: ");
        funcionario.imposto = sc.nextDouble();
        
        System.out.println("O funcionário, " + funcionario.name + " recebe um salário liquido de:R$ "+ funcionario.salarioLiquido());
        System.out.println();
        System.out.println("Quantos porcentos gostaria de acrescentar ao salário? ");
        double porcentagem = sc.nextDouble();
        funcionario.acrescimoSalario(porcentagem);
        
        System.out.println("Salario do "+ funcionario.name + " foi atualizado para: R$");
   
    }
    
}
