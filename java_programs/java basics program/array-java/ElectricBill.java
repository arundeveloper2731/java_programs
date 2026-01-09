import java .util.Scanner;

class ElectricBill{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		double electricBill[] = new double[5];
		
		for (int i=0;i<electricBill.length; i++){
			
			System.out.print("Enter electricBill of " + (i+1) + " person : ");
			electricBill[i] = sc.nextDouble();
		}
		System.out.println("******electricBill*****");
		
		for(int i=0; i<electricBill.length; i++){
			
			System.out.println("ElectricBill : " + electricBill[i]);
		}
		
	}
}