package se.lexicon.dreas94.exercises.exercise5;

public class ExerciseMain5
{
    public boolean runExercise()
    {
        final String[][] array = new String[2][2];
        array[0][0] = "France";
        array[0][1] = "Paris";
        array[1][0] = "Sweden";
        array[1][1] = "Stockholm";

        print2DStringArray(array);

        return true;
    }

    private void print2DStringArray(String[][] array)
    {
        for(String[] strArr : array)
        {
            String arrayString = "";
            for (String str : strArr)
            {
                arrayString = arrayString.concat(str + " ");
            }
            System.out.println(arrayString);
        }
    }
}
