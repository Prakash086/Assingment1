package HwTri;

import java.util.Scanner;

public class Preimeter {
    public void TriPeri(){
        System.out.println(" Enter side a:");
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();

        System.out.println("Enter side b:");
        Scanner b = new Scanner(System.in);
        int b1 = b.nextInt();

        System.out.println("Enter side c:");
        Scanner c = new Scanner(System.in);
        int c1 = c.nextInt();

        int peri = a1 + b1 +c1;
        System.out.println("The preimeter of triangle is:" + peri);

    }
}
