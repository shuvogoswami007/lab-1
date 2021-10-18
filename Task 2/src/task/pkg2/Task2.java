
package task.pkg2;
import java.util.Scanner ;
public class Task2 {

    
    public static void main(String[] args) {
		int p=0,n=0,i;
		Scanner in = new Scanner (System.in);
		int[] a= new int[10];
		
		for(i=1; i<=10; i++)
		{
			a[i] = in.nextInt();
		}
		
		for(i=1; i<=10; i++)
		{
			if(a[i]>0)
			{
				p++;
			}
			else if(a[i]<0)
			{
				n++;
			}
		}
		
		System.out.printf("There are %d pos integers and %d neg integers",p,n);
		

	}
    
}
