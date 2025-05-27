class Car {
   private  String name;
   private  Integer model ;
   public Car(){
    this.name = "Default Car";
    this.model = 100;
   }
    public  void setName(String name ) {
        this.name  = name;
           
    }

    public  void setModel(int model ) {
        this.model = model;
           
    }

    public String getName(){return  this.name;}
    public int getModel(){return  this.model;}
  
}


public class Encapsulation {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getName());
        System.out.println(car.getModel());
        car.setName("RX");
        car.setModel(110);
        System.out.println(car.getName());
        System.out.println(car.getModel());
        
    }
}
