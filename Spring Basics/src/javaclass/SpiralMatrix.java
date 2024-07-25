package javaclass;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, left = 0, right = m - 1, bottom = n - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                list.add(a[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(a[i][right]);
            }
            right--;

            // Check if top row and bottom row are still valid
            if (top <= bottom) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    list.add(a[bottom][i]);
                }
                bottom--;
            }

            // Check if left column and right column are still valid
            if (left <= right) {
                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    list.add(a[i][left]);
                }
                left++;
            }
        }

        // Print the result
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
