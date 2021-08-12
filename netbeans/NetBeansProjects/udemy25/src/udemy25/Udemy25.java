
package udemy25;


public class Udemy25 {

   
    public static void main(String[] args) {
        // exemplo de calculos com "formulas" usando a área do trapézio
        double B,b,h,area ;
         b = 6;
         B = 8;
         h = 5;
         area =  ((B + b)/2 ) * h;
         System.out.println(area);
         
         //exemplo de casting
         int x,y;
         double resultado;
         x=5;
         y=2;
         resultado= x / y;
         
         System.out.println(resultado);
         
         // no caso acima vai dar 2 pois o java entende que tem que dar o resultado
         // em numero interio devido a ser 2 numeros int.
         
        
         x=5;
         y=2;
         resultado= (double)x / y;
         
         System.out.println(resultado);
         // para resolver coloca-se o double na frente para o java entender 
         //e dar o resultado real
         
         
                 
        
        
        
                
        
    }
    
}
