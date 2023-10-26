package Lambda;
import java.util.function.*;
public class Supplier4 {
	public static void main(String[] args) {
	Supplier<Integer> otpGen=() -> {
		int i = (int)(Math.random()*10000);
		return i;
	};
	for(int i =1;i<=100;i++)
	{
		int otp= getOtp(otpGen);
		System.out.println("OTP:" +otp);
		try {
		Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
	}
	}
}

static int getOtp(Supplier<Integer> otpGen)
{
	int random = otpGen.get();
	if(random<1000)
	{
		getOtp(otpGen);
	}
	return random;
}
}
