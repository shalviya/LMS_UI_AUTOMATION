package demo;

public class Stringquestions {

	public static void main(String[] args) {
		String s = "shalviya shikhar";
		int shiftTimes = 3;
		Stringquestions obj = new Stringquestions();
		obj.encrypt("shalviya", 2);
		obj.decrypt("ujcnxkac", 2);
	}

	private void encrypt(String text, int shift) {
		String output = "";
		for (int i = 0; i < text.length(); i++) {

			char a = text.charAt(i);
			if (a + shift > 'z') {
				a = (char) (a - 'z' + 'a' - 1);
			}
			output += (char) (a + shift);
			// output = output + (char)(a+2);

		}
		System.out.println(output);
	}

	private void decrypt(String inputstring, int key) {
		String decryption = "";
		for (int i = 0; i < inputstring.length(); i++) {

			char b = inputstring.charAt(i);
			decryption += (char) (b - key);

		}

		System.out.println(decryption);

	}
}
