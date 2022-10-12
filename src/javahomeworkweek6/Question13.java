package javahomeworkweek6;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        int a, b, c, sum = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a = sc.nextInt();
        System.out.println("Enter number 2: ");
        b = sc.nextInt();
        System.out.println("Enter number 3 ");
        c = sc.nextInt();
        System.out.println("Sum of all 3 number= " + sum);
        double avg = sum/3;
        System.out.println("Average of all 3 number= " +avg);
        sc.close();

    }

}
