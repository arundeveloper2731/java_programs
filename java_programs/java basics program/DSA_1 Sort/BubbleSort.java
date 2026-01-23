class BubbleSort
{
	public static void main(String[] args)
	{
		int[] arr = {5,1,4,2,8,3};
		int passes=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
				if (arr[j]>arr[j+1]){
					int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
				}
			}
	passes++;
		}
	

	System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("\nNumber of Passes: " + passes);
	}

}