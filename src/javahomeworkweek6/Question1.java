package javahomeworkweek6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme
 */
public class Question1 {

    //1.1 instance variables
    int a = 10;
    int b = 20;

    public static void main(String[] args){ //1.4
        Question1 obj=new Question1(); // method call into main method object create syantx
        obj.metOne();//1.5
    }
    // 1.2 instance method
    public void metOne(){

        //1.3 both instance variables into instance method
        System.out.println(a);
        System.out.println(b);
    }


}
