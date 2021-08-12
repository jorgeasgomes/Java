package aula0;
 
public class Aula0 {
    //método principal.
    public static void main(String[] args) {
        //criando a conta
        //variável minha conta do tipo conta.
        Count minhaConta;
        minhaConta = new Count(); //ou pode ser tbm Conta minhaConta = new Conta();
         
        //alterando os valores de minhaConta.
        minhaConta.dono = "Jorge";
        minhaConta.saldo = "2200";
       
        //verificar saldo atual
        System.out.println("Saldo atual é: " + minhaConta.saldo);
         
        //saca quanto quiser 
        minhaConta.saca("");
        System.out.println(minhaConta.saldo);
         
        //deposita xxx reais
        minhaConta.deposita("200");
        System.out.println(minhaConta.saldo);
                 
    }
}