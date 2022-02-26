package HwDiscount;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Discount {
    public void Purchase(){

        int cost = 100;
        System.out.println("Enter number of quantity:");
        Scanner sc = new Scanner(System.in);
        int qtty = sc.nextInt();

        int TC = cost * qtty;
        int TC1 = (int) (0.9 * cost * qtty);

//        System.out.println("The total cost is:" + TC);

        if(TC <= 1000) {
            System.out.println("The total cost is:" + TC);
        } else {
            System.out.println("Total cost with discount is:" + TC1);
        }



    }

}
