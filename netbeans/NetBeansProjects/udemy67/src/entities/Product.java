
package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock(){
        return price * quantity;
    
    }
    public int addProducts (int quantity){
        return this.quantity += quantity;
        
        
    
    }
    
    public int removeProducts (int quantity){
        return this.quantity -= quantity;
        
    
    }
    
    public String toString(){
        return name + ", R$:" + price + ", " + quantity + " unidades, valor total no estoque: R$: "+ totalValueInStock(); 
                        
                
    
    
    }
    
}
