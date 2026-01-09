class DiamondStarPattern {
    public static void main(String[] args) {

        int n = 4;

        // Upper pyramid
        for (int i = 1; i <= n; i++) {
            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower pyramid
        for (int i = n - 1; i >= 1; i--) {
            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
