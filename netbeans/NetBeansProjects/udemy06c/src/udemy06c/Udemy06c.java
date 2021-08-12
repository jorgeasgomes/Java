
package udemy06c;

import java.util.Scanner;
import entidades.Empregado;

public class Udemy06c {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Empregado funcionario;
        funcionario = new Empregado();
        
        System.out.println("Nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        
        System.out.println("Salário Bruto; ");
        funcionario.salarioBruto = sc.nextDouble();
        
        System.out.println("Imposto: ");
        funcionario.imposto = sc.nextDouble();
        
        
        System.out.println("Empregado: " + funcionario.nome + ", Salario: R$" + funcionario.salarioComImposto());
        
        
        System.out.println("Qual porcentagem quer acrescentar ao salário: " );
        
        double porcentagem = sc.nextDouble();
        
        System.out.println("Salario atualizado: " + funcionario.nome + ", R$" + funcionario.acrescimoNoSalario(porcentagem));
    }
    
}
