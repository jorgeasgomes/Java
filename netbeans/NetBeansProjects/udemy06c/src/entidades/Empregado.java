
package entidades;


public class Empregado {
    
    public String nome;
    public double salarioBruto;
    public double imposto;
    
    public double salarioComImposto(){
    
    return salarioBruto - imposto;    
        
    }
    
    public double acrescimoNoSalario(double porcentagem){
    
    return (salarioBruto * (porcentagem)/100) + salarioBruto;
    }
}
