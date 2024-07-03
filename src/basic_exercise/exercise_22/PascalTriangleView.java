package basic_exercise.exercise_22;

public class PascalTriangleView {

    public void AssemblePascalTriangle(int rows)
    {
        int[][] pascal = new int[rows][rows];

        // Calculate the Pascal's triangle values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        // Print Pascal's triangle
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" ");
            }
            // Print the values in the triangle
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
