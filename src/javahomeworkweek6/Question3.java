package javahomeworkweek6;

public class Question3 {
    int a = 10;//3.1 Instance variable
    static int b = 20;//3.1 static variable

    public static void main(String[] args) {//3.5 main method
        Question3 obj1=new Question3();//3.6 - step-1 insatnce method  calling into main method
        obj1.metThree();// 3.6- step-2 instance method  calling into main method
        metThree1();//3.6 Static method calling into main method
    }

    public void metThree() {//3.2 instance method

        System.out.println(a);//instance variable calling in instance method
        System.out.println(b);//static variable calling in instance method
    }

    public static void metThree1() {//3.3 static method
        Question3 obj=new Question3();
        System.out.println(obj.a);
        System.out.println(b);

    }

}









