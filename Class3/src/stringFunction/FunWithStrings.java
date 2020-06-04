package stringFunction;


public class FunWithStrings {

	public static void main(String[] args) {
		//main method is read from top to bottom
		//String naming convention
		//this is a Snake_case
		//this is a camelCase
		
		//one step to initialize String Value
		//String myValue = "This is a string";
		
		//two step to initialize a String value
		//String anything;
		//anything = "Hello";
		
		//String myValueTwo = "Hello hello";
		
		//System.out.println(myValue + " " + anything);
		//System.out.println(anything);
		
		String name = "James Bond 007";
		int nameSize = name.length();
		System.out.println(nameSize);
		
		//character at index
		char myChar = name.charAt(nameSize-1);
		System.out.println(myChar);
		
		//concat
		String a = "hello";
		String b = "hi";
		System.out.println(a.concat(" ").concat(b));
		System.out.println(b.concat("kldk"));
		
		//contains function
		String x = "xray";
		boolean result = x.contains("r");
		System.out.println(result);
		System.out.println("===================");
		
		//startwith and endswith
		String sentence = "This is James Bond!";
		System.out.println(sentence.startsWith("Th"));
		System.out.println(sentence.startsWith("Th", 3)); //checking if string starts with Th at index 3
		System.out.println(sentence.endsWith("!"));
		System.out.println("===================");
		
		//Equals
		System.out.println("==> equals method <==");
		String m = "marry";
		String n = "nancy";
		String o = "Marry";
		System.out.println(m.equals(n));
		System.out.println(m.equalsIgnoreCase(o));
		
		//indexOf
		System.out.println("==> indeOf <==");
		String d= "david";
		System.out.println(d.indexOf("d"));
		System.out.println(d.indexOf("vid"));
		
		//isEmpty
		System.out.println("==> isEmpty <==");
		
		String e = "empty";
		String ee = "";
		System.out.println(e.isEmpty());//false here bcos e has value
		System.out.println(ee.isEmpty()); // true bcos ee has empty value
		
		//replace method
		System.out.println("==> replace function <==");
		
		String f = "my name is frank";
		f = f.replace("frank", "fred");
		System.out.println(f);
		f = f.replace(" ", "*"); //finding empty space and replace with astric in the string 
		System.out.println(f);
		
		//SubString return a part of the string
		System.out.println("==> SubString function <==");
		String w = "I would like an orange";
		System.out.println(w.substring(5)); //giving substring from index 5 which is l
		System.out.println(w.substring(0, 11));
		// here 11th position will be excluded so it will print upto 10th postion 
		
		//toLowerCase and toUpperCase
		System.out.println("==> toLowerCase and toUpperCase <==");
		
		String L = "Larry";
		System.out.println(L.toUpperCase());
		System.out.println(L.toLowerCase());
		
		//trim removes extra space in the front and end  
		System.out.println("==> trim function <==");
		String space = "         hel     lo      ";
		System.out.println(space);
		System.out.println(space.trim());
		System.out.println(space.replace(" ",""));
		
				
		//toCharArray breaks down the array into individual character
		System.out.println("==> toCharArray <==");
		String z = "zebra";//zebra will become z,e,b,r,a
		char[] item = z.toCharArray();
		System.out.println(item[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//method -- function
			

	}

}
