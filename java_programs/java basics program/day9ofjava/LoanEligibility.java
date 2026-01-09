class LoanEligibility {
    public static void main(String[] args) {
        int age1 = 25;
        int income1 = 30000;

        int age2 = 20;
        int income2 = 28000;

        checkEligibility(age1, income1);
        checkEligibility(age2, income2);
    }

    public static void checkEligibility(int age, int income) {
        if (age > 21 && income >= 25000) {
            System.out.println("Eligible for a loan");
        } else {
            System.out.println("Not eligible for a loan");
        }
    }
}
