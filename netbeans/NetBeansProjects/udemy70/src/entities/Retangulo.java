
package entities;


public class Retangulo {
    public double base;
    public double altura;
    
    public double area(){
      return  (base * altura)/2;
      
         
    }
    public double  perimetro(){
        return (base + altura) * 2;
    
    }
    public double diagonal(){
        return Math.sqrt( base * base + altura * altura );
    
    }
    public String toString(){
        return "A aárea é: "+ area()+ ". O perimetro é : "+ perimetro() + ". A diagonal é: "+ diagonal();
    
    }
}
