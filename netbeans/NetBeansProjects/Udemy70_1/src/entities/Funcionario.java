
package entities;


public class Funcionario {
    
    public String name;
    public double salarioBruto;
    public double imposto;
    ;
    
    public double salarioLiquido() {
        return salarioBruto - imposto ;
    
    }
    
    public void acrescimoSalario(double porcentagem){
        salarioBruto += salarioBruto * (porcentagem * 0.1);
    
    
    }
    
    
    
}
