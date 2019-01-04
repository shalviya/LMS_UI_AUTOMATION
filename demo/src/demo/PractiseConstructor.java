
package demo;

public class PractiseConstructor {
 static float add;
 
 PractiseConstructor(){
	 
	 this(4,4);
	 
	 
 }
 
	 PractiseConstructor(int a,float b) {
		 this(5);
		this.add=(float) a+b;
		
	System.out.println(add);
	
	
		
	}
PractiseConstructor(int c){
	
	System.out.println(this.add);
	this.add=this.add+c;
	System.out.println(this.add);
	
	
}
	
	
public static void main(String[] args){
	
	
new PractiseConstructor();
	
System.out.println();	
	
}
	
	
	

	
public static void main(String[] agr){
	
 PractiseConstructor p=new PractiseConstructor(new PractiseConstructor(6,7));
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	

