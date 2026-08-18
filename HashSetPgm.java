package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPgm {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet myset = new HashSet();
		HashSet<String> myset1 = new HashSet();
		
		Set<Float> ab = new HashSet();
		
		myset.add("hai@gmail.com");
		myset.add(56);
		myset.add(null);
		
		myset.add(89.4);
		myset.add(89.5);
		
		
		System.out.println(myset);
		System.out.println(myset.size());
		
		for(Object a: myset) {
			System.out.println(a);
		}
		
		Iterator z = myset.iterator();
		while(z.hasNext()) {
			System.out.println(z.next());
		}
		
		myset.remove(null);
		System.out.println(myset);
		

	}

}
