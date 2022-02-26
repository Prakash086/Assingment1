package HwHCF;

import java.util.Scanner;

public class HCF {
    public void HCFLCM() {
       int num1, num2, rem, deno, nume, hcf, lcm;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a: ");
       num1 = sc.nextInt();
       System.out.println("Enter b: ");
       num2 = sc.nextInt();
       sc.close();

       if(num1>num2){
           nume = num1;
           deno = num2;
         } else {
           nume = num2;
           deno = num1;
         }
       rem = nume % deno;
       while(rem != 0){
           nume = deno;
           deno = rem;
           rem = nume % deno;
       }

       hcf = deno;
       lcm = num1 * num2 / hcf;


        System.out.println("HCF of a, b is: " + hcf);
        System.out.println("LCM of a, b is: "+ lcm);

    }

}
