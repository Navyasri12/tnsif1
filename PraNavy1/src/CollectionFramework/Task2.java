package CollectionFramework;

import java.util.*;

class Shopping{
	String name;
	double price;
	public Shopping(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
}
public class Task2 {
	public static void main(String[] args) {
		LinkedList<Shopping> l=new LinkedList<>();
		double totalcost=0.0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\nOptions:");
			System.out.println("1.Add item to cart");
			System.out.println("2.Remove item from cart");
			System.out.println("3.View cart and total price");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("Enter item name:");
				String itname=sc.next();
				System.out.println("Enter item price:");
				double itprice=sc.nextDouble();
				Shopping sn=new Shopping(itname,itprice);
				l.add(sn);
				totalcost+=itprice;
				break;
				
			case 2:
				System.out.println("Enter the item to remove:");
				String removeit=sc.next();
				for(Shopping it:l)
				{
					if(it.name.equals(removeit))
					{
						totalcost-=it.price;
						l.remove(it);
						System.out.println(removeit+"removed from the cart");
						break;
					}
				}
				break;
				
			case 3:
				System.out.println("Items in the cart:");
				for(Shopping it:l)
				{
					System.out.println(it.name+"-"+"Rs."+it.price);
				}
				System.out.println("Totalcost: RS."+totalcost);
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!!! please enter the valid choice to proceed!");

			}
		}

	}

}
