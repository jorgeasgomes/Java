
package contabanco;
public class Conta {
   //ATRIBUTOS
    int numConta;
    String tipo;
    float saldo;
    float limite;
    boolean status;
    //Metodos personalizados
    void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("tipo"+tipo);
        System.out.println("Saque da conta"+saldo);
        System.out.println("numero da conta"+ numConta);
        System.out.println("Limite da conta"+ limite);
        System.out.println("conta epsecial "+status);
    }
    void sacar(float v){
        if (this.saldo + this.limite >= v){
            System.out.println("Saque realizado! Novo saldo é de:"+ this.saldo);
        } else {
            System.out.println("Saldo insuficiente para saque");
}
    }
   
    
       
   
   void depositar(float v){
        this.saldo = this.saldo + v;
       System.out.println("depositado valor de: " +this.saldo);
        
    }
   void consultar(float v){
        System.out.println("saldo atual é de:"+ this.saldo);
    } 
    public void statusconta(){
        if (this.status == true) {
            System.out.println("Cliente conta especial");
            
        } else {
            System.out.println("Cliente não é conta especial");
        }
    }

    public Conta() {
        this.saldo=0;
        this.status=false;
        
   }

   
  
}
