import java.util.*;
class RemoveElement
{
	public static ArrayList<Integer> removeElement(ArrayList<Integer> numList,int key)
	{
		numList.remove(new Integer(key));
		return numList;
	}
	public static void main(String[] args){
		ArrayList<Integer> numList = new ArrayList<>();
 		numList.add(10);
 		numList.add(20);
 		numList.add(30);
 		numList.add(40);
 		numList.add(50);
 		System.out.println(numList);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to remove from ArrayList:");
		int key = scan.nextInt();
		ArrayList<Integer> numListAfterRemovingElement = removeElement(numList,key);
		System.out.println(numListAfterRemovingElement);
	}
}