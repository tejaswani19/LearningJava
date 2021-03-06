package Unit_01;

public class P6_Task02_StringsInJava {
	public static void main(String[] args) {
		StringsInJava obj = new StringsInJava();
		obj.StringDefinition();
		obj.charAndString();
	}

}

class StringsInJava {
	
	void StringDefinition() {
		String s = " hello there!";
		String s1 = new String("hgjhgjf");
		
		System.out.println(s);
		
		//Get length of a string
		System.out.println(s.length());
		
		//Loop through a string
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		String first = "Tejaswani";
		String second = "Upadhyay";
		
		//Add two strings
		String third = first + second;
		System.out.println(third);
		
		//Compare two strings
		boolean result1 = first.equals(second);
		System.out.println(result1);
		
		/*Java strings are immutable
		 * In java, the JVM maintains a string pool to store all of its strings inside the memory.
		 * The string pool helps in reusing the strings.
		      - If the string already exists, the new string is not created.
		         Instead, the new reference, example points to the already existed string(Java).
		      - If the string doesn't exist, the new string Java is created
		 */
		String fourth = "Tejaswani";
		String fifth = new String("Upadhyay!");
	}
	
	/*
	 * Character Arrays are mutable but strings are not
	 */
	void charAndString() {
		
		char[] ch = {'H', 'e', 'l', 'l', 'o', ' ', 'T', 'h', 'e', 'r', 'e'};
		char[] ch2 = {'!', '!'};
		
		System.out.println(ch);
		
		for(int i = 0; i < ch.length; i++) { 
			System.out.println(ch[i]);
		}
		
		String s1 = new String(ch);
		System.out.println(s1);
		
		//Character Arrays are mutable but strings are not!
		ch[0] = 'h';
		//s1.charAt(0) ='h';
		
		/*
		 * Join two java strings - +' can be used to append strings together to form a a new string- nut it is not possible in char array
		 */
		
		s1 = s1 + 'a'; // s1 is a new object with new memory
		//ch = ch + ch2;
		
		//String to char array
		String s2 = "GEEKS";
		char[] ch4 = s2.toCharArray();
		
		//char array to String
		char[] a2 = {'A', 'K', 'A'};
		String s3 = new String(a2);
	}
}
