package demo;

import java.util.Scanner;

public class Factorial {
	Scanner sc= new Scanner(System.in);

	public void factorial() {
		
		System.out.println("enter any number");
		int number= sc.nextInt();
		
		System.out.println("number is"+" "+number);
		long fact =1;
		
		for(int i=0;i<number;i++)
		{
			 fact=fact*(number-i);				
		}
		
		System.out.println("factorial of number is"+ " "+ fact);
		//return factorial();
	}
	
	
	public void sumofnum() {
		
		System.out.println("enter any natural number");
		int number= sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++){
	
			sum=sum+i;
			
		}
		System.out.println("sum of numbers"+ sum);		
	
		
		
	}	
		
		public void tableofnum(){
			System.out.println("input number");
			int number=sc.nextInt();
			System.out.println("table of" +" "+number);
			
			for(int i=1;i<=10;i++){
				
			int num=number*i;
			System.out.println(number+"x"+ i+"="+num);
		
			}
			}
        public void decimaltobinary(){
    
       String s="";
       System.out.println("input any number");
	   int num=sc.nextInt();	
        while(num!=0){
        	
        s=num%2+s;
        num=num/2;
        
        
        
   
        }
        
	 System.out.println("binary value of is"+s);  

	
		
	}		
		
	
	
		
	
public static void main(String[] args){
	
	Factorial f= new Factorial();
	//f.factorial();
	//f.sumofnum();
	//f.tableofnum();
	
	f.decimaltobinary();
}
 

}
