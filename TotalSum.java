import java.util.Scanner;

public class TotalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter number of elements: ");
		int count = reader.nextInt(),sum=0;
		int array[] = new int[count];
		
		System.out.println("Enter the elements: ");
		for (int i=0;i<count;i++)
		{
		array[i]=reader.nextInt();
		sum+=array[i];
		}
		System.out.println("Sum of numbers= " + sum);
	}

}
