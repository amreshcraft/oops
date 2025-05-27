class Car {
    String name;
    Integer model ;
    public  void setCarDetail(String name , int model) {
        this.name  = name;
        this.model = model;
           
    }
    public  void print(){
        System.out.println("Brand : " +name + ", Model: "+model);
    }
}


public class ClassAndObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setCarDetail("ABC",125);
        car2.setCarDetail("XYZ",175);
        car1.print();
        car2.print();


    }
    
}
