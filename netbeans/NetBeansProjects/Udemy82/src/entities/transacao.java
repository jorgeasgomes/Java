
package entities;


public class transacao {
    public int numeroConta;
    public String nomeTitular;
    public double valorDeposito;
    public double valorSaque;
    public double valorDepositoCaixa;
    
    public double saque(){
        return valorDeposito - valorSaque;
    
    }
    public double deposito(){
        return this.valorDeposito = valorDeposito + valorDepositoCaixa;
    
    }
    
    public String toString() {
        return " sua conta é: "
                +numeroConta
                +" seu saldo atual é de:  "
                + valorDeposito 
                +" e o nome do titular é: "
                + nomeTitular;
            
    
    }
}
