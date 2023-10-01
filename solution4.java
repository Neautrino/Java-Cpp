import java.util.LinkedList;
import java.util.Queue;

public class solution4 {
    static class Cell {
        int row;
        int col;

        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void BFS_2D_Array(int[][] grid, int start_i, int start_j) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        int[] dr = { 0, 0, 1, -1 };
        int[] dc = { 1, -1, 0, 0 };

        Queue<Cell> queue = new LinkedList<>();

        queue.add(new Cell(start_i, start_j));
        visited[start_i][start_j] = true;

        while (!queue.isEmpty()) {
            Cell currentCell = queue.poll();
            int i = currentCell.row;
            int j = currentCell.col;
            System.out.println("Visiting cell at (" + i + ", " + j + ")");
            for (int k = 0; k < 4; k++) {
                int ni = i + dr[k];
                int nj = j + dc[k];

                if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && !visited[ni][nj]) {
                    queue.add(new Cell(ni, nj));
                    visited[ni][nj] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 0, 1, 0 },
                { 0, 1, 0, 1 },
                { 1, 0, 1, 0 }
        };
        int start_i = 1;
        int start_j = 2;

        System.out.println("Starting BFS traversal from cell (1, 2) in the 2D array.");
        BFS_2D_Array(grid, start_i, start_j);
    }
}