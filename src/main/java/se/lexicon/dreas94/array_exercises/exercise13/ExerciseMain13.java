package se.lexicon.dreas94.array_exercises.exercise13;

import java.util.Random;

public class ExerciseMain13
{
    public boolean runExercise()
    {
        Random rand = new Random();
        int size = 10;

        int[] source = rand.ints(size,1,100).toArray();

        System.out.println("Original Array: ");
        for (int num : source)
        {
            System.out.print(num + " ");
        }

        int[] dest = separateEvenOddNumbers(source);
        System.out.println("\nArray after separating even and odd numbers : ");
        for (int num : dest)
        {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        return true;
    }

    private int[] separateEvenOddNumbers(int[] array)
    {
        int left = 0;
        int right = array.length-1;

        for(int index = 0; index < array.length; index++)
        {
            while (array[left] % 2 == 1)
            {
                left++;
            }
            while (array[right] % 2 == 0)
            {
                right--;
            }

            if(left<right)
            {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        return array;
    }
}
