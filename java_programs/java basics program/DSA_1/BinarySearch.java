import java.util.Scanner;

class BinarySearch
{
	
	int binary_search(int[] arr,int find_ele){
		
		int left=0;
		int right=arr.length-1;
		
		while(left <=right){
			int mid = (left+right)/2;
			
			if(find_ele == arr[mid]){
				return mid;
			}
			else if(find_ele > arr[mid])
			{
				left = mid+1;
			}
			else{
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BinarySearch bs = new BinarySearch();
		
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
		
		int index = bs.binary_search(arr,find_ele);
		
		System.out.println(index);
		
		
		
	}
	
}