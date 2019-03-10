package edu.cnm.deepdive;

import java.util.Arrays;

public class Matrices {

  public static void main(String[] args) {
    int[][] matrix = {
        {0, 1, 2, 3},
        {4, 5, 6, 7},
        {8, 9, 10, 11},
        {12, 13, 14, 15}};
    int[][] rotatedMatrix = rotate(matrix);
    for (int i = 0; i < rotatedMatrix.length;
        i++) {
      System.out.println("This is row " + i + ":" + Arrays.toString(
          rotatedMatrix[i]));
    }

  }

  private static int[][] rotate(int[][] matrix) {


    int [][] rotatedMatrix = new int[matrix.length][matrix [0].length] ;


      for (int row = 0; row < matrix.length; row ++){
        for (int col = 0; col < matrix.length; col++)

        System.out.println("We are at [" + row + "]["+ col + "] = " + matrix[row][col]);
    }


    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col ++){
        rotatedMatrix[col] [(matrix.length - 1) - row] = matrix[row][col];
      }

    }

    return rotatedMatrix;
  }

}
