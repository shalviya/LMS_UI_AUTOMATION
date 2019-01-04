

package demo;

public class Main {

	private char[] arr = { '0', '0', '0', '0', '0', '0', '0', '0' };

	public static void main(String[] args) {

		Main main = new Main();
		
		Thread1 t1 = new Thread1(main);
		Thread1 t2 = new Thread1(main);
		
		t1.start();
		System.out.println("Thread 1 start");
		t2.start();
		System.out.println("Thread 2 start");
		
	}

	public synchronized void update(String s){
		int index = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == '0'){
				arr[i] = s.charAt(index);
				index++;
				if(index == s.length()) break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(new String(arr));
	}

}

class Thread1 extends Thread {

	private Main main;

	String s = "rana";

	public Thread1(Main main) {
		this.main = main;
	}

	public void run() {
		main.update(s);
	}
}
