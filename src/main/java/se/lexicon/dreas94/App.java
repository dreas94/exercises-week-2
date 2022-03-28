package se.lexicon.dreas94;
import se.lexicon.dreas94.exercises.exercise1.ExerciseMain1;
import se.lexicon.dreas94.exercises.exercise2.ExerciseMain2;
import se.lexicon.dreas94.exercises.exercise3.ExerciseMain3;
import se.lexicon.dreas94.exercises.exercise4.ExerciseMain4;
import se.lexicon.dreas94.exercises.exercise5.ExerciseMain5;
import se.lexicon.dreas94.exercises.exercise6.ExerciseMain6;
import se.lexicon.dreas94.exercises.exercise7.ExerciseMain7;
import se.lexicon.dreas94.exercises.exercise8.ExerciseMain8;
import se.lexicon.dreas94.exercises.exercise9.ExerciseMain9;
import se.lexicon.dreas94.exercises.exercise10.ExerciseMain10;
import se.lexicon.dreas94.exercises.exercise11.ExerciseMain11;
import se.lexicon.dreas94.exercises.exercise12.ExerciseMain12;
import se.lexicon.dreas94.exercises.exercise13.ExerciseMain13;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int choice;
        do
        {
            Scanner sc = new Scanner(System.in);
            do
            {
                choice = -1;
                System.out.println("--------------------------------------------------");
                System.out.print("Pick Exercise to run (1-13), 0 exits the program: ");
                if (sc.hasNextInt())
                {
                    choice = sc.nextInt();
                    if(choice != 0)
                        System.out.println("Running Exercise " + choice);
                    else
                        System.out.println("Exiting Program");
                }
                else {
                    System.out.println("That is not a number between 0-13, TRY AGAIN!");
                    sc.nextLine();
                }
            }
            while (choice == -1);

            System.out.println("--------------------------------------------------");

            switch(choice)
            {
                case 1:
                    //Completed
                    ExerciseMain1 exercise1 = new ExerciseMain1();
                    exercise1.runExercise();
                    break;
                case 2:
                    //Completed
                    ExerciseMain2 exercise2 = new ExerciseMain2();
                    exercise2.runExercise();
                case 3:
                    //Completed
                    ExerciseMain3 exercise3 = new ExerciseMain3();
                    exercise3.runExercise();
                    break;
                case 4:
                    //Completed
                    ExerciseMain4 exercise4 = new ExerciseMain4();
                    exercise4.runExercise();
                    break;
                case 5:
                    //Completed
                    ExerciseMain5 exercise5 = new ExerciseMain5();
                    exercise5.runExercise();
                    break;
                case 6:
                    //Completed
                    ExerciseMain6 exercise6 = new ExerciseMain6();
                    exercise6.runExercise();
                    break;
                case 7:
                    //Completed
                    ExerciseMain7 exercise7 = new ExerciseMain7();
                    exercise7.runExercise();
                    break;
                case 8:
                    //Completed
                    ExerciseMain8 exercise8 = new ExerciseMain8();
                    exercise8.runExercise();
                    break;
                case 9:
                    ExerciseMain9 exercise9 = new ExerciseMain9();
                    exercise9.runExercise();
                    break;
                case 10:
                    ExerciseMain10 exercise10 = new ExerciseMain10();
                    exercise10.runExercise();
                    break;
                case 11:
                    ExerciseMain11 exercise11 = new ExerciseMain11();
                    exercise11.runExercise();
                    break;
                case 12:
                    ExerciseMain12 exercise12 = new ExerciseMain12();
                    exercise12.runExercise();
                    break;
                case 13:
                    ExerciseMain13 exercise13 = new ExerciseMain13();
                    exercise13.runExercise();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }
            System.out.println("Exercise " + choice + " has finished. Returning to menu!");
        }while(choice != 0);
    }
}
