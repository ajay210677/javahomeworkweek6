package javahomeworkweek6;
import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        String name, lastname, swap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your last name");
        lastname = sc.nextLine();
        System.out.println("Nmae " + name + " LastNmae " + lastname);
        swap = name;
        name = lastname;
        lastname = swap;
        System.out.println("After swap FullName: " + name + " " + lastname);
        sc.close();

    }
}
