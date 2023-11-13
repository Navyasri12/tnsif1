package StreamAPI;
import java.util.*;
public class Filter {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n=sc.nextInt();
        System.out.println("Enter the strings:");
        for(int i=1;i<= n;i++) 
        {
            String s=sc.next();
            list.add(s);
        }
        System.out.println("Strings after removing:");
        list.stream().filter(s ->s.length()>5).forEach(System.out::println);
    }
}
