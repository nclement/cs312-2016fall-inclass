import java.util.*;

public class WarmestPenguin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                grid[i][j] = scan.nextInt();

        print2D(grid);

        int fatness = fattestPenguin(grid);

        System.out.println(fatness);
    }

    public static void print2D(int[][] grid) {
        for (int i = 0; i < grid.length; i++)
            System.out.println(Arrays.toString(grid[i]));
    }

    public static int fatnessOfNeighbors(int[][] grid, int x, int y) {
        int result = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int nx = x + dx;
                int ny = y + dy;
                // (0, 0) => (-1, 0)
                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols)
                    result += grid[nx][ny];
            }
        }
        return result - grid[x][y];
    }

    public static int fattestPenguin(int[][] grid) {
        int result = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int tmp = fatnessOfNeighbors(grid, i, j);
                System.out.println(i + " " + j + " " + tmp);
                result = Math.max(result, tmp);
            }
        }

        return result;
    }
}
