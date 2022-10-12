package javahomeworkweek6;
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        double width, height, area, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width of Rectangle:");
        width = sc.nextDouble();
        System.out.println("Enter Height of Rectangle: ");
        height = sc.nextDouble();
        area = width * height;
        System.out.println("area of Rectangle= " + area);
        perimeter = (width + height) * 2;
        System.out.println("Perimeter of Rectangle=" + perimeter);
        sc.close();

    }

}
