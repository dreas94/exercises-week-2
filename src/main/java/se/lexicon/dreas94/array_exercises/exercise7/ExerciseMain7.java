package se.lexicon.dreas94.array_exercises.exercise7;

public class ExerciseMain7
{
    public boolean runExercise()
    {
        final int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        array[3] = 7;
        array[4] = 9;
        array[5] = 12;

        System.out.println("Array: " + arrayToString(array,true));
        System.out.println("Odd Array: " + arrayToString(array,false));

        return true;
    }

    private String arrayToString(int[] array, boolean showEven)
    {
        String arrayString = "";

        for(int num : array)
        {
            if(num != 0 && ((num % 2 != 0) || showEven))
            {
                arrayString = arrayString.concat(num + " ");
            }
        }
        return arrayString;
    }
}
