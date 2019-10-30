public class Solution {
  public int[] moveZero(int[] array) {

    if (array.length <= 1) {
      return array;
    }
    int last = array.length - 1;
    for (int i = 0; i < last; i++) {
      if (array[i] == 0) {
        if (array[last] == 0) {
          last--;
        }
        int temp = array[i];
        array[i] = array[last];
        array[last] = 0;
        last--;
      }
    }
    return array;
  }
}
