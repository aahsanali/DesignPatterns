abstract class Pizza {
    
    abstract void prepare();
    public void cut(){
        System.out.println("Cutting Pizza");
    }
    public void box(){
        System.out.println("Boxing Pizza");
    }
    public void bake(){
        System.out.println("Baking Pizza");
    }
}

class Cheese extends Pizza {
    
    public void prepare(){
        
        System.out.println("Preparing Cheese Pizza");
    }
    
}
class Veggie extends  Pizza {
    
    public void prepare(){
        
        System.out.println("Preparing Veggie Pizza");
    }
    
}

class Chicken extends  Pizza {
    
    public void prepare(){
        
        System.out.println("Preparing Chicken Pizza");
    }
    
}

class PizzaFactory{
    
    public Pizza getPizza(String type){
        
        if (type.equalsIgnoreCase("C")){
            
            return new Cheese();
            
        }else if(type.equalsIgnoreCase("V")){
            
            return new Veggie();
        }else if(type.equalsIgnoreCase("CK")){
            
            return new Chicken();
        }
        
        return null;
    }
    
}

public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
      
      
      Pizza pizza = (new PizzaFactory()).getPizza("CK");
      pizza.prepare();
      pizza.cut();
      pizza.bake();
      pizza.box();
      
    }
}
