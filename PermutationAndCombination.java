import java.util.*;
class PermutationAndCombination{
	public static int fact(int num)
	{
		int res = 1;
		for(int i=num; i>=1; --i){
			res *= i;
		}
		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of fisrt numebr: ");
		int first_num = sc.nextInt();
		// sc.nextLine();
		System.out.println("Enter Value of second numebr: ");
		int second_num = sc.nextInt();
		int permutation = (fact(first_num) / fact(first_num - second_num));
		int combination = (fact(first_num) / (fact(first_num - second_num) * fact(second_num)));
		System.out.println("Permuattions : " + permutation);
		System.out.println("Combinations : " + combination);
	}
}