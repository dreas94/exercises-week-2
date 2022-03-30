package se.lexicon.dreas94.array_exercises.exercise12;

public class ExerciseMain12
{
    public boolean runExercise()
    {
        int[][] array = new int[][]{{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("This is the table:");
        array = createMultiplicationTable(array);

        if(array == null)
            return false;

        printTable(array);
        System.out.println("This is the diagonal:");
        printDiagonal(array);
        return true;
    }

    private int[][] createMultiplicationTable(int[][] array)
    {
        if(array[0] == null || array[1] == null || array[0].length == 0 || array[1].length == 0 || array[0].length != array[1].length)
            return null;

        int length = array[0].length;
        int[][] multiTable = new int[length][length];

        for(int column = 0; column < length; column++)
        {
            for(int row = 0; row < length; row++)
            {
                multiTable[column][row] = array[0][column] * array[1][row];
            }
        }
        return multiTable;
    }

    private void printTable(int[][] array)
    {
        int length = array[0].length;
        for(int column = 0; column < length; column++)
        {
            for(int row = 0; row < length; row++)
            {
                if(row != length - 1)
                {
                    System.out.print(array[column][row] + "\t");
                }
                else
                {
                    System.out.print(array[column][row] + "\n");
                }
            }
        }
    }

    private void printDiagonal(int[][] array)
    {
        int length = array[0].length;
        for(int index = 0; index < length; index++ )
        {
            if(index != length - 1)
            {
                System.out.print(array[index][index] + " ");
            }
            else
            {
                System.out.print(array[index][index] + "\n");
            }
        }
    }
}
