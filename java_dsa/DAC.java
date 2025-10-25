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

  static int heatersSolve(int houses[], int heaters[])
  {
    int minRadius = 0;
    Arrays.sort(heaters);
    for (int house : houses) {
      int nearHeater = bshh(heaters, house);
      if(minRadius < nearHeater)
      {
        minRadius = nearHeater;
      }

    }
    return minRadius;
  }

  static int  bshh(int heaters[], int house)
  {
    int minDiff = Integer.MAX_VALUE;
    int n = heaters.length;
    int i = 0, j = n - 1;
    while (i <= j) {
      int m = (i + j) / 2;
      int diff = Math.abs(house - heaters[m]);
      if (diff < minDiff) {
        minDiff = diff;
      }

      if (house < heaters[m]) {
        j = m - 1;
      } else if (house > heaters[m]) {
        i = m + 1;
      }
    }
    return minDiff;
  }

  public static void main(String[] args) {
    //                  *  *     *  
    int houses[] = { 2, 5, 1, 3, 4, 9, 10 };
    int heaters[] = { 1, 4, 5 }; // sort 
    //               ijm
    
    heatersSolve(houses, heaters);
  }
}