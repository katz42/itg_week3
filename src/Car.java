public class Car {

    String make;
    String model;
    String color;


    static int count = 0;

    String carStart(){
        return "This car can be started.";
    }

    String carStop(){
      return "Breaks work fine too.";
    }

    public Car (String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
    }
    public Car (){
    }

    public static void main (String[] args){

        Car car1 = new Car("Tesla", "Model S", "Pearl White Multi");
/*        car1.make = "Tesla";
        car1.model = "Model S";
        car1.color = "Pearl White Multi";*/
        count++;

        Car car2 = new Car("Nissan", "Leaf", "Deep Blue Pearl");
/*         car2.make = "Nissan";
        car2.model = "Leaf";
        car2.color = "Deep Blue Pearl";*/
        count++;

        Car car3 = new Car("Ford", "Mustang Mach-E Select", "Rapid Red Metallic Tinted Clearcoat");
/*        car3.make = "Ford";
        car3.model = "Mustang Mach-E Select";
        car3.color = "Rapid Red Metallic Tinted Clearcoat";*/
        count++;

        Car car4 = new Car();
        car4.make = "Toyota";
        car4.model = "Prius";
        count++;

        System.out.println("List of available cars:");
        System.out.println("1. " + car1.make + " " + car1.model + " in color " + car1.color);
        System.out.println(car1.carStart());
        System.out.println(car1.carStop());
        System.out.println("2. " + car2.make + " " + car2.model + " in color " + car2.color);
        System.out.println(car2.carStart());
        System.out.println(car2.carStop());
        System.out.println("3. " + car3.make + " " + car3.model + " in color " + car3.color);
        System.out.println(car3.carStart());
        System.out.println(car3.carStop());
        System.out.println("4. " + car4.make + " " + car4.model);
        System.out.println("Overall " + count + " cars.");
    }
}
