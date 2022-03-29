package se.lexicon.dreas94.exercises.exercise11;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseMain11
{
    public boolean runExercise()
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[]{};

        while(true)
        {
            System.out.print("Pick a whole number, if a non whole number is picked the input loop will end: ");
            if (sc.hasNextInt())
            {
                int pickedNumber = sc.nextInt();

                if(array.length != 0)
                {

                    array = addIntElementToEndOfArray(array, pickedNumber);
                }
                else
                    array = addIntElementToEndOfArray(array, pickedNumber);
            }
            else
            {
                sc.nextLine();
                System.out.println("That is not a whole number, printing array");
                sc.nextLine();
                break;
            }
        }

        System.out.println("Final Array: " + Arrays.toString(array));

        String reverseArray = reverseArrayString(array, array.length);

        System.out.println("Reversed Final Array: " + reverseArray);

        return array.length != 0 && !reverseArray.isEmpty();
    }

    private int[] addIntElementToEndOfArray(int[] srcArray, int newElement)
    {
        int[] tempArray = Arrays.copyOf(srcArray, srcArray.length + 1);
        tempArray[tempArray.length - 1] = newElement;
        return tempArray;
    }

    static String reverseArrayString(int[] array, int length)
    {
        int temp;
        for (int index = 0; index < length / 2; index++)
        {
            temp = array[index];
            array[index] = array[length - index - 1];
            array[length - index - 1] = temp;
        }

        return Arrays.toString(array);
    }
}
