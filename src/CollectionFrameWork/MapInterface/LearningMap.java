<<<<<<< HEAD:src/CollectionFrameWork/MapInterface/LearningMap.java
package CollectionFrameWork.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearningMap {
	public static void main(String[] args) {
		//To achieve key,value pairing we need a map
		//Map is a interface
		// Unique key and multiple values possible
		Map<String,String>one=new HashMap<>();
		one.put("Name", "Shashank");
		one.put("Middle Name", "VijayKumar");
		one.put("Last Name", "Bharadiya");
		one.put("Hobbies", "Reading");
		one.put("Fav sport", "Badminton");
		System.out.println(one);
		System.out.println(one.get("Name"));
		Set<String> aSET=one.keySet();
		System.out.println(aSET);
		for (String key : aSET) {
			System.out.println(key+" "+one.get(key));
		}
		
	}
}
=======
package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearningMap {
	public static void main(String[] args) {
		//To achieve key,value pairing we need a map
		//Map is a interface
		// Unique key and multiple values possible
		Map<String,String>one=new HashMap<>();
		one.put("Name", "Shashank");
		one.put("Name", "Pankaj");
		one.put("Middle Name", "VijayKumar");
		one.put("Last Name", "Bharadiya");
		one.put("Hobbies", "Reading");
		one.put("Fav sport", "Badminton");
		System.out.println(one);
		//System.out.println(one.get("Name"));
		Set<String> aSET=one.keySet();
		System.out.println(aSET);
		for (String key : aSET) {
			System.out.println(key+" "+one.get(key));
		}
		
	}
}
>>>>>>> ed49f085aed14913caf95c95e0ee071b8602ac4a:src/CollectionFramework/MapInterface/LearningMap.java
