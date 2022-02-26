package HwFactorial;

import java.util.Scanner;

public class ClassFactorial {
    public void factorial(){
        int i, fact = 1, n;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i =1; i <= n; i++) {
            fact = fact *i;
        }
        System.out.println("factorial of a given number is:" +fact);
    }
}
