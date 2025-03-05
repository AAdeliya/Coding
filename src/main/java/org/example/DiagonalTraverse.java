package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DiagonalTraverse {
    //public int[] findDiagonalOrder(int[][] mat) {
        public static void main(String[] args) {
            System.out.println("Please enter the rows in the matrix");
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            System.out.println("Please enter the columns in the matrix");
            int column = sc.nextInt();

            int[][] first = new int[row][column];
            int[][] second = new int[row][column];

            for (int r = 0; r < row; r++) {
                for (int c = 0; c < column; c++) {
                    System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                    first[r][c] = sc.nextInt();
                }
            }

            for (int r = 0; r < row; r++) {
                for (int c = 0; c < column; c++) {
                    System.out.println(String.format("Enter second[%d][%d] integer", r, c));
                    second[r][c] = sc.nextInt();
                }
            }

            // close the scanner
            sc.close();

            // print both matrices
            System.out.println("First Matrix:\n");
            print2dArray(first);

            System.out.println("Second Matrix:\n");
            print2dArray(second);

            // sum of matrices
            sum(first, second);
        }

        // below code doesn't take care of exceptions
        private static void sum(int[][] first, int[][] second) {
            int row = first.length;
            int column = first[0].length;
            int[][] sum = new int[row][column];

            for (int r = 0; r < row; r++) {
                for (int c = 0; c < column; c++) {
                    sum[r][c] = first[r][c] + second[r][c];
                }
            }

            System.out.println("\nSum of Matrices:\n");
            print2dArray(sum);
        }

        private static void print2dArray(int[][] matrix) {
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    System.out.print(matrix[r][c] + "\t");
                }
                System.out.println();
            }
        }

    private static void subtract(int[][] first, int[][] second) {
        int row = first.length;
        int column = first[0].length;
        int[][] sum = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                sum[r][c] = first[r][c] - second[r][c];
            }
        }

        System.out.println("\nSubtraction of Matrices:\n");
        print2dArray(sum);
    }

    private static void multiply(int[][] first, int[][] second) {
        int row = first.length;
        int column = first[0].length;
        int[][] sum = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                sum[r][c] = first[r][c] * second[r][c];
            }
        }

        System.out.println("\nMultiplication of Matrices:\n");
        print2dArray(sum);
    }

    public int[] findDiagonalOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return new int[0];
            }

            int N = matrix.length;
            int M = matrix[0].length;

            int[] result = new int[N * M];
            int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();


        for ( int d = 0; d < N + M - 1; d++) {
            intermediate.clear();

            int r = d < M ? 0 : d - M + 1;
            int c  = d < M ? d : M - 1;

            while (r < N && c > - 1) {
                intermediate.add(matrix[r][c]);
                ++r;
                --c;
            }

            if (d % 2 == 0) {
                Collections.reverse(intermediate);
            }

            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
        }

        return  result;
    }
    }
