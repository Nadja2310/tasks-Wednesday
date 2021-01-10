package telran;

public class Board {

    public int[] solve(int s1, int s2, int[] columnSums) {
        int[] outputArray = new int[2 * columnSums.length];

        recursive(s1, s2, columnSums, outputArray, outputArray.length - 1);

        return outputArray;
    }

    private int[] recursive(int s1, int s2, int[] columnSums, int[] outputArray, int endIndex) {

        if (columnSums.length == 0)
            return outputArray;
        {

            if (columnSums[columnSums.length - 1] != 1) {

                outputArray[columnSums.length - 1] = outputArray[endIndex] = columnSums[columnSums.length - 1] / 2;
                if (outputArray[columnSums.length - 1] == 1) {
                    s1--;
                    s2--;
                }

            }
            if (columnSums[columnSums.length - 1] == 1) {
                if (s1 < s2) {
                    outputArray[endIndex] = 1;
                    s2--;
                } else {
                    outputArray[columnSums.length - 1] = 1;
                    s1--;
                }

            }

            int[] copyColumnSums = new int[columnSums.length - 1];

            System.arraycopy(columnSums, 0, copyColumnSums, 0, columnSums.length - 1);
            return recursive(s1, s2, copyColumnSums, outputArray, endIndex - 1);

        }
    }


}
