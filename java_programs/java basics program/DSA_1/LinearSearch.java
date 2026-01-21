import java.util.Scanner;

class LinearSearch
{
	
	int Linear_search(int[] arr,int find_ele){
		
		for(int i=0;i<arr.length;i++){
			if(find_ele == arr[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LinearSearch bs = new LinearSearch();
		
		System.out.print("Ennter the Length :: ");
		int len=sc.nextInt();
		
		int arr[] = new int[len];
		for(int i=0;i<len;i++){
		System.out.print("Enter the element :: ");
		arr[i] = sc.nextInt();
		}
		System.out.print("Enter the Find Element : ");
		int find_ele = sc.nextInt();
		
		//call function binary_search
		
		int index = bs.Linear_search(arr,find_ele);
		
		System.out.println(index);
		
		
		
	}
	
}