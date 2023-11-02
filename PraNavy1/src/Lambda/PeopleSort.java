package Lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class People  {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "People{name='" + name + "', age=" + age + '}';
    }
}

public class PeopleSort {

    public static void main(String[] args) {
        
        List<People> peopleList = Arrays.asList(
                new People("Toral", 21),
                new People("Navya", 21),
                new People("Augu", 20),
                new People("Gaja", 21) );

        peopleList.sort(Comparator.comparingInt(People::getAge));
        System.out.println("Original List: " + Arrays.toString(peopleList.toArray()));
    }
}


