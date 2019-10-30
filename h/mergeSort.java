public class Solution {
    public int[] mergeSort(int[] array) {
      if (array.length <= 1) {
        return array;
      }
  
      int [] helper = new int[array.length];
      sort(array, helper, 0, array.length - 1);
      return array;
    }
  
    private void sort(int [] array, int [] helper, int left, int right) {
      if (left >= right) {
        return;
      }
  
      int mid = left + (right - left) / 2;
      sort(array, helper, left, mid);
      sort(array, helper, mid + 1, right);
      merge(array, helper, left, mid, right);
    }
  
    private void merge(int [] array, int [] helper, int left, int mid, int right) {
      for (int i = left; i <= right; i++) {
              helper[i] = array[i];
          }
  
          int i = left;
          int j = mid + 1;
          int idx = left;
          while (i <= mid && j <= right) {
              if (helper[i] < helper[j]) {
                  array[idx] = helper[i];
                  idx++;
                  i++;
              } else {
                  array[idx] = helper[j];
                  idx++;
                  j++;
              }
          }
  
          while (i <= mid) {
              array[idx++] = helper[i++];
          } 
    }
  }
