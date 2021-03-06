package se.lexicon.dreas94.array_exercises.exercise6;

import java.text.DecimalFormat;

public class ExerciseMain6
{
    public boolean runExercise()
    {
        final int[] array = new int[]{43, 5, 23, 17, 2, 14};

        double totalSum = 0.0;
        for(double num : array)
        {
            totalSum += num;
        }
        DecimalFormat df = new DecimalFormat("###.#");

        System.out.println("Average is: " + df.format(totalSum/(double)array.length));

        return true;
    }
}
