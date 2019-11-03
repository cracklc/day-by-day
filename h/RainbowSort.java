public class Solution {
  public int[] rainbowSort(int[] array) {
    if (array.length == 0) {
      return array;
    }
    int i = 0;
    int j = 0;
    int k = array.length - 1;

    while (j <= k) {
      if (array[j] == -1) {
        swap(array, i++, j++);
      } else if (array[j] == 0) {
        j++;
      } else if (array[j] == 1) {
        swap(array, j, k--);
      }
    }
    return array;
  }

  private void swap(int[] arr, int index1, int index2) {
    if (index1 == index2)
      return;
    arr[index1] = arr[index1] + arr[index2];
    arr[index2] = arr[index1] - arr[index2];
    arr[index1] = arr[index1] - arr[index2];
  }
}
