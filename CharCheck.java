import java.util.Scanner;

public class CharCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a Character: ");
		int character = reader.next().charAt(0);
		if(Character.isUpperCase(character))
			System.out.println("Uppercase Character");
		else if(Character.isLowerCase(character))
			System.out.println("Lowercase Character");
		else if(Character.isDigit(character))
			System.out.println("Digit Character");
		else if (!Character.isDigit(character) && !Character.isLetter(character) && !(character==' '))
			System.out.println("Special Character");
	}

}
