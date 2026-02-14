/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


/**
 * Code for end-of-chapter exercises on asymptotics.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Exercises {

  /** Returns the sum of the integers in given array. */
  public static int example1(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j++)       // loop from 0 to n-1
      total += arr[j];
    return total;
  }
  /*
  36 = 3 ops
  37 = 2n
  38 = 2n
  39 = 1
  4n + 4 < T(n) < 4n + 4 (Best case and worst case are the same)

  O(n) because it runs n number of times no matter what.
  Therefore, it scales linearly with the input. (It always loops through the entire array)
   */

  /** Returns the sum of the integers with even index in given array. */
  public static int example2(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j += 2)    // note the increment of 2
      total += arr[j];
    return total;
  }
  /*
  54 = 3 ops
  55 = 2n
  56 = 2n
  57 = 1
  4n + 4 < T(n) < 4n + 4 (Best case and worst case are the same)

  This one is also O(n) because it will run through the entire array no matter what.
  It scales linearly with the input.
   */

  /** Returns the sum of the prefix sums of given array. */
  public static int example3(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j++)       // loop from 0 to n-1
      for (int k=0; k <= j; k++)    // loop from 0 to j
        total += arr[j];
    return total;
  }
  /*
  72 = 3 ops
  73 = 2n
  74 = n^2
  75 = n^2
  76 = 1
  2n^2+4n+4 < T(n^2) < 2n^2+4n+4 (Best case and worst case are the same)

  O(n^2) This function runs through the array n times and n times again.
  Therefore, it is a quadratic function. n*n = n^2
   */

  /** Returns the sum of the prefix sums of given array. */
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0;
    for (int j=0; j < n; j++) {     // loop from 0 to n-1
      prefix += arr[j];
      total += prefix;
    }
    return total;
  }
  /*
  92 = 4 ops
  93 = 2n ops
  94 = n ops
  95 = n ops
  4n + 4 < T(n) < 4n + 4

  O(n) since it always runs through the loop once and scales linearly with input.
   */

  /** Returns the number of times second array stores sum of prefix sums from first. */
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0;
    for (int i=0; i < n; i++) {     // loop from 0 to n-1
      int total = 0;
      for (int j=0; j < n; j++)     // loop from 0 to n-1
        for (int k=0; k <= j; k++)  // loop from 0 to j
          total += first[k];
      if (second[i] == total) count++;
    }
    return count;
  }
  /*
  111 = 3 ops
  112 = 2n
  113 = n
  114 = 2n^2
  115 = 2n^3
  116 = 2n^3
  117 = 3n
  119 = 1
  4n^3 + 2n^2 + 6n + 4

  O(n^3) Runs with 3 loops, so n*n*n = n^3.
   */
}
