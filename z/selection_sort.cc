class Solution {
 public:
  vector<int> solve(vector<int> array) {
    // write your solution here
    if (array.size() <= 1) {
      return array;
    }
    for (int i = 0; i < array.size(); ++i) {
      int min_index = i;
      for (int j = i + 1; j < array.size(); ++j) {
        if (array[min_index] > array[j]) {
          min_index = j;
        }
      }
      swap(array[i], array[min_index]);
    }
    return array;
  }
};
