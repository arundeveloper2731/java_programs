import java .util.Scanner;

class MobileNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		long mobilenum[] = new long[4];
		
		for (int i=0;i<mobilenum.length; i++){
			
			System.out.print("Enter the " + (i+1) + " Mobile Number : ");
			mobilenum[i] = sc.nextLong();
		}
		System.out.println("****** Mobile Number *****");
		
		for(int i=0; i<mobilenum.length; i++){
			
			System.out.println("Number : " + mobilenum[i]);
		}
		
	}
}