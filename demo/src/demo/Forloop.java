package demo;

public class Forloop {

	public static void main(String[] agrs){
		 int x = 0; 
	        long y = 10; 
	          
	        for (y = 0, x = 1; x < 5; x++)  
	        {  
	            System.out.print(x +"\r\n" ); 
	          
	        } 
	   Forloop obj = new  Forloop();
	 obj.subchar("shalviya",2);
	        
	}
String subchar(String st,int a){

  String front=st.substring(0,a);
	System.out.println(front);
	return front;
}
public String delDel(String str) {
	  /*if(str.length()<3||str.equals("del")){
	  return str;}
	  
	  if(str.contains("del")){
	  String delstring=str.indexOf("del").
	  
	  */
	  
//	  abcdelhell
//	  0123456789
	  
	  String s = "del";
	  int size = s.length();
	  int i = str.indexOf(s);
	  int a=i+size;
	  
	  String s1 = str.substring(0, i) + str.substring(a,str.length());
	return s1;
	  
	  
	  }
	}

