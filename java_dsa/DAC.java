package java_dsa;

import java.util.*;

public class DAC {

  static int bs(int arr[], int key) {
    int i = 0;
    int j = arr.length - 1;
    for (; i <= j;) {
      int mid = (i + j) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] > key) {
        j = mid - 1;
      } else if (arr[mid] < key) {
        i = mid + 1;
      }
    }

    return -1;

  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 1, 0, 4, 23, 10 };
    Arrays.sort(arr);
    int ind = bs(arr,50);
  }
}