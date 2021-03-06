import java.util.*;

class Palindrome{
	public static boolean isPalindrome(String str) {
		for(int i=0, j=str.length()-1; i<j; ++i, --j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String (lower or Upper Case): ");
		String str = sc.nextLine();
		boolean res = isPalindrome(str);
		System.out.println(res);
	}
}