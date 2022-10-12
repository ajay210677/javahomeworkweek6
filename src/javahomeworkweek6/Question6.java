package javahomeworkweek6;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
int r;
double pI = 3.14, area;
        Scanner s =new Scanner(System.in);
        System.out.print(" Enter radius of circle");
        r=s.nextByte();
        area = pI * r * r;
        System.out.println(("Area of circle"+ area));
        s.close();

    }
}
