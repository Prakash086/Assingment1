package HwRecArea;

import java.util.Scanner;

public class ClassAreaRec {
    public void userInput(){
        System.out.println("Enter length of rectangle:");
        Scanner l = new Scanner(System.in);
        int len = l.nextInt();

        System.out.println("Enter width of rectangle:");
        Scanner w = new Scanner(System.in);
        int wid = w.nextInt();

        int area = len * wid;
        System.out.println("Area of rectangle is "+ area);

    }


}
