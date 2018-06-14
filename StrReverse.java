import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a string: ");
		String str = reader.nextLine();
		String reverse = "";

		for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse of String is: " + reverse);
	}

}
