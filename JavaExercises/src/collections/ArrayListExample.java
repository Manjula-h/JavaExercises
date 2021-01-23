package collections;
import java.util.*;  

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		Iterator<String> itr = list.iterator();
		
		 for(String fruit:list)    
			    System.out.println(fruit);    
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
