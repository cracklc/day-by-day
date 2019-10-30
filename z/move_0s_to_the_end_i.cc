// https://app.laicode.io/app/problem/258

class Solution {
 public:
  vector<int> moveZero(vector<int> array) {
    // write your solution here
    if (array.empty()) {
      return array;
    }
    int start = 0;
    int end = array.size() - 1;
    while (start <= end) {
      if (array[start] == 0) {
        swap(array[start], array[end--]);
      } else {
        ++start;
      }
    }
    return array;
  }
};
