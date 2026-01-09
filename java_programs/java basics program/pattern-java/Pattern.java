class Pattern {
    public static void main(String[] args) {

        int totalStars = 26;
        int sideStars = 8;
        int middleSpaces1 = 10;
        int middleSpaces2 = 10;

        // Line 1
        for (int i = 1; i <= totalStars; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Line 2 & 3
        for (int row = 1; row <= 2; row++) {
            for (int i = 1; i <= sideStars; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= middleSpaces1; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= sideStars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Line 4
        for (int i = 1; i <= totalStars; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Line 5,6,7
        for (int row = 1; row <= 3; row++) {
            for (int i = 1; i <= sideStars; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= middleSpaces2; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= sideStars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

      
    }
}
