package javahomeworkweek6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question5 {
    private int a;
    private int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System .out.println("Please enter first number:");

        int a = sc.nextInt();
        System.out.println("Please enter second number:");
        int b = sc.nextInt();
Question5 obj = new Question5();
        obj.addition(a, b);
        obj. subtraction(a, b);
        multiplication(a, b);
        division( a, b);
        sc.close();

    }

    private static void multiplication(int a, int b) {

    }

    public void addition(int a,  int b){
        int w;
        w = a + b;

        System.out.println("Addition of two numbers is :" + (a + b));
        }
public void subtraction(int a, int b){
    this.a = a;
    this.b = b;
    int x;
                x=a-b;

    System.out.println("Subtraction of number 1 and number 2 is :" + x);

}

    public static void Multiplication(int a, int b) {
        int y;
        y= a*b;
        System.out.println("Multiplication of number 1 and number 2 is :+ y");

    }
public static void division(int a, int b ){
   int z;
   z=a/b;
    System.out.println("Division of number 1 and number 2 :"+z);
}
}
