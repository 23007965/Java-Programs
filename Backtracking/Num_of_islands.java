package Backtracking;

public class Num_of_islands {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 1, 1, 0 }, { 1, 0, 1, 1, 0 }, { 1, 0, 0, 1, 0 }, { 0, 1, 0, 0, 1 }
        };
        int op = island(arr);
        System.out.println(op);
    }

    public static void dfs(int i, int j, int m, int n, int[][] arr) {
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1 || arr[i][j] == 0) {
            return;
        }
        arr[i][j] = 0;
        dfs(i + 1, j, m, n, arr);
        dfs(i, j - 1, m, n, arr);
        dfs(i - 1, j, m, n, arr);
        dfs(i, j + 1, m, n, arr);

    }

    public static int island(int[][] arr) {

        int res = 0;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    dfs(i, j, m, n, arr);
                    res++;
                }
            }
        }
        return res;
    }
}