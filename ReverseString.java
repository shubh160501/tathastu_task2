import java.util.*;
class ReverseString{
	public static String reverseString(StringBuilder str){
		str.reverse();
		return str.toString();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		String reverseString = reverseString(sb);
		System.out.println("Reversed String = " + reverseString);
	}
}