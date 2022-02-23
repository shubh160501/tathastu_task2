import java.util.*;
class FibonacciSeries
{
	public static void fibonacciSeries(int n)
	{
		int num1 = 0,num2 = 1,num3 = 0,i = 0;
		num3 = num1+num2;
		System.out.print("Fibonacci Series: ");
		while(i < n){
			System.out.print( num1 + " ");
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			i++;
		}
	}
	public static void main(String[] args){
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num = scan.nextInt();
		fibonacciSeries(num);
	}
}