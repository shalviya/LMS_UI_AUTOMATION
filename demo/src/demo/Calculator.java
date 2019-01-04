package demo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] arg)
	{
		System.out.println("input any two number");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("a :-  "+a);

		int b = sc.nextInt();
		System.out.println("b :-  "+b);
		char operator= sc.next().charAt(0);
		System.out.println(operator);
		


	
		switch(operator){
		case '+':
			
			System.out.println(add(a,b));
			
			break;
		case '-':
			
			System.out.println(subtract(a,b));
			
			break;
			
		case '/':
			
			System.out.println(division(a,b));
			break;
			
		case '*':
			
			System.out.println(multiply(a,b));
			break;
			
case '%':
			
			System.out.println(modulus(a,b));
			break;
			
		default: 
			System.out.println("no operation to perform");
		
		}
		
		
	}

	
	public static int add(int a,int b){
	
		int add= a+b;
		
		
		return add;
		
		
		
	}
	
	public static int subtract(int a,int b){
		
		int sub;
		if(a<b){
			
			 sub=b-a;
			return sub;
		}
		
		else{
			
			 sub=a-b;
		return sub;
		
		}
		
		
		
	}
	
	public static int multiply(int a,int b){
		
		int mul=a*b;
		return mul;
		
	}
	
	public static int division(int a,int b){
		
		float division=(float)a/b;
		return (int) division;
		
		
		
	}
	
public static int modulus(int a,int b){
		
		float modulus=(float)a%b;
		return (int) modulus;
		
		
		
	}
	
}
