
package udemy6d;

import java.util.Scanner;
import entidades.Estudante;
public class Udemy6d {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante nota;
        nota = new Estudante();
        
        
        System.out.println("Digite a primeira nota: ");
        nota.nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota.nota2 = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota.nota3 = sc.nextDouble();
        
        nota.notaFinal();
        
        if (nota.notaFinal()> 6 ){     
        System.out.println("a nota final foi: "+ nota.notaFinal());
        } else {
                System.out.println("Aluno reprovado e falta "
                        + nota.faltaPraPassar());
        
        }
        
        
    }
    
}
