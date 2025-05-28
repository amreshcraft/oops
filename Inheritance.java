class Car {
    private  String name ;
    private int model;

    public Car(String name, int model) {
        this.model = model;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    
    
}


public class Inheritance extends  Car {
    private  float  price;

    public Inheritance(float price ) {
        super("", 0);
        this.price = price;
    }

public static void main(String[] args) {
    
Inheritance obj = new Inheritance(22.78f);
obj.setName("ABC");
obj.setModel(201);
System.out.println("Brand: "+obj.getName());
System.out.println("Model: "+obj.getModel());

}
    
    
}
