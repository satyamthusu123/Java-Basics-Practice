import java.util.Scanner;

public class NumReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int number = reader.nextInt(),k,rev=0,n;
		int count=0;
		n=number;
		while(number>0)
		{
			k=number%10;
			if(k%2==0)
				count+=k;
			rev=rev*10+k;
			number/=10;
		}
		if(n==rev)
			System.out.println("Number is pallindrome");
		else
			System.out.println("Number is not pallindrome");
		if(count>25)
			System.out.println("Sum of even numbers>25");
		else if(count<25)
			System.out.println("Sum of even numbers<25");
		else
			System.out.println("Sum of even numbers=25");

	}

}
