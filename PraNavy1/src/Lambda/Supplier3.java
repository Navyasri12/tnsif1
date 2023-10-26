package Lambda;
import java.util.function.*;
public class Supplier3 {

	public static void main(String[] args) {
		int[] nums = {100,520,528,456,154};
		Supplier<Integer> otpGen=() -> {
			int i = (int)(Math.random()*nums.length);
			return nums[i];
		};
		System.out.println(otpGen.get());

	}

}
