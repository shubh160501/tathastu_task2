class FactorialOfNumber {
	public static int fact(int num)
	{
		int res = 1;
		for(int i=num; i>=1; --i){
			res *= i;
		}
		return res;
	}
	public static void main(String[] args){
		int num = 5;
		int res = fact(num);
		System.out.println(res);
	}
}