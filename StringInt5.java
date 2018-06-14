import java.util.Scanner;

public class StringInt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter input1 (A String): ");
		String input1 = reader.nextLine();
		int length1=input1.length();

		System.out.println("Enter input2 (A Number): ");
		int input2 = reader.nextInt();

		String output = "", substring="";
        output += input1;
		for( int i=(length1-input2);i<length1;i++)
			substring+=input1.charAt(i);
		for(int i = 1; i<=(length1-input2);i++)
		{
			output = output + substring;
		}
		System.out.println("Output String is: " + output);
	}

}
