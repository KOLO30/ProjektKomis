package Dane;

import java.util.Scanner;

public class InputData {
    Scanner input = new Scanner(System.in);

    //wczytanie wartości int
    public int InputInt(){
        return input.nextInt();
    }
    //wczytanie wartości String
    public String InputString(){
        return input.next();
    }
    //wczytanie wartości double
    public double InputDouble(){
        return input.nextDouble();
    }
}
