import java.util.Random;
import java.util.Scanner;


public class task2 {
    private static final int  min_range = 1;
    private static final int  max_range = 100;
    private static final int  max_attempts = 10;
    private static final int  max_rounds = 3;

    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalscore = 0 ;
        System.out.println("Number Guessing Game");
        System.out.println("Total Number Of Rounds :3");
        System.out.println("Attempts To Guess Number In Each Round :10\n");
        for (int i=1 ; i<= max_rounds; i++){
            int number = random.nextInt(max_range) + min_range;
            int attempts = 0;
            System.out.printf("round %d: guess The Number Between %d and %d attempts.\n" , i , min_range , max_range,max_attempts);
            while(attempts<max_attempts){
                System.out.println("Enter the Guess :");
                int guess_number = scanner.nextInt();
                attempts = attempts+1;

                if(guess_number == number){
                    int score = max_attempts - attempts;
                    totalscore = totalscore+score;
                    System.out.printf("hurray ! Number guesses successfully. Attempts = %d. round score = %d\n", attempts,score);
                    break;
                }
                else if (guess_number< number) {
                    System.out.printf("the number is greater than %d.Attempts left = %d.\n " , guess_number, max_attempts-attempts);
                }
                else if (guess_number > number) {
                    System.out.printf("the number is less than %d. Attempts left = %d.\n", guess_number, max_attempts-attempts);
                }
            }
            if(attempts ==max_attempts){
                System.out.printf("\nround = %d\n",i);
                System.out.printf("Attempts = 0");
                System.out.printf("The random number is : %d\n\n", number);
            }
        }
        System.out.printf("Game Over. Total Score = %d\n", totalscore);
        scanner.close();
    }


}
