
class Vehicle{

    public void type(){
        System.out.println("Vehicle");
    }

    public void name(){
        System.out.println("Vehicle");
    }
}

class Bike extends Vehicle{

    public void type(){
        System.out.println("Bike");
    }

    public void name(){
        System.out.println("Royal Enfield");
    }
}

class Car extends Vehicle{

    public void type(){
        System.out.println("Car");
    }

    public void name(){
        System.out.println("Virtus");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.name();
        v.type();
        Vehicle b = new Bike();
        b.name();
        b.type();
        Vehicle c = new Car();
        c.type();
        c.name();
    }
}