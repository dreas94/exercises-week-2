package se.lexicon.dreas94.exercises.exercise8;

import java.util.Arrays;

public class ExerciseMain8
{
    public boolean runExercise()
    {
        int[] array = new int[]{20, 20, 40, 20, 30, 40, 50, 60, 50};
        int arrayLength = array.length;
        System.out.println("Array: " + arrayToString(array, arrayLength));
        Arrays.sort(array);
        arrayLength = removeDuplicates(array, arrayLength);
        System.out.println("Array without duplicate values: " + arrayToString(array, arrayLength));

        return true;
    }

    private int removeDuplicates(int[] array, int arrayLength)
    {
        if (arrayLength == 0 || arrayLength == 1)
        {
            return arrayLength;
        }

        int newArrayLength = 0;

        for (int i = 0; i < arrayLength - 1; i++)
        {
            if (array[i] != array[i + 1])
            {
                array[newArrayLength++] = array[i];
            }
        }

        array[newArrayLength++] = array[arrayLength - 1];

        return newArrayLength;
    }

    private String arrayToString(int[] array, int arrayLength)
    {
        String arrayString = "";

        for(int i = 0; i < arrayLength; i++)
        {
            arrayString = arrayString.concat(array[i] + " ");
        }
        return arrayString;
    }
}
