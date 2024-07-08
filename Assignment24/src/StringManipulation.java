/*
Write a method that takes two strings, concatenates them, reverses the result, and then extracts the middle substring of the given length. Ensure your method handles edge cases, such as an empty string or a substring length larger than the concatenated string.*/
public class StringManipulation{
	public static void main(String[] args) {
		System.out.println(extractMiddleSubstring("Hello", "World", 5));
	}
	public static String extractMiddleSubstring(String s1, String s2, int length) { 
		String concatenated = s1 + s2;
		String reversed = new StringBuilder(concatenated).reverse().toString();
		int middleIndex = reversed.length()/2;
		if (length > reversed.length()) {
		return "Substring length is larger than the concatenated string";
		} else if(length == 0) {
			return "";
		} else if (reversed.length() == 0) {
			return "Both strings are empty";
		}
		int startIndex = middleIndex - (length / 2);
		int endIndex = startIndex + length;
		if (startIndex < 0) { 
			endIndex = Math.min(endIndex, reversed.length());
			return reversed.substring(0, endIndex);
		}
		else if (endIndex > reversed.length()) { 
			startIndex = Math.max(startIndex, 0);
		return reversed.substring(startIndex);

		}
		return reversed.substring(startIndex, endIndex);

	}
}