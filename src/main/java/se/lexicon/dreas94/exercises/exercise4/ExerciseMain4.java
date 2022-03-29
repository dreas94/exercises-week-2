package se.lexicon.dreas94.exercises.exercise4;
import java.util.Arrays;

public class ExerciseMain4
{
    public boolean runExercise()
    {
        final int[] array1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        final int[] array2 = Arrays.copyOf(array1,array1.length);

        System.out.println("Elements from first array: " + arrayToString(array1));
        System.out.println("Elements from second array: " + arrayToString(array2));

        return true;
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
