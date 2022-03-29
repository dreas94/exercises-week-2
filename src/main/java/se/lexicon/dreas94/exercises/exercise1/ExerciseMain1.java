package se.lexicon.dreas94.exercises.exercise1;

public class ExerciseMain1
{
    final int[] array = new int[]{11, 23, 39};

    public boolean runExercise()
    {
        printArray();
        return true;
    }

    private void printArray()
    {
        for (int i = 0; i < array.length; i++)
        {
            if(i == array.length - 1)
            {
                System.out.println(array[i]);
                break;
            }

            System.out.print(array[i] + " ");
        }
    }
}
