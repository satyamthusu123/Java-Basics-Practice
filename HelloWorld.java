import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		if(n>20&&n<30)
		{
			if(n%2!=0)
				System.out.println("Tom");
			else
				System.out.println("Jerry");
		}

	}

}
