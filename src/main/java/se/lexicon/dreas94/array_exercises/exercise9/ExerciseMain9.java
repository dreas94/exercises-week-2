package se.lexicon.dreas94.array_exercises.exercise9;
import java.util.Arrays;

public class ExerciseMain9
{
    public boolean runExercise()
    {
        int[] array = new int[]{20, 40, 30, 50, 60};

        System.out.println("Array: " + arrayToString(array));

        for(int num : array)
        {
            int newElement = (num+10)/2;
            System.out.println("Adding " + newElement + " expanding the arrays size by 1");
            array = addIntElementToEndOfArray(array, newElement);
        }

        System.out.println("Expanded Array: " + arrayToString(array));

        return true;
    }

    private int[] addIntElementToEndOfArray(int[] srcArray, int newElement)
    {
        int[] tempArray = Arrays.copyOf(srcArray, srcArray.length + 1);
        tempArray[tempArray.length - 1] = newElement;
        return tempArray;
    }

    private String arrayToString(int[] array)
    {
        String arrayString = "";

        for(int num : array)
        {
            arrayString = arrayString.concat(num + " ");
        }
        return arrayString;
    }
}
