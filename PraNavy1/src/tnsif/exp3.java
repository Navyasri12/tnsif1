package tnsif;

public class exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=62,b=7;
		int d,q;
		while(b!=0)
		{
			d=a%10;
			q=a/10;
			d=d*10;
			a=d+q;
			a=a+1;
			b=b-1;
		}
		System.out.println(a);
	}

}






































































































































































































































































