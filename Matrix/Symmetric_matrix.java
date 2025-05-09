package Matrix;
public class Symmetric_matrix {
    public static void main(String[] args) {
        boolean flag = true;
        int[][] arr = { { 2, 3, 6 },
                { 3, 4, 5 },
                { 6, 5, 9 }
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("Skew matrix");
        } else {
            System.out.println("not a skew matrix");
        }
    }
}
