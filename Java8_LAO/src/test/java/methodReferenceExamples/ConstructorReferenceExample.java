package methodReferenceExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		
		
		List<String> heroesList = new ArrayList<String>();
		heroesList.add("Batman");
		heroesList.add("Flash");
		heroesList.add("SuperMan");
		heroesList.add("Batman");
		
		Set<String> heroesSet = new HashSet<String>(heroesList);
		
//		System.out.println(heroesSet);
		
		
		Function<List<String>,Set<String>> lambda_listToSet = list-> new HashSet<String>(list);
		System.out.println(lambda_listToSet.apply(heroesList));
		
		Function<List<String>,Set<String>> methRef_listToSet = HashSet::new;
		System.out.println(methRef_listToSet.apply(heroesList));
		
		
		

	}

}
