public class Solution {
  public int[] solve(int[] array) {
    if (array.length <= 1) {
      return array;
    }

    for (int i = 0; i < array.length; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[min] > array[j]) {
          min = j;
        }
      }
      swap(array, i, min);
    }
    return array;
  }

  private void swap(int[] array, int i, int min) {
    if (array[i] == array[min]) {
      return;
    }

    array[i] = array[i] + array[min];
    array[min] = array[i] - array[min];
    array[i] = array[i] - array[min];
  }
}
