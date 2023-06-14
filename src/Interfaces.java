
interface Vehicle{
    public void name();

    public void type();

    default String getParentInterface(){
        return "Vehicle";
    }

    static void getHorseOpwer(){
        System.out.print("1000");
    }
}

class Car implements Vehicle{

    @Override
    public void name() {
        System.out.println("Virtus");
    }

    @Override
    public void type() {
        System.out.println("Car");
    }
}

public class Interfaces {

    public static void main(String args[]){
        Vehicle v = new Car();
        v.type();
        v.name();
        System.out.println(v.getParentInterface());
        Vehicle.getHorseOpwer();
    }
}
