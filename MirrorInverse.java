import java.util.*;
import java.util.Arrays;
class MirrorInverse{
	public static boolean isMirrorInverse(int arr[])
	{
		int tempArr[] = new int[arr.length];
		for(int i=0;i<tempArr.length;i++)
		{
			if(arr[i] >= tempArr.length)
				return false;
			tempArr[arr[i]] = i;
		}
		if(Arrays.equals(arr,tempArr))
			return true;
		else 
			return false;
	}
	public static void main(String[] args){
		boolean result;
		int arr[] = {3 , 4 , 2 , 0 , 1};
		int newArr[] = {3 , 4 , 2 , 0};
		result = isMirrorInverse(newArr);
		if(result)
			System.out.println("It is a Mirror Inverse Array");
		else
			System.out.println("It is not a Mirror Inverse Array");
	}
}