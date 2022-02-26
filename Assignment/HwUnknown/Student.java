package HwUnknown;

import java.util.Scanner;

public class Student {
    public void Unknown(){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a name of Student:");
        name = sc.nextLine();
        if( name != " ") {
            System.out.println("The name of a Student is " + name);
        } else if (name == " ") {
            System.out.println("Unknown");
        }


    }
}
