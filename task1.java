package learn;

public class Operator 
{

	public static void main(String[] args) 
	{
   int a=20;
   int b=3;
   System.out.println("Sum : "+(a+b));
   System.out.println("Difference : "+(a-b));
   System.out.println("Product : "+(a*b));
   System.out.println("Division : "+(a/b));
   System.out.println("Modulus : "+(a%b));
   //swapping without using 3rd variable
   int num_1=10;
   int num_2=4;
   System.out.println("Before swapping: number 1 is  : "+num_1+" number 2 is: "+num_2);
   num_1=num_1+num_2;
   num_2=num_1-num_2;
   num_1=num_1-num_2;
   System.out.println("After swapping : number 1 is: "+num_1+" number 2 is: "+num_2);
   
   
//  without using 3rd variable & using bitwise
   int c=20;
   int d=10;
   c=c^d;
   d=c^d;
   c=c^d;
   System.out.println(c);
   System.out.println(d);
   
//   last 2 digit of a number
   int n=28970;
   int ans=n%100;
   System.out.println(ans);
   
//   middle digit
   int num=54623;
   int num1=num/100;
   num1%=10;
   System.out.println("Middle number :"+num1);
   int sq=num1*num1;
   System.out.println("Square is: "+sq);   
   }		   
}


package learn;

import java.util.Scanner;

public class Calculation_1 {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number: ");
  int a=sc.nextInt();
  double ans=Math.sqrt(a);
  System.out.println("Square root is: "+ans);
  //area of triangle = 1/2x base x height
  System.out.println("enter base and height: ");
  int base=sc.nextInt();
  int height=sc.nextInt();
  double area=0.5*base*height;
  System.out.println("Area of triangle is: "+area);
   
  
//  convert kilometer into miles 1km=0.63miles
  System.out.print("Enter a km value:");
  int km=sc.nextInt();
  double miles=km*0.63;
  System.out.println("Miles is: "+miles);
  
//  convert celsius into fharenheit f=(celsius*1.8)=32;
  System.out.println("enter celcius value: ");
  double cel=sc.nextDouble();
  double f=(cel*1.8)+32;
  System.out.println("the fharenheit value is: "+f);
  
//  solve quadratic equation
  System.out.println("Enter the two numbers :");
  double n1=sc.nextDouble();
  double n2=sc.nextDouble();
  double ans1=(Math.pow(n1,2))+(Math.pow(n2, 2))+(2*n1*n2);
  System.out.println("(a+b)2 formula is: "+ans1);
  double ans2=(Math.pow(n1, 2))+(Math.pow(n2 ,2))-(2*n1*n2);
  System.out.println("(a-b)2 formula  is: "+ ans2);
  double ans3=(n1+n2)*(n1-n2);
  System.out.println("(a2-b2) formula is: "+ans3);
  
  }

}


package learn;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
    System.out.println("hello world");
//  primitive datatypes
    byte a=12;
    short b=120;
    int c=89993;
    long d=9488960798768l;
    float e=8.999f;
    double f=3.8876969;
    char g='%';
    boolean h=true;
    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
    //print user name and age
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your name: ");
    String u_name=sc.next();
    System.out.print("Enter age: ");
    int u_age=sc.nextInt();
    System.out.println("Name is: "+u_name);
    System.out.println("Age is: "+u_age);
//    add,substract,multiply and divide two numbers
    int num1=10;
    int num2=30;
    System.out.println("Addition is: "+(num1+num2));
    System.out.println("substraction is"+(num1-num2));
    System.out.println("Multiply is:"+(num1*num2));
    System.out.println("Divide is:"+(num1/num2));
    System.out.println("Reminder  is:"+(num1%num2));
// swap of two numbers
    int number_1=4;
    int number_2=20;
    System.out.println("Before swaping the number 1 is: "+number_1);
    System.out.println("Before swaping the number 2 is: "+number_2);
    int temp=number_2;
    number_2=number_1;
    number_1=temp;
    System.out.println("After swaping the number 1 is: "+number_1);
    System.out.println("After swaping the number 1 is: "+number_2);



    
        
	}

}




