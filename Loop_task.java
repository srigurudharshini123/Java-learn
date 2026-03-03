package learn;

import java.util.Scanner;

public class Loop_1 {

	public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   //1.print numbers from 1 to N 
   System.out.println("Enter number: ");
   int n=scan.nextInt();
   for(int i=1; i<=n;i++) {
	   System.out.println(i);
   }
   
   
   //2.print number from N to 1
   System.out.println("Enter number: ");
   int n=scan.nextInt();
   for(int i=n;i>=1;i--) {
	   System.out.println(i);
   }
   
   
   //3.print even numbers between 1 to N 
   System.out.println("Enter range");
   int n=scan.nextInt();
   for(int i=1;i<=n;i++) {
	   if(i%2==0) {
		   System.out.println(i);
	   }
   }
   
   
   //4.find the sum of first N natural numbers
   System.out.println("Enter number: ");
   int n=scan.nextInt();
   int sum=0;
   for(int i=1;i<=n;i++) {
	   sum+=i;
   }
   System.out.println("Sum is: "+sum);
   
   
   //5.find sum of digits of a number
   System.out.println("Enter number: ");
   int n=scan.nextInt();
   int sum=0,rem;
   while(n>0) {
	   rem=n%10;
	   sum+=rem;
	   n/=10;
   }
   System.out.println("Sum of digit: "+sum);


   //6.reverse a given number
   System.out.println("Enter number: ");
   int num=scan.nextInt();
   int reverse=0,rem;
   while(num>0) {
	   rem=num%10;
	   reverse*=10;
	   reverse+=rem;  
	   num/=10;
   }
   System.out.println("Reversed number is: "+reverse);
   
   
   //7.check number is palindrome 
   System.out.println("Enter number: ");
   int n=scan.nextInt();
   int reverse=0,rem;
   int a=n;
   while(n>0) {
	   rem=n%10;
	   reverse*=10;
	   reverse+=rem;
	   n/=10;
   }
   if(reverse==a) {
	   System.out.println("palindrome");
   }
   else {
	   System.out.println("not a palindrome");
   }
   
   
   //8.find factorial of a number 
   System.out.println("Enter number: ");
   int n=scan.nextInt();
   int fact=1;
   for(int i=n;i>=1;i--) {
	  fact*=i; 
   }
   System.out.println("Factorial of a number is : "+fact);
   
   
   //9.check prime number 
   System.out.println("Enter number: ");
   int n=scan.nextInt();
   int c=0;
   for(int i=2;i<n;i++) {
	   if(n%i==0) {
		   c++;
	   }
   }
   if(c==0) {
	   System.out.println("Prime number");
   }
   else {
	   System.out.println("Not a prime number");
   }
   
   
   //10.print fibonacci series up to n
   System.out.println("Enter range: ");
   int range=scan.nextInt();
   int a=0,b=1,temp;
   int num;
   for(int i=1;i<=range;i++) {
	   System.out.print(a+" ");
	   num=a+b;
	   a=b;
	   b=num;
   }
   
   //11.check armstrong number
   System.out.println("Enter number");
   int n=scan.nextInt();
   int num=n;
   int rem;
   int len=0,sum=0;
   while(n>0) {
	   rem=n%10;
	   len++;
	   n/=10;
   } 
   n=num;
   while(n>0) {
	   rem=n%10;
	   sum+=Math.pow(rem, len);
	   n/=10;
   } 
   if(num==sum) {
	   System.out.println("armstrong number");
   }
   else {
	   System.out.println("not armstrong number");
   }
   
   //12.convert decimal  to binary using loop 
   System.out.println("Enter number: ");
   int n=scan.nextInt();
   int num=n,c=0;
   int quacent,rem;
   String rev=" ";
   while(n>0) {
	   rem=n%2;
	   n/=2;
	 rev=rem+rev;
   }
   System.out.println(rev);
   //check no of 1's 
    while(num>0) {
    	 rem=num%2;
    	 num/=2;
      if(rem==1) {
    		c++;
        	}
    }
    System.out.println("No of 1's: "+c);
   

    
    //13.perfect number if 28-> sum of devisors are 1+2+4+7+14=28
    System.out.println("Enter number: ");
    int num_1=scan.nextInt();
    int sum=0;
    for(int i=1;i<num_1;i++) {
    	if(num_1%i==0) {
    		sum+=i;
    	}
    }
    if(num_1==sum) {
    	System.out.println("perfect number");
    }
    else {
    	System.out.println("not a perfect number");
    }
    
    
	}

}
