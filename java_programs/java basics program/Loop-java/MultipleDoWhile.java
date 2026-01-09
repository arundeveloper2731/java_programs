class MultipleDoWhile{
	public static void main(String[] args){
		int i = 1;
		
		do{
			
			int num = i;
			num *= 5;
			
			System.out.println(i +" X 5 = " + num);
			i++;
		}while(i <= 10);
		
	}
}