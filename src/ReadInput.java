import java.util.Scanner;

public class ReadInput {

    public static String read(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a expression : ");
        return s.next();
    }
}
