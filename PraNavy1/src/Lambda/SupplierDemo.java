package Lambda;
import java.util.function.*;

public class SupplierDemo {

	public static void main(String[] args) {
		String[] names= {"Ajay","Sakthi","Bala","kaviya","Navya"};
		Supplier<String> obj=() -> {
			int i = (int)(Math.random()*5);
			return names[i];
		};
		System.out.println(obj.get());
	}

}
