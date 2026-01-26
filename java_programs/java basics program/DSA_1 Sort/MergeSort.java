import java.util.Arrays;
import java.util.Scanner;
class MergeSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of arr :: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
		System.out.print("enter the element :: ");
            arr[i] = sc.nextInt();
        }
		MergeSort ms = new MergeSort();
		int[] newArr = ms.divide(arr);
		int mid=newArr.length/2;
		System.out.println("the sorted array "+ Arrays.toString(newArr));
		System.out.println("middle elment "+ newArr[mid]);
	}
	int[] divide(int[] arr)
	{
		if(arr.length ==1){
			return arr;
		}
		int mid =arr.length/2;
		int[] left = divide(Arrays.copyOfRange(arr,0,mid));
		int[] right = divide(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left,right);
	}
	int[] merge(int[] left,int[] right){
		int[] newArr = new int[left.length + right.length];
		mergeSort(left,right,newArr,0,0,0);
		return newArr;
		
	}
	void mergeSort(int[] left,int[] right,int[] res,int i,int j,int k)
	{
		if(i<left.length && j<right.length){
			
			if(left[i] <= right[j]){
				res[k] = left[i];
				mergeSort(left,right,res,i+1,j,k+1);
			}
			else if(left[i] >= right[j]){
				res[k] = right[j];
				mergeSort(left,right,res,i,j+1,k+1);
			}
			
		}
		else if(i<left.length){
			res[k] = left[i];
				mergeSort(left,right,res,i+1,j,k+1);
				
		}
		else if(j<right.length){
			res[k] = right[j];
				mergeSort(left,right,res,i,j+1,k+1);
		}
	}
}