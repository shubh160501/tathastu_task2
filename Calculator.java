import java.lang.Math.*;
import java.util.*;
class CalculatorFunctions{
	double num1,num2;
	CalculatorFunctions(double num1,double num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	double add(){
		return num1+num2;
	}
	double subtract(){
		return num1-num2;
	}
	double multiply(){
		return num1*num2;
	}
	double divide(){
		return num1/num2;
	}

}
class Calculator{
	public static void main(String[] args){
		boolean loop =  true;
		double num1,num2= 0;
		int choice=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Num 1: ");
		num1 = scan.nextDouble();
		System.out.println("Enter Num 2: ");
		num2 = scan.nextDouble();
		CalculatorFunctions c1 = new CalculatorFunctions(num1,num2);

		while(loop)
		{
			System.out.println("Enter number of operation you want to perform:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			choice = scan.nextInt();
			switch(choice){
				case 1:
					System.out.println("Addition:"+c1.add());
					break;
				case 2:
					System.out.println("Subtraction:"+c1.subtract());
					break;
				case 3:
					System.out.println("Multiplication:"+c1.multiply());
					break;
				case 4:
					System.out.println("Division:"+c1.divide());
					break;
				case 5:
					loop = false;
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
	}	
}
