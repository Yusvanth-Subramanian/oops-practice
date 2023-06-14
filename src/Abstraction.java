
abstract class Car{
    abstract void name();

    public void type(){
        System.out.println("Car");
    }
}

class Virtus extends Car{

    @Override
    void name() {
        System.out.println("Virtus");
    }

}

public class Abstraction {

    public static void main(String args[]){

        Car c = new Virtus();
        c.name();
        c.type();
    }
}
