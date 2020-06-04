package hello;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring a string and holding a string value in it. 
		String str = "I am learning string on my own!";
		// printing the value of the string. 
		System.out.println("The string in this example is: "+str);
		//declaring some string variables
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "         Spaces all around         ";
		String str6 = "Hello";
		
		//Printing different String Methods.
		
		//Printing length of a string.
		System.out.println("Length of this string is = " + str.length());
		
		//printing character value at the given index number
		System.out.println("Character value of the 4th index number of this string is = " + str.charAt(0));
		
		//combining string at the end of the string
		System.out.println(str.concat("And I am loving it!! "));
		
		//using contain method to check if given chars are found or not in the string.
		System.out.println("Contains check if word 'my' is found : " + str.contains("my"));
		System.out.println("Contains check if word 'haha' is found : " + str.contains("haha"));
		
		//using startswith to check if string starts with given value or not.
		System.out.println("Starts check if string starts with word 'I' : " + str.startsWith("I"));
		System.out.println("Starts check if string starts with word 'The' : " + str.startsWith("The"));
				
		//using endswith method to check if a string ends with a given value
		System.out.println("endswith check if string ends with word 'own!' : " + str.endsWith("own!"));
		System.out.println("endswith check if string ends with word 'other' : " + str.endsWith("other"));
		
		//using equals method to check if contents are equal.
		System.out.println("checking contents are equal between str1 and str2 " + str1.equals(str2));
		System.out.println("checking contents are equal between str1 and str3 " + str1.equals(str3));
		
		//using indexOf method to find index of a given character.
		System.out.println("checking index of letter 'm' in str is  " + str.indexOf("m"));
		
		//using isEmpty method to find if a string is empty or not.
		System.out.println("checking if str is empty " + str.isEmpty());
		System.out.println("checking if str4 is empty " + str4.isEmpty());
		
		//using trim method to trim leading and trailing spaces.
		System.out.println("triming leading and trailing spaces in str5 = " + str5.trim());
		
		//replace method to replace a character in string.
		System.out.println("replace e with a in str6 = " + str6.replace('e', 'a'));
		
		//substring method to return a part of the string
		System.out.println("substring method to return a part of str from index 5 = " + str.substring(5));
		System.out.println("substring method to return a part of str from index 5 till index 10 = " + str.substring(5, 10));

		
		
		
		
		
		
		
	}

}
