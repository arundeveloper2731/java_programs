import java.util.Scanner;

class GameRanking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Score :: ");
        long score = sc.nextLong();

        System.out.print("Enter Time Taken :: ");
        double time = sc.nextDouble();

        //WRONG CASTING 
        int wrongTime = (int) time;   
        double rankWrong = score / wrongTime;   

        System.out.println("Wrong Casting Rank Score: " + rankWrong);

        // CORRECT CASTING
        double correctTime = (double) time;    
        double rankCorrect = score / correctTime;

        System.out.println("Correct Casting Rank Score: " + rankCorrect);

        
        if (wrongTime != time) {
            System.out.println("Why wrong casting fails:");
            System.out.println(" Time " + time + " becomes " + wrongTime + " after casting to int.");
            System.out.println(" Decimal value is lost.");
            System.out.println(" Rank calculation becomes inaccurate.");
        }
    }
}
