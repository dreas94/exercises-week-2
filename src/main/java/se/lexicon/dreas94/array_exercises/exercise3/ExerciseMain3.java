package se.lexicon.dreas94.array_exercises.exercise3;
import java.util.Arrays;

public class ExerciseMain3
{
    public boolean runExercise()
    {
        final String[] array = new String[]{"Paris", "London", "New York", "Stockholm"};
        System.out.println("String array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sort string array:: " + Arrays.toString(array));

        return true;
    }
}
