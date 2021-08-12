import java.util.Scanner;
public class Exercicio2
{
public static void main (String[] args)
{
    int num[] = new int[8]; 
    int pos[] = new int[8];
    int neg[] = new int[8];
     int contN = 0, contP = 0,i; 
    Scanner entrada;
    entrada = new Scanner(System.in);
    for (i=1;i<=8;i++)
    {
        System.out.println("DIGITE o "+i+"º número.");
        num[i] = entrada.nextInt();
        if(num[i]>=0)
            pos[contP]= num[i];
        contP = contP + 1;
        else
            neg[contN] = num[i];
                     contN = contN + 1;
                     if(contN = 0)
                             System.out.println("Vetor de negativos vazio"); 
                     else 
                            for (i=1;i<=contN;i++) 
                             System.out.println(neg[ i ]); 
                             if(contP = 0) 
                             System.out.println("Vetor de positivos vazio"); 
                             else 
                                 for (i=1;i<=contP;i++) 
                                     System.out.println(pos[ i ]);

    }

}
}
