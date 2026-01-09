class LargestNumber {
    public static void main(String[] args) {
       
        int num1 = 15;
        int num2 = 38;

        // Check which number is larger
        if (num1 > num2) {
            System.out.println(num1 + " is the largest number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
	
}
