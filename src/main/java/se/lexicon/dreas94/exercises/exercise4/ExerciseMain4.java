package se.lexicon.dreas94.exercises.exercise4;

import java.util.Arrays;

public class ExerciseMain4
{
    public void runExercise()
    {
        final int[] array1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        final int[] array2 = Arrays.copyOf(array1,array1.length);

        System.out.println("Elements from first array: " + Arrays.toString(array1));
        System.out.println("Elements from second array: " + Arrays.toString(array2));
    }
}
