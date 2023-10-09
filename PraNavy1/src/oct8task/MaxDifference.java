package oct8task;
import java.util.Scanner;
public class MaxDifference {
	public static void main(String[] args) { 
		int i,maxdiff=0;

	Scanner sc=new Scanner(System.in);

	System.out.println("How many numbers you want to enter: "); 
	int n=sc.nextInt();

	

	int num[]=new int[n]; 
	System.out.println("Enter the numbers: ");

	for(i=0;i<n;i++){


	num[i]=sc.nextInt();

	}

	int l=num[0];


	int m=num[0]; for(i=1;i<num.length;i++)
	{

		if(num[i]>1)
		{
			l=num[i];

	} 
	else if(num[i]<m)
	{
	m=num[i];

	}
	}

	maxdiff=l-m;

	System.out.println("The smallest element is: "+m);
	System.out.println("The largest element is:"+l);
	System.out.println("The maximum difference is: "+maxdiff);
	}
}
