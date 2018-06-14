import java.util.Scanner;

public class Loopn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		for(int i=1;i<=n;i++)
			for(int j=1;j<=i;j++)
				System.out.print(i + " ");
	}

}
