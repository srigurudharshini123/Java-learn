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




package learn;

import java.util.Scanner;

public class Condition2 {
	public static void main(String[]args) {
	//if else if else condition
     Scanner scan=new Scanner(System.in);
     //1.season based on month number
     System.out.println("Enter month number");
     int month=scan.nextInt();
     if((month==12) || (month==1) || (month<=2)) {
    	 System.out.println("Winter");
     }
     else if((month>=3 && month<=5)) {
    	 System.out.println("Spring");	 
     }
     else if(month>=6 &&  month<=8) {
    	 System.out.println("Summer");
     }
     else if(month>=9 && month<=11) {
    	 System.out.println("Autumn"); 
     }
     else {
    	 System.out.println("Invalid month");
     }
     
     //2.check type of quadrilateral 
     System.out.print("Enter 4 sizes :");
     int a=scan.nextInt();
     int b=scan.nextInt();
     int c=scan.nextInt();
     int d=scan.nextInt();
     System.out.print("enter 4 angles: ");
     int a1=scan.nextInt();
     int a2=scan.nextInt();
     int a3=scan.nextInt();
     int a4=scan.nextInt();
     if(a==b && b==c && c==d && d==a && a1==90 && a2==90 && a3==90 && a4==90) {
    	 System.out.println("Square..."); 
     }
     else if(a==c && b==d && a1==90 && a2==90 && a3==90 && a4==90) {
    	 System.out.println("Rectangle...");
     }
     else if(a==c && d==b && c==d && d==a && a1!=90 && a2!=90 && a3!=90 && a4!=0) {
    	 System.out.println("Rhombus...");
     }
     else if(a==c && b==d && a1==a3 && a2==a4 ) {
    	 System.out.println("Parallelogram...");
     }
     else if( ((a==b && c==d)||(a==c && b==d)) && (a1==a3 || a2==a4) ){
    	 System.out.println("Kite...");
     }
     else if(a1+a2==180 || a3+a4==180) {
    	 System.out.println("trapezoid...");
     }
     else {
    	 System.out.println("Not a shape");
     }
     
     
     //3.find smallest of three numbers
     System.out.println("Enter three numbers...");
     int a=scan.nextInt();
     int b=scan.nextInt();
     int c=scan.nextInt();
     if(a<b && a<c) {
    	 System.out.println(" a is smallest");
     }
     else if(b<c && b<a) {
    	 System.out.println("b is smallest");
     }
     else {
    	 System.out.println("c is smallest");
     }

     
     //4.Assign performance rating(Excellent,Good,Average,Poor)
     System.out.println("Enter your mark in percentage: ");
     int mark=scan.nextInt();
     if(mark<=100 && mark>=90) {
    	 System.out.println("Excellent");
     }
     else if(mark<90 && mark>=70) {
    	 System.out.println("Good");
     }
     else if(mark<70 && mark>=50) {
    	 System.out.println("average");
     }
     else if(mark<50 && mark>=0) {
    	 System.out.println("Poor"); 
     }
     else {
    	 System.out.println("Invalid mark...");
     }
     
     //5.find largest among 4 numbers
     System.out.println("Enter four numbers...");
     int a=scan.nextInt();
     int b=scan.nextInt();
     int c=scan.nextInt();
     int d=scan.nextInt();
     if(a>b && a>c && a>d) {
    	 System.out.println("a is largest");	 
     }
     else if(b>a && b>c && b>d) {
    	 System.out.println(" b is largest ");
     }
     else if(c>a && c>b && c>d) {
    	 System.out.println("c is largest");
     }
     else {
    	 System.out.println("d is largest");
     }
     
     //6.classify temperature(Freezing,Cold,Warm,Hot)
     System.out.println("Enter the temperature in celsius: ");
     int temp=scan.nextInt();
     if(temp==0) {
    	 System.out.println("Freezing...");
     }
     else if(temp>=1 && temp<=15) {
    	 System.out.println("Cold...");
     }
     else if(temp>=16 && temp<=25) {
    	 System.out.println("Warm...");
     }
     else if(temp>=26) {
    	 System.out.println("Hot...");
     }
     else {
    	 System.out.println("please enter valid temperature...");
     }
     
     //7.ATM balance check/Withdraw / deposit
     System.out.println("Enter option check / withdraw/deposit");
     int balence=40000;
     String option=scan.next();
     if(option.equalsIgnoreCase("check")) {
    	 System.out.println("Your balance : "+balence);
     }
     else if(option.equalsIgnoreCase("withdraw")) {
    	 System.out.println("enter amount for withdraw: ");
    	 int amt=scan.nextInt();
    	 if(balence<amt) {
    	 System.out.println("Insufficient balence");
        }
    	 else {
    		 balence-=amt;
    		 System.out.println("Your balance amount : "+balence);
    	 }
     }
     else if(option.equalsIgnoreCase("deposit")) {
    	 System.out.println("enter amount for deposit: ");
    	 int amt=scan.nextInt();
    	 balence+=amt;
    	 System.out.println("your  balence is :"+balence);
     }
     else {
    	 System.out.println("Enter proper option");
     }
     
     //8.check number range(0-10, 11-50. 51-100, >100)
     System.out.println("Enter number: ");
     int num=scan.nextInt();
     if(num>=0 && num<=10) {
    	 System.out.println("Range is : 0 to 10");
     }
     else if(num>=11 && num<=50){
    	 System.out.println("Range is : 11 to 50");
     }
     else if(num>=51 && num<=100) {
    	 System.out.println("Range is : 51 to 100");
     }
     else if(num>100) {
    	 System.out.println("Range is : >100");
     }
     else {
    	 System.out.println("NOT a number");
     }
     
     //9.identify input as +ve,-ve or 0
     System.out.println("Enter the number: ");
     int num=scan.nextInt();
     if(num<0) {
    	 System.out.println("Negative number");
     }
     else if(num>0) {
    	 System.out.println("Positive number");
     }
     else {
    	 System.out.println("Zero");
     }
     
     //10.check eligibility for scholarship based on mark & income
     System.out.println("Enter your mark: ");
     int mark=scan.nextInt();
     System.out.println("Enter your income: ");
     int income=scan.nextInt();
     if((mark<=100 && mark>=90) && income<=50000) {
    	 System.out.println("100% scholarship eligible...");
     }
     else if((mark<=89 && mark>=70)&& income<=80000) {
    	 System.out.println("80% scholarship eligible...");
     }
     else if((mark<=69 && mark>=45)&& income<=100000) {
    	 System.out.println("50% scholarship eligible...");
     }
     else if(mark<44 && income>100000) {
    	 System.out.println("25% scholarship eligible...");
     }
     else {
    	 System.out.println("NOT eligible...");
     }
     
     //11.Determine blood pressure level
     System.out.println("Enter BP level: ");
     int bp=scan.nextInt();
     if(bp<=90) {
    	 System.out.println("Low BP");
     }
     else if(bp>=91 && bp<=120) {
    	 System.out.println("Normal BP level");
     }
     else if(bp>=121 && bp<=129){
    	 System.out.println("Elevated BP level");
     }
     else if(bp>=130 && bp<=139) {
    	 System.out.println("Hypertension-Stage 1");
     }
     else if(bp>=140 && bp<=179) {
    	 System.out.println("Hypertension-Stage 2");
     }
     else if(bp>=180) {
    	 System.out.println("Hypertension Crisis");
     }
     else {
    	 System.out.println("Invalid data");
     }
     
     //12.check number of days based on leap or non-leap year
     System.out.println("Enter year: ");
     int year=scan.nextInt();
     if(year%400==0) {
    	 System.out.println("Leap year-366 days");
     }
     else if(year%100==0) {
    	 System.out.println("Non Leap year-365 days");
     }
     else if(year%4==0) {
    	 System.out.println("Leap year-366 days");
     }
     else {
    	 System.out.println("Non Leap year-365 days");
     }
     
     //13.classify BMI into 5 categories
     System.out.println("Enter your weight: ");
     int weight=scan.nextInt();
     System.out.println("Enter your height: ");
     double height=scan.nextDouble();
     double BMI= weight/(Math.pow(height, 2));
     if(BMI<=18.5) {
    	 System.out.println("Under Weight in kg");
     }
     else if(BMI>18.5 && BMI<=24.9) {
    	 System.out.println("Normal Weight in m");    	 
     }
     else if(BMI>=25 && BMI<=29.9) {
    	 System.out.println("Over Weight");
     }
     else if(BMI>=30 && BMI<=34.9) {
    	 System.out.println("Obesity(Class 1)");
     }
     else if(BMI>=35) {
    	 System.out.println("Severe Obesity");
     }
     else {
    	 System.out.println("Invaild data");
     }

     //14.check cricket score level(Duck,Half-century,Century)
     System.out.println("Enter number of runs : ");
     int runs=scan.nextInt();
     if(runs==0) {
    	 System.out.println("Duck");
     }
     else if(runs>=1 && runs<=49) {
    	 System.out.println("Normal score");
     }
     else if(runs>=50 && runs<=99) {
    	 System.out.println("Half-century");
     }
     else {
    	 System.out.println("Century");
     }
     
     //15.categorize internet speed (slow,medium,fast)
     System.out.println("Enter internet speed in Mbps: ");
     double speed=scan.nextDouble();
     if(speed>=0.5 && speed<=10) {
    	 System.out.println("Low");
     }
     else if(speed>10 && speed<=50) {
    	 System.out.println("Medium");
     }
     else if(speed>50 && speed<=100) {
    	 System.out.println("Fast");
     }
     else if(speed>100 && speed<=500) {
    	 System.out.println("Ultra Fast");
     }
     else if(speed>500 && speed<=8000) {
    	 System.out.println("Gigabit");
     }
     else {
    	 System.out.println("invalid data");
     }

     //16.determine transport type(Bike,Car,Bus,Truck) by wheels
     System.out.println("Enter number of wheels: ");
     int wheel=scan.nextInt();
     if(wheel==2) {
    	 System.out.println("Bike...");
     }
     else if(wheel==3) {
    	 System.out.println("Auto-richshaw");
     }
     else if(wheel==4) {
    	 System.out.println("Car");
     }
     else if(wheel==6) {
    	 System.out.println("Bus");
     }
     else if(wheel>=10 && wheel<=18) {
    	 System.out.println("Truck");
     }
     else {
    	 System.out.println("Invalid data");
     }
     
     //17.Assign bonus % based on years of experience 
     System.out.println("Enter your Experience in years: ");
     int exp=scan.nextInt();
     if(exp>50) {
    	 System.out.println("100% bonus");
     }
     else if(exp<=50 && exp>=40) {
    	 System.out.println("90% bonus");
     }
     else if(exp<40 && exp>=30) {
    	 System.out.println("80% bonus");
     }
     else if(exp<30 && exp>=20) {
    	 System.out.println("60% bonus");
     }
     else if(exp<20 && exp>=10) {
    	 System.out.println("50% bonus");
     }
     else if(exp<10 && exp>=5) {
    	 System.out.println("45% bonus");
     }
     else if(exp<=4 && exp>=1) {
    	 System.out.println("15% bonus");
     }
     else if(exp==0) {
    	 System.out.println("No bonus");
     }
     else {
    	 System.out.println("Invalid data");
     }

   //18.categorize exam result (fail,pass,merit,distinction,topper)
     System.out.println("Enter your mark out of 100");
     int mark=scan.nextInt();
     if(mark==100) {
    	 System.out.println("Topper");
     }
     else if(mark<=99 && mark>=80) {
    	 System.out.println("Distinction");
     }
     else if(mark<=79 && mark>=60) {
    	 System.out.println("Merit");
     }
     else if(mark<=59 && mark>=50) {
    	 System.out.println("Pass");
     }
     else{
    	 System.out.println("Fail");
     }

      
     //19.check triangle validity
     System.out.println("Enter 1st side of triangle: ");
     int a=scan.nextInt();
     System.out.println("Enter 2nd side of triangle: ");
     int b=scan.nextInt();
     System.out.println("Enter 3rd side of triangle: ");
     int c=scan.nextInt();
     System.out.println("Enter 1st angle of triangle: ");
     int x=scan.nextInt();
     System.out.println("Enter 2nd angle of triangle: ");
     int y=scan.nextInt();
     System.out.println("Enter 3rd angle of triangle: ");
     int z=scan.nextInt();
     
     if((a>0 && b>0 && c>0)&&(x>0 && y>0 && z>0)) {
    	  if((a+b>c && a+c>b && b+c>a) && (x+y+z==180)){
    		  System.out.println("Valid triangle");
    	  }
    	  else {
    		  System.out.println("Invalid triangle");
    	  }
     }
     else {
    	 System.out.println("Enter non zero values");
     }

     
     //20.classify character (UpperCase,LowerCase,digit and special)
     System.out.println("Enter the character: ");
     char ch=scan.next().charAt(0);
     if(ch>='A' && ch<='Z') {
    	 System.out.println("UpperCase");
     }
     else if(ch>='a' && ch<='z') {
    	 System.out.println("LowerCase");
     }
     else if(ch>='0' && ch<='9') {
    	 System.out.println("Digit"); 
     }
     else {
    	 System.out.println("Special character");
     }
     
     
     //or method
     //using ASCII values
     
     
     if(ch>=65 && ch<=90) {
    	 System.out.println("UpperCase");
     }
     else if(ch>=97 && ch<=122) {
    	 System.out.println("LowerCase");
     }
     else if(ch>=48 && ch<=57) {
    	 System.out.println("Digit");
     }
     else {
    	 System.out.println("Special character");
     }
	
}
}




