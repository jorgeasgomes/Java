import java.util.Scanner;
public class application {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite quantas pessoas querem mediar a altura: ");
        int n = sc.nextInt();
        
        double[]vect = new double[n];
        
        for (int i=0; i<n; i++){
            System.out.print("Digite a altura: ");
            vect[i] =sc.nextDouble();
        
        }
        double soma = 0;
            for (int i = 0; i<n; i++){
                soma = soma + vect[i];
                //ou soma += vect[i];
            }
        
            
        double media = soma / n;
        System.out.println("A media entre as alturas é: " + media);
    }
    
}
