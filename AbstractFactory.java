class FactoryProducer {
    
    static AbstractFactory getFactory(String type){
        
        if(type.equals("pizza")){
            
            return new PizzaFactory();
            
        }else if(type.equals("sandwitch")){
            
            return new SandwitchFactory();
        }
        return null;
        
    }

}

interface AbstractFactory{
    
    public Pizza createPizza(String type);
    public Sandwitch createSandwitch(String type);
}

class PizzaFactory implements AbstractFactory{
    
    public Pizza createPizza(String type){
        if (type.equals("s")){
            return new SpicyPizza();
            
        }else if (type.equals("t")){
            
            return new TikkaPizza();
            
        }else if (type.equals("v")){
            
            return new VeggePizza();
            
        }
        return null;
    }
    
    public Sandwitch createSandwitch(String type){
        
        return null;
    }
}
class SandwitchFactory implements AbstractFactory{
    
    public Pizza createPizza(String type){
        
        return null;
    }
    
    public Sandwitch createSandwitch(String type){
        
        if (type.equals("c")){
            return new CheeseSandwitch();
            
        }else if (type.equals("t")){
            
            return new TikkaSandwitch();
            
        }else if (type.equals("v")){
            
            return new VeggeSandwitch();
            
        }
        return null;
    }
}

class Pizza extends PizzaFactory{
    
    void prepare(){
        
    }
    
    void cut(){
        
    }
    
    void box(){
        
    }
    
}

class SpicyPizza extends Pizza{
    
    void prepare(){
        
        System.out.println("SpicyPizza");
    }
}

class TikkaPizza extends Pizza{
   void prepare(){
        
        System.out.println("TikkaPIzza");
    }
}
class VeggePizza extends Pizza{
    
    void prepare(){
        
        System.out.println("VeggePizza");
    }
}
class Sandwitch extends SandwitchFactory{
    
    void prepare(){
        
    }
    
    void cut(){
        
    }
    
    void box(){
        
    }
    
}

class CheeseSandwitch extends Sandwitch{
    
    void prepare(){
        
        System.out.println("CheeseSandwitch");
    }
}

class TikkaSandwitch extends Sandwitch{
   void prepare(){
        
        System.out.println("TikkaSandwitch");
    }
}
class VeggeSandwitch extends Sandwitch{
    
    void prepare(){
        
        System.out.println("VeggeSandwitch");
    }
}





public class MyClass {
    public static void main(String args[]) {

      Pizza pizza = FactoryProducer.getFactory("pizza").createPizza("t");
      pizza.prepare();
      
      Sandwitch sand = FactoryProducer.getFactory("sandwitch").createSandwitch("c");
      sand.prepare();
    
    }
}
