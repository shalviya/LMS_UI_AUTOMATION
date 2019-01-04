package demo;

public class Override {

	public static void main(String[] arg) {


		Calculation a = new Mul();
		a.calculate(10, 20);
		
	}

}


class Calculation{
	
	public void calculate(int a, int b){
		System.out.println(a + b);
	}
	
}

class Mul extends Calculation{
	
	public void calculate(int a, int b){
		System.out.println(a * b);
	}
	
	
	
}