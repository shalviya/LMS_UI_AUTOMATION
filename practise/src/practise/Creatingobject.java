package practise;

public class Creatingobject {

public void abc(){
		
	Practise ob1 = new Practise();

	Practise ob2 = new Practise();

	Practise ob3 = new Practise();

	//practise.Practise@659e0bfd
	//practise.Practise@2a139a55
	//practise.Practise@15db9742
	
	System.out.println(ob1);	
	System.out.println(ob2);	
	System.out.println(ob3);
	
	ob1.a=10;
	int a=20;
	
	ob1=ob2;
	ob2=ob3;
	ob3=ob1;
	
	
	System.out.println(ob1);	
	System.out.println(ob2);	
	System.out.println(ob3);
	
	
	System.out.println(ob1.a=20);
	System.out.println(ob1);
	}


public static void main(String[] args){
	
	
	Creatingobject obj=new Creatingobject();
	obj.abc();
}
}
