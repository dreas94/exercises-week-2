package se.lexicon.dreas94.exercises.exercise2;
import java.util.Arrays;

public class ExerciseMain2
{
    public boolean runExercise()
    {
        final int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(indexOf(array, 5));

        return true;
    }
    private int indexOf(final int[] array, int num)
    {
        Arrays.sort(array);
        int foundValue = Arrays.binarySearch(array, num);

        if(foundValue < 0)
            return -1;

        return foundValue;
    }
}
