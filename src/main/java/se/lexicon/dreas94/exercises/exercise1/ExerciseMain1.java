package se.lexicon.dreas94.exercises.exercise1;

public class ExerciseMain1
{
    int[] array;

    public void printArray()
    {
        array = new int[]{11, 23, 39};

        for (int element : array)
        {
            System.out.print(element + " ");
        }
    }
}
