import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import java.lang.Math;

public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] dims = new int[2];

        if (sc.hasNextLine()) {
            dims = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        } else {
            sc.close();
            return;
        }

        int rows = dims[0];
        int cols = dims[1];

        int[][] matrix = readMatrix(rows, cols, sc);
        int[] spiralArray = new int[rows * cols];

        // initial arguments for readSpiral()
        int direction = 0; // 0 -> right, 1 -> down, 2 -> left, 3 -> up
        int counter = 0;
        int upperLimit = 0;
        int downLimit = rows;
        int leftLimit = 0;
        int rightLimit = cols;

        readSpiral(matrix, spiralArray, direction, upperLimit, rightLimit, downLimit, leftLimit, counter);
        for (int x : spiralArray) {
            System.out.print(x + " ");
        }

    }

    private static int[][] readMatrix(int matrixRows, int matrixCols, Scanner sc) {

        int[][] matrix = new int[matrixRows][matrixCols];

        for (int row = 0; row < matrixRows; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }

    private static void readSpiral(final int[][] matrix, int[] spiralArray, int direction, int upperLimit,
            int rightLimit,
            int downLimit, int leftLimit, int counter) {

        if (downLimit == upperLimit && leftLimit == rightLimit) {
            return;
        }

        if (direction == 0) {
            for (int col = leftLimit; col < rightLimit; col++) {
                spiralArray[counter] = matrix[upperLimit][col];
                counter++;
            }
            direction = 1;
            upperLimit++;
        } else if (direction == 1) {
            for (int row = upperLimit; row < downLimit; row++) {
                spiralArray[counter] = matrix[row][rightLimit - 1];
                counter++;
            }
            direction = 2;
            rightLimit--;
        } else if (direction == 2) {
            for (int col = rightLimit - 1; col >= leftLimit; col--) {
                spiralArray[counter] = matrix[downLimit - 1][col];
                counter++;
            }
            direction = 3;
            downLimit--;
        } else if (direction == 3) {
            for (int row = downLimit - 1; row >= upperLimit; row--) {
                spiralArray[counter] = matrix[row][leftLimit];
                counter++;
            }
            direction = 0;
            leftLimit++;
        }

        readSpiral(matrix, spiralArray, direction, upperLimit, rightLimit, downLimit, leftLimit, counter);

    }

}
