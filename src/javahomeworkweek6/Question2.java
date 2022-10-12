package javahomeworkweek6;
/*
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme
 */
public class Question2 {
    static int a=10;//2.1 Two static variables
    static int b=20;//2.1 Two static variables

    public static void main(String[] args) {
metOne();//2.5 static method into main method
    }
    public static void metOne(){// 2.2 static method
        System.out.println(a);//2.3 static variables into static method
        System.out.println(b);//2.3 static variables into static method
    }
}