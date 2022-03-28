package se.lexicon.dreas94;
import se.lexicon.dreas94.exercises.exercise1.ExerciseMain1;
import se.lexicon.dreas94.exercises.exercise2.ExerciseMain2;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int choice = -1;
        do
        {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Pick Exercise to run (1-13), 0 exits the program: ");
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                } else {
                    System.out.println("That is not a number between 0-13, TRY AGAIN!");
                    sc.nextLine();
                }
            }
            while (choice == -1);

            switch(choice)
            {
                case 1:
                    ExerciseMain1 exercise1 = new ExerciseMain1();
                    exercise1.runExercise();
                    break;
                case 2:
                    ExerciseMain2 exercise2 = new ExerciseMain2();
                    exercise2.runExercise();
            }
            System.out.println("Exercise " + choice + " has finished. Returning to menu!");
        }while(choice != 0);
    }
}
