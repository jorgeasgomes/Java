
package entidades;

public class Estudante {
    public double nota1, nota2, nota3;
    
    
    public double notaFinal(){
    return ((nota1*0.3) + (nota2*0.35) + (nota3*0.35)) ;
    
    }
    public double faltaPraPassar(){
    return  6 - notaFinal() ;
    }
}
