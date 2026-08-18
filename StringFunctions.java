package basics;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello";
		
		System.out.println(s.length()); // length() // 5
		
		System.out.println(s.charAt(3)); // charAt() // l
		
		String a ="Java";
		String b = "java";
		 
		System.out.println(a.equals(b)); // equals()  // check 2 string values - case sensitive
		System.out.println(a.equalsIgnoreCase(b)); // equalsIgnoreCase() // check two string - ignores case or type
		
		System.out.println(s.contains("llo"));  // contains() // check something present in the string
		System.out.println(s.indexOf("l"));  // indexOf() // check first occurrence index of something
 		System.out.println(s.lastIndexOf("l"));  // lastIndexOf() //check last occurrence index of something
		System.out.println(s.startsWith("He")); //startsWith() // check starts with specific thing or not
		System.out.println(s.endsWith("as")); // endsWith() // check ends with specific thing or not
		
		String p = " Hello world";
		
		System.out.println(p.toUpperCase()); // toUpperCase() // to convert to upper case
		System.out.println(p.toLowerCase());  //toLowerCase() // to convert to lower case
		System.out.println(p.trim()); // .trim() // to remove the spaces
		System.out.println(p.replace('H', 'M'));// replace() //to replace character
		
		String m ="JavaProgramming";
		System.out.println(m.substring(4)); // subString(begin) // extract part of string from a position
		System.out.println(m.substring(0, 4)); // subString(begin,end) // extract part of string between position
		
		
		String n = "apple,orange,banana";
		String [] arr = n.split(",");  // split() // split string into pieces	
		for(String fruit:arr) {
			System.out.println(fruit);
		}
		
		int num = 100;
//		System.out.println(String.valueOf(num));
		String j= String.valueOf(num);
		System.out.println(j); // valueOf() // convert other type to string
		
		String k ="";
		System.out.println(k.isEmpty()); // isEmpty() // check whether the it is empty or not	
		System.out.println(k.isBlank()); // isEmpty() // check whether the it is blank or white space
		
		String ab = "Hai";
		String cd= "How are you";
		System.out.println(ab.concat(cd)); // contact() // to combine the strings		
		
		
		
		
		
	
 		
		
		

	}

}
