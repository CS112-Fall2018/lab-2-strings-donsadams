/**
	*I choose the toLowerCase method which  returns the string but with all characters in lower case and the startsWith method which returns a boolean value of ture if the string it is called on starts with the provided string argument.  
**/

public class StringFun {

public static void main(String[] args) {

	String s = " Coding is fun ";
	String otherString = "but also challengening";
	String subString;

	System.out.println(s.length());

	System.out.println(s.equals(otherString));

	subString = s.substring(1,7);
	System.out.println(subString);

	System.out.println(s.trim());
	
	System.out.println(s.indexOf(subString));

	System.out.println(s.lastIndexOf(subString));

	System.out.println(s.charAt(2));

	System.out.println(s.toLowerCase());

	System.out.println(s.startsWith(" Coding"));

}
}