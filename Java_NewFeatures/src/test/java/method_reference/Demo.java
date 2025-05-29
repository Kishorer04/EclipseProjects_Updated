package method_reference;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

     List<Integer> al = new ArrayList<Integer>();
     al.add(3);
     al.add(6);
     al.add(99);
//     al.forEach(value -> System.out.println(value));
     
     //method reference ::
     al.forEach(System.out::println);

	}

}
