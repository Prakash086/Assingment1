package HwGrading;

import java.util.Scanner;

public class Grading {
    public void Marks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark obtained by a student:");
        int mark = sc.nextInt();
        if(mark<= 25) {
            System.out.println("F");
        }else if(mark > 25 && mark <=45)  {
            System.out.println("E");
        } else if (mark > 45 && mark <= 50) {
            System.out.println("D");
        } else if (mark > 50 && mark<= 60) {
            System.out.println("C");
        } else if (mark > 60 && mark <= 80 ) {
            System.out.println("B");
        }else if (mark > 80) {
            System.out.println("A");
        }

    }

}
