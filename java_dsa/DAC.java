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

  static int heatersSolve(int houses[], int heaters[]) {
    int minRadius = 0;
    Arrays.sort(heaters);
    for (int house : houses) {
      int nearHeater = bshh(heaters, house);
      if (minRadius < nearHeater) {
        minRadius = nearHeater;
      }
    }
    return minRadius;
  }

  static int bshh(int heaters[], int house) {
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

  static void merge(int arr[],int low,int high,int mid)
  {
    int left[] = new int[mid - low + 1];
    int right[] = new int[high - mid];

    int p = 0;
    for (int i = low; i <= mid ; i++) {
      left[p] = arr[i];
      p++; 
    }
    p = 0;
    for (int i = mid + 1; i <= high; i++) {
      right[p] = arr[i];
      p++;
    }
    
    int k = low;
    int i = 0, j=0;
    
    while (i < (mid - low + 1) && j < (high - mid)) {

      if (left[i] < right[j]) {
        arr[k] = left[i];
        k++;
        i++;
      } else {
        arr[k] = right[j];
        k++;
        j++;
      }
    }
    
    while (i < (mid - low + 1)) {
      arr[k] = left[i];
      k++;
      i++;
    }
    while (i < (high - mid)) {
      arr[k] = right[i];
      k++;
      j++;
    }

  }

  static void ms(int arr[], int low, int high) {
    if (low == high)
      return;

    int mid = (low + high) / 2; // 3
    ms(arr, low, mid);
    ms(arr, mid + 1, high);
    merge(arr, low, high, mid);

  }

  public static void main(String[] args) {
    // * * *
    int houses[] = { 2, 5, 1, 3, 4, 9, 10 };
    int heaters[] = { 1, 4, 5 }; // sort
    // ijm

    heatersSolve(houses, heaters);
  }
}