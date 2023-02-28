package Tuesday;

public class Misc {
    public static void main(String[] args) {
        // can initialize a 2d array of size 5 x 5:
        int [][] grid = new int[5][5];
        // you can assign values in the from grid[row][column]
        grid[0][0] = 1;

        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < 5; j ++) {
                // just print the number and a space
                System.out.print(grid[i][j] + " ");
            }
            // at the end of each line, we print a new line:
            System.out.println();
        }
    }
}
