// https://app.laicode.io/app/problem/10

class Solution {
 public:
  vector<int> quickSort(vector<int> array) {
    // write your solution here
    if (array.empty()) {
      return array;
    }
    quick_sort(array, 0, array.size() - 1);
    return array;
  }

  void quick_sort(vector<int>& array, int start, int end) {
    if (start >= end) {
      return;
    }
    int left = start;
    int right = end;
    int mid = start + (end - start) / 2;
    while (left <= right) {
      while (array[left] < array[mid]) {
        ++left;
      }
      while (array[right] > array[mid]) {
        --right;
      }
      if (left <= right) {
        swap(array[left++], array[right--]);
      }
    }
    quick_sort(array, start, right);
    quick_sort(array, left, end);
  }
};
