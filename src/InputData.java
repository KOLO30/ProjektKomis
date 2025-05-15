import java.util.Scanner;

public class InputData {
    Scanner input = new Scanner(System.in);

    protected int InputInt(){
        return input.nextInt();
    }
    protected String InputString(){
        return input.next();
    }
}
