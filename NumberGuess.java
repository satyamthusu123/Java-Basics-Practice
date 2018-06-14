import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n;
		do
		{
			System.out.println("Guess the number: ");
			n = reader.nextInt();
			if(n<1)
				System.out.println("Number guessed is less than original number");
			else if(n>50)
				System.out.println("Number guessed is more than original number");
			else
			{
				System.out.println("Number guessed matches the original number");
				break;
			}
		}while(true);
	}

}
