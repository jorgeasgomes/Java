
package udemy49;
import java.util.Scanner;

public class Udemy49 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Digite a sua senha: ");
        x = sc.nextInt();
        System.out.println("Digite o codigo de segurança ");
        y = sc.nextInt();
        
        while( x != 1604 || y != 270){
            System.out.println("Senha inválida");
            System.out.println("Digite a sua senha");
            x = sc.nextInt();
            System.out.println("Digite o codigo de segurança: ");
            y = sc.nextInt();
            
            
        
        }
        System.out.println("Pagamento efetuado");
    }
    
}
