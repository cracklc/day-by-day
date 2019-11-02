class Solution {
 public:
  vector<int> rainbowSort(vector<int> array) {
    // write your solution here
    if (array.size() <= 1) {
      return array;
    }
    int start = 0, index = 0, end = array.size() - 1;
    while (index <= end) {
      if (array[index] == -1) {
        swap(array[start++], array[index++]);
      } else if (array[index] == 0) {
        ++index;
      } else if (array[index] == 1) {
        swap(array[index], array[end--]);
      }
    }
    return array;
  }
};
