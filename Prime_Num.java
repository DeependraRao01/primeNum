package deependra;
import java.util.*;

public class Prime_Num {
	
		public static void main(String[] args) {

			int num, i, count=0;
			Scanner s = new Scanner(System.in);
			
			num = s.nextInt();
			for(i=1 ; i<=num; i++) 
			{
				if(num%i==0)
				{
					count++;
				}
			}
				if(count == 2)
				{
					System.out.println("Prime Number");
				}
				else
				{
					System.out.println("Not a Prime Number");
				}
		}

	}
