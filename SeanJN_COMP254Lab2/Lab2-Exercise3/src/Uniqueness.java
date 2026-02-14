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

import java.util.Arrays;

/**
 * Demonstration of algorithms for testing element uniqueness.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Uniqueness {

  /** Returns true if there are no duplicate elements in the array. */
  public static boolean unique1(int[] data) {
    int n = data.length;
    for (int j=0; j < n-1; j++)
      for (int k=j+1; k < n; k++)
        if (data[j] == data[k])
          return false;                    // found duplicate pair
    return true;                           // if we reach this, elements are unique
  }

  /** Returns true if there are no duplicate elements in the array. */
  public static boolean unique2(int[] data) {
    int n = data.length;
    int[] temp = Arrays.copyOf(data, n);   // make copy of data
    Arrays.sort(temp);                     // and sort the copy
    for (int j=0; j < n-1; j++)
      if (temp[j] == temp[j+1])            // check neighboring entries
        return false;                      // found duplicate pair
    return true;                           // if we reach this, elements are unique
  }

  public static int binarySearch(String algorithm, int low, int high) {
    if (low > high) {
      return -1;
    }

    int mid = low + (high - low) / 2;

    // Create an array to test with
    int[] arr = new int[mid];
    for (int i = 0; i < mid; i++)
      arr[i] = i;

    // Run the algorithm and track the time
    long startTime = System.currentTimeMillis();
    if (algorithm.equals("unique1"))
      unique1(arr);
    else if (algorithm.equals("unique2"))
      unique2(arr);
    long endTime = System.currentTimeMillis();
    long elapsed = endTime - startTime;
    long timeInSeconds = elapsed / 1000;

    System.out.println(elapsed + " " + timeInSeconds + " " + mid);

    // Binary search inspired algorithm
    if (timeInSeconds <= 60) {
      return mid + binarySearch(algorithm, mid + 1, high);
    }
    else {
      return binarySearch(algorithm, low, mid - 1);
    }
  }

  public static void main(String[] args) {
    int low = 0;
    int high = 1000000;

    /*
    unique1 test
    The highest n value I found was 868162, and it took about ~20 loops
     */
    System.out.println("Largest n value for unique1: " + binarySearch("unique1", low, high));

    low = 0;
    high = 999999999;
    /*
    unique2 test
    Even with the max int value, max running time I get is 1 second, then I get an OutOfMemoryError,
    so the highest n value would be more than my computer could handle.
     */
    System.out.println("Largest n value for unique2: " + binarySearch("unique2", low, high));
  }
}
