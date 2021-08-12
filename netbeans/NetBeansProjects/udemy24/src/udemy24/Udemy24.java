
package udemy24;


public class Udemy24 {

    public static void main(String[] args) {
        System.out.println("ola, mundo!!");
        //aqui é apenas para mostrar saida de dados mostrando a diferença
        //de print para println. Println pula linha, print fica na mesma linha
        System.out.print("Bom dia, ");
        System.out.println("como vai??");
        int y = 32;
        
        System.out.println(y);
        //aqui é para atribuição de variável, com o int como inteiro
        double x = 10.456735;
        System.out.printf("%.2f%n", x);
        //usar printf que significa formatado e o %,2f as casas decimais
        // %n ou \n signfica quebra de linha 
        
        //Locale.setDefault(Locale.US) para resolver de quando sair o resultado
        //sair com . ao inves de ,
        System.out.println("Resultado é igual a " + x +" metros");
        // aqui é para mostrar a concatenação usando o +
        System.out.printf("Resultado é igual a %.2f  metros\n", x);
        //aqui é para  mostrar formatado. Atenção que a formataçao ja substitui o x
        
        String nome = "Maria";
        System.out.printf("O Resultado %d equivale a metragem %.3f de %s\n", y, x, nome);
        //aqui é a concatenação de formatados
        
    }
    
}
