package learn;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
	//if task
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Number");
     int a=sc.nextInt();
     //1.number greater than 100
     if(a>100) {
    	 System.out.println("number is greater than 100");
     }
     //2.check number is less than 0
     int b=sc.nextInt();
     if(b<0) {
     System.out.println("Number is less than zero");
	}
     //3.char is 'A'
     char ch=sc.next().charAt(0);
     if(ch=='A') {
    	 System.out.println("The given character is 'A' ");
     }
//   4.  the number is divisible by 7
     int num1=sc.nextInt();
     if(num1%7==0) {
    	 System.out.println("Number is divisible by 7");
     }
     //5.check mark is exactly 100
     int mark=sc.nextInt();
     if(mark==100) {
    	 System.out.println("The mark is exactly 100");
     }
     //6.check if a string length is more than 5
     String str=sc.next();
     if(str.length()>5) {
    	 System.out.println(" the string length is more than 5");
     }
     
   //7.check if a number ends with digit 5
     int num2=sc.nextInt();
     int ld=num2%10;
     if(ld==5) {
    	 System.out.println("The number ends with digit 5");
     }
     
    //8.check salary is equal to 25,000
     int salary=sc.nextInt();
     if(salary==25000) {
    	 System.out.println("The salary is equal to 25,000");
     }
     
     //9.PIN check
     String pin=sc.next();
     if(pin.equals("sri@123")) {
    	 System.out.println("User enter correct pin");
     }
     
     //10.check number is a three digit number
     int num3=sc.nextInt();
     if(num3>=100 && num3<=999) {
    	 System.out.println("The given number is a three digit number");
     }
     
     //11.check number is divisible by both 2 and 3
     int num4=sc.nextInt();
     if(num4%2==0 && num4%3==0) {
    	 System.out.println("The number is divisible by both 2 and 3");
     }
     
     //12.check if character is '@'
     char ch1=sc.next().charAt(0);
     if(ch1=='@') {
    	 System.out.println("the given character is '@' ");
     }
     
     //13.check temperature is equal to 0deg
     double temp=sc.nextDouble();
     if(temp==0) {
    	 System.out.println("the given temperature is equal to 0degC ");
     }
     
     //14.check year is 2024
     int year=sc.nextInt();
     if(year==2024) {
    	 System.out.println("The given year is 2024");
     }
     
     //15.check if account balance is zero
     double bal= sc.nextDouble();
     if(bal==0) {
    	 System.out.println("your Account balance is zero");
     }
}


package learn;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
	//if else task
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Number");
    
    //1.check if a number is greater than 50 or not
    int num1=s.nextInt();
    if(num1>50) {
    	System.out.println("Number is greater than 50");
    }
    else {
    	System.out.println("Number is less than 50");
    }
    
    //2.check if number is divisible by 9 or not
    int num2=s.nextInt();
    if(num2%9==0) {
    	System.out.println("Number is divisible by 9");
    }
    else {
    	System.out.println("Number is not divisible by 9");
    }
    
    //3.compare two strings
    String str1=s.next();
    String str2=s.next();
    if(str1.equals(str2)) {
    	System.out.println("The two Strings are equal ");
    }
    else {
    	System.out.println("The two Strings are NOT equal");
    }
    
    //4.age is above 60 or not
    int age=s.nextInt();
    if(age>60) {
    	System.out.println("Senior age is above 60");
    }
    else {
    	System.out.println("Junior age is less than 60");
    }
    
    //5.number is two digit or not
    int num3=s.nextInt();
    if(num3>=10 && num3<=99) {
    	System.out.println("Number is two digit");
    }
    else {
    	System.out.println("Not a two digit");
    }
    
    //6.check if char is alphabet or not
    char ch=s.next().charAt(0);
    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') {
    	System.out.println("The given character is a alphabet");
    }
    else {
    	System.out.println("The given character is Not a alphabet");
    }
    	
   //7.check a given number is perfect square or not
    double num4=s.nextDouble();
    double root=Math.sqrt(num4);
    int num5=(int) root;
    int ans=num5*num5;
    if(ans==num4) {
    	System.out.println("Number is perfect square");
    }
    else {
    	System.out.println("Number is  not perfect square");
    }
    
  //8.if a purchase > 1000 for free delivery
    double purchase=s.nextDouble();
    if(purchase>1000) {
    	System.out.println("Free Delivery");
    }
    else {
    	System.out.println("Delivery charge inculded");
    }
    
    //9.student attendance is>= 75 or not
    int attend=s.nextInt();
    if(attend>=75) {
    	System.out.println("Student attendance is greater than 75%");
    }
    else {
    	System.out.println("Student attendance is less than 75%");
    }
    
    //10.user name matches stored user name
    String user1=s.next();
    String user2="sri";
    if(user1.equals(user2)) {
    	System.out.println("Matched username");
    }
    else {
    	System.out.println("Not matched username");
    }
    
    //11.check if a number is multiple of 4
    int num=s.nextInt();
    if(num%4==0) {
    	System.out.println("number is multiple of 4");
    }
    else {
    	System.out.println("number is  not multiple of 4");
    }
    
    //12.power of 2
   int num=s.nextInt();
    if(num%2==0) {
    	System.out.println("The number is power of 2");
    }
    else {
    	System.out.println("The number is not a power of 2");

    }
    
    //13.input character is space or not
   char ch=s.next().charAt(0);
    char ch=' ';
    if(ch==' ') {
    	System.out.println("The char input is space");
    }
    else {
    	System.out.println("The char input is not space");	
    }
    
    //14.if the number is less then 10
   int num=s.nextInt();
    if(num<10) {
    	System.out.println("the number is less than 10");
    }
    else {
    	System.out.println("the number is not less than 10");
    }
    
    //15.the number is divisible by 11
   int num=s.nextInt();
    if(num%11==0) {
    	System.out.println("the number is divisible by 11");
    }
    else {
    	System.out.println("the number is not divisible by 11");	
    }
    
    //16.loan approved
    int credit=s.nextInt();
    if(credit>=700) {
    	System.out.println("Loan approved");
    }
    else {
    	System.out.println("Loan Not approved");
    }
    
    //17.electricity units > 500
   int elec=s.nextInt();
    if(elec>500) {
    	System.out.println("The electricity unit is greater than 500");
    }
    else {
    	System.out.println("The electricity unit is Less than 500");
    }
    
    
    //18.check if the mark are between 40 and 60
    int mark=s.nextInt();
    if(mark>40 && mark<60) {
    	System.out.println("the mark is between 40 and 60");	
    }
    else {
    	System.out.println("the mark is not between 40 and 60");
    }
    
    //19.check if password equals "admin123"
    String pass=s.next();
    if(pass.equals("admin123")) {
    	System.out.println("Password verified");
    }
    else {
    	System.out.println("Incorrect password");
    }
    
    //20.check if the number is cube number or not
    int cube=s.nextInt();
    double a=Math.cbrt(cube);
    int ans=(int)a;
    int cube_num=ans*ans*ans;
    if(cube_num==cube) {
    	System.out.println("the number is cube number");
    }
    else {
    	System.out.println("the number is not cube number");
    }
    
    
    
    
    	
    }
	}



}
