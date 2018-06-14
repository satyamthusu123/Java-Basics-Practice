import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a string: ");
		String str = reader.nextLine();
		char charcheck;
		
		for(int i = 0; i < str.length(); i++)
		{
			charcheck=Character.toUpperCase(str.charAt(i));
			
			if(!Character.isLetter(str.charAt(i)))
				System.out.print("Input not Letter ");
			else if(charcheck=='A'||charcheck=='E'||charcheck=='I'||charcheck=='O'||charcheck=='U')
				System.out.print("Vowel ");
			else
				System.out.print("Consonant ");
		}
	}

}
