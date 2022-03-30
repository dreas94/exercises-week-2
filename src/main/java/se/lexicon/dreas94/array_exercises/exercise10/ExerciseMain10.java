package se.lexicon.dreas94.array_exercises.exercise10;

public class ExerciseMain10
{
    public boolean runExercise()
    {
        int[][] array = new int[][]{{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        return printMultiplicationTable(array);
    }

    private boolean printMultiplicationTable(int[][] array)
    {
        if(array[0] == null || array[1] == null || array[0].length == 0 || array[1].length == 0 || array[0].length != array[1].length)
            return false;

        int length = array[0].length;
        String multiTableStr = "";

        for(int column = 0; column < length; column++)
        {
            for(int row = 0; row < length; row++)
            {
                if (row != length - 1)
                    multiTableStr = multiTableStr.concat(array[0][column] * array[1][row] + "\t");
                else
                    multiTableStr = multiTableStr.concat(array[0][column] * array[1][row] + "\n");
            }
        }
        System.out.print(multiTableStr);

        return true;
    }
}
