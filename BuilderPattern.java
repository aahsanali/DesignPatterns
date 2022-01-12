import java.util.ArrayList;

class CarBuilder{
    
    public static Car buildSportsCar(){
        System.out.println("Hang on.. Assembling your Sports Car..");
        Car car = new Car();
        car.addItem(new Auto());
        car.addItem(new CarbonFiber());
        car.addItem(new ABS());
        car.addItem(new Turbo());
        
        return car;
    }
    
    public static Car buildSedanCar(){
        System.out.println("Wait.. Assembling your Sedan Car..");
        Car car = new Car();
        car.addItem(new AGS());
        car.addItem(new Alluminum());
        car.addItem(new ABS());
        car.addItem(new NaturallyAspirated());
        
        return car;
    }

    public static Car buildHatchbackCar(){
        
        System.out.println("Assembling your Hatchback Car..");
        
        Car car = new Car();
        car.addItem(new Mannual());
        car.addItem(new Steel());
        car.addItem(new Disc());
        car.addItem(new NaturallyAspirated());
        
        return car;
    }
    
}

class Car{
    
    ArrayList<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item){
        items.add(item);
    }
    public void displayItems(){
        
        for (Item item:items){
            item.name();
        
        }
    }
    
    public float price(){
        float price = 0;
        
        for (Item item:items){
            price += item.price();
        }
        System.out.println(price);
        return price;
    }    
    
}


interface Item{
    
    public void name();
    public float price();
}
abstract class GearBox implements Item {}
class Auto extends GearBox{
 
    public void name(){
       System.out.println("Auto GearBox");
    }
 
    public float price(){
     
        return 1000;
    }
    
}
class AGS extends GearBox{
    
 
     public void name(){
        System.out.println("Auto Gear Shift");
     }
     public float price(){
     
     return 750;
    }
    
}
class Mannual extends GearBox{
    
    public void name(){
     System.out.println("Mannual GearBox");
    }
    public float price(){
     
     return 300;
    }
 
}

abstract class Engine implements Item {}
class Turbo extends Engine{
 
    public void name(){
       System.out.println("Turbo Engine");
    }
 
    public float price(){
     
        return 1000;
    }
    
}
class NaturallyAspirated extends Engine{
    
 
     public void name(){
        System.out.println("Natually aspirated Engine");
     }
     public float price(){
     
     return 500;
    }
    
}

abstract class Brake implements Item {}
class ABS extends Brake{
 
    public void name(){
       System.out.println("ABS Brakes");
    }
 
    public float price(){
     
        return 215;
    }
    
}
class Disc extends Brake{
    
     public void name(){
        System.out.println("Disk Brakes");
     }
     public float price(){
     
     return 90;
    }
    
}

interface Color{
    public void title();
}
class Red implements Color{
    public void title(){
        System.out.println("Red");
    }
}
class Black implements Color{
    public void title(){
        System.out.println("Black");
    }
}
class White implements Color{
    public void title(){
        System.out.println("White");
    }
}
abstract class Body implements Item {}
class CarbonFiber extends Body{
    
    public void name(){
        
        System.out.println("Carbon Fiber body");
    }
    public float price(){
        return 5000;
    }
}
class Steel extends Body{
    
    public void name(){
        
        System.out.println("Steel body");
    }
    public float price(){
        return 1000;
    }
}
class Alluminum extends Body{
    
    public void name(){
        
        System.out.println("Alluminum body");
    }
    public float price(){
        return 2000;
    }
}


public class MyClass {
    public static void main(String args[]) {
        
        Car spCar = CarBuilder.buildSportsCar();
        spCar.displayItems();
        spCar.price();
        
        System.out.println();

        Car sdCar = CarBuilder.buildSedanCar();
        sdCar.displayItems();
        sdCar.price();

        System.out.println();
        
        Car hbCar = CarBuilder.buildHatchbackCar();
        hbCar.displayItems();
        hbCar.price();

    }
}
