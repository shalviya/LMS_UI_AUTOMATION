package demo;

public class Data_type {
	byte b = 125;

	public static void main(String[] args) {

		Data_type o = new Data_type();

		System.out.println(o.b + o.b + o.b++);

		System.out.println(o.b);

		o.b++;
		System.out.println(o.b);

		o.b++;
		System.out.println();

	}

}
