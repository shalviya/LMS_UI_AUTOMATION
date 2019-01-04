package demo;

import java.util.Scanner;

public class Stringreverse {

	 
	public static void main(String[] args){
		Stringreverse obj=new Stringreverse();
		Scanner sc=new Scanner(System.in);
        System.out.println("input sting to be reversed");
		String string=sc.next();
        
        //obj.stringreverse(string);
        
       System.out.println(obj.stringreverse(string));
		
		
	}
	
	
	
	public String stringreverse(String string) {
		
		
		String reverse= "";
		
		for(int i=string.length()-1;i>=0;i--){
		
		reverse=reverse+string.charAt(i);

		
		}
		return reverse;	
		
	}

}
