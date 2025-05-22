package Dane;

import java.util.Scanner;

public class InputData {
    Scanner input = new Scanner(System.in);

    public int InputInt(){
        return input.nextInt();
    }
    public String InputString(){
        return input.next();
    }
    public double InputDouble(){
        return input.nextDouble();
    }
}
