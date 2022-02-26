package HwSquare;

import java.util.Scanner;

public class ClassSquare {
    public void Square(){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        float Square = f * f;
        System.out.println("The square of number is:" + Square);


    }

}
