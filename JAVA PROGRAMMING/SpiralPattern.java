// Q28..Spiral pattern of a number.
public class SpiralPattern {
    public static void main(String[] args) {
        int n = 5, val = 1;
        int[][] arr = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (val <= n * n) {
            for (int i = left; i <= right; i++) arr[top][i] = val++;
            top++;
            for (int i = top; i <= bottom; i++) arr[i][right] = val++;
            right--;
            for (int i = right; i >= left; i--) arr[bottom][i] = val++;
            bottom--;
            for (int i = bottom; i >= top; i--) arr[i][left] = val++;
            left++;
        }
        for (int[] row : arr) { for (int x : row) System.out.printf("%3d", x); System.out.println(); }
    }
}

