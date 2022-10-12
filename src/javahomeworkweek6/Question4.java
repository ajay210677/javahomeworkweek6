package javahomeworkweek6;

public class Question4 {
int a = 10;//4.1-instance variables-1
int b = 20;//4.1-instance variables-2
static int a1 = 10;//4.1-static variables-1
static int b1 = 20;//4.1-static variables-2


    public static void main(String[] args) {//4.5 main method
        Question4 obj2=new Question4();//4.6 -step-1 intance method calling into main method
        obj2.metFour();//4.6 -step-2 intance method calling into main method
        metfive();//4.6 static method calling in main method


    }

   public void metFour(){// 4.2- instance method
       System.out.println(a);//4.4- step-1 instance variables calling into instance method
       System.out.println(b);//4.4- step-2 instance variables calling into instance method
       System.out.println(a1);//4.4- step-1 Static variables calling into instance method
       System.out.println(b1);//4.4- step-2 instance variables calling into instance method
   }
   public static void metfive(){//4.3- static  method
        Question4 obj=new Question4();//4.4-step-1 instance variables calling into static method
       System.out.println(obj.a);//4.4-step-2 instance variables calling into static method
       System.out.println(obj.b);//4.4-step-3 instance variables calling into static method
       System.out.println(a1);//4.4- step-1 static variable calling into static method
       System.out.println(b1);//4.4- step-2 static variable calling into static method
   }
}

