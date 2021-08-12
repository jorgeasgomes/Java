import java.util.Scanner;

public class Exercicio2 {

     public static void main(String[] args) {
        int num[] = new int[8];
        int pos[] = new int[8];
        int neg[] = new int[8];
        int contN = 0, contP = 0, i;

        Scanner entrada;
        entrada = new Scanner(System.in);

        for (i = 0; i < 7; i++) {
            System.out.println("DIGITE o " + i + "º número.");
            num[i] = entrada.nextInt();
            if (num[i] >= 0) {
                pos[contP] = num[i];
                contP ++;
            } else {
                neg[contN] = num[i];
                contN ++;
            }
        }

        if (contN == 0)
            System.out.println("Vetor de negativos vazio");
        else{
            System.out.println("NEGATIVOS ------- \n");
            for (i = 0; i < contN; i++)
                System.out.println(neg[i]);
        }
        if (contP == 0)
            System.out.println("Vetor de positivos vazio");
        else{
            System.out.println("POSITIVOS ------- \n");
            for (i = 0; i < contP; i++)
                System.out.println(pos[i]);
        }
        entrada.close();
    }
}
