import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {

            List<Integer> rowList = new ArrayList<>();

            rowList.add(1);

            if (row > 1) {

                List<Integer> previousRow = result.get(row - 1);

                for (int col = 1; col < row; col++) {

                    rowList.add(previousRow.get(col - 1) + previousRow.get(col));
                }
            }

            if (row > 0) {
                rowList.add(1);
            }

            result.add(rowList);
        }

        return result;
    }
}