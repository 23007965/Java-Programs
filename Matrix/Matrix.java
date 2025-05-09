package Matrix;

public class Matrix {
    public static void main(String[] arrgs) {
        boolean flag = true;
        int[][] arr = { { 3, 0, 0, 0, 0 },
                { 0, 3, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 5 }
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("diagonal matrix");
        } else {
            System.out.println("not a diagonal matrix");
        }

    }
}
