package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StringFilter {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Navya","Praveen","Toral","Jameel","Gaja");

       
        List<String> filteredList = stringList.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());

   
        System.out.println("Original List: " + stringList);
        System.out.println("Filtered List: " + filteredList);

	}


}
