
package task.pkg5;
import java.util.Scanner ;
public class Task5 {

    public static void main(String[] args) {
      int n,i,number;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		int[] array = new int[n];
		System.out.printf("Enter %d integers: ",n);
		for(i=0; i<n; i++)
		{
			array[i] = in.nextInt();
		}
		
		System.out.printf("Enter the number to search: ");
		
		number = in.nextInt();
		
		int k=0;
		
		for(i=0; i<n; i++)
		{
			if(array[i]== number)
			{
				k++;
			}
		}
		
		System.out.printf("%d Occurred %d Times in The Array.", number,k);
    }
    
}
