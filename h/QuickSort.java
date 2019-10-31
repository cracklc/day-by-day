public class Solution {
    public int[] quickSort(int[] array) {
    int low = 0;
    int high = array.length - 1;
    QuickSort (array, low, high);
    return array;
    }
  
    void QuickSort(int R[], int low, int high) {
      int i, j, temp;
      i = low;
      j = high;
      if (low < high) {
          temp = R[low];    //设置枢轴
          while (i != j) {
              while (j > i && R[j] >= temp) {
                  --j;
              }
              if (i < j) {
                  R[i] = R[j];
                  ++i;
              }
  
             while (i < j && R[i] < temp) {
                  ++i;
              }
              if (i < j) {
                  R[j] = R[i];
                  --j;
              }
          }
          R[i] = temp;
          QuickSort(R, low, i - 1);
          QuickSort(R, i + 1, high);
      }
  }
}
