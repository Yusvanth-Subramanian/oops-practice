import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        String input = ReadInput.read();
        Queue<String> operations;
        Queue<String> numbers;
        String numArr[]=input.split("[-+*/]");
        String opArr[]=input.split("[0-9]+");
        numbers=new LinkedList<>(Arrays.asList(numArr));
        operations = new LinkedList<>(Arrays.asList(opArr));

        Double res= Double.parseDouble(numbers.poll());
        while (!numbers.isEmpty()){
            String op = operations.poll();
            Operate operate;
            switch (op){
                case "+":
                    operate=new Add();
                    break;
                case "-":
                    operate=new Subtract();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate=new Divide();
                    break;
                default:
                    continue;
            }
            Double num = Double.parseDouble(numbers.poll());
            res=operate.getResult(res,num);
        }
        System.out.println(res);
    }
}