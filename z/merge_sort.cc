// https://app.laicode.io/app/problem/9

class Solution {
 public:
  vector<int> mergeSort(vector<int> array) {
    // write your solution here
    if (array.empty()) {
      return array;
    }
    vector<int> helper(array.size());
    sort(array, 0, array.size() - 1, helper);
    return array;
  }

  void sort(vector<int>& array, int start, int end, vector<int>& helper) {
    if (start >= end) {
      return;
    }
    int mid = start + (end - start) / 2;
    sort(array, start, mid, helper);
    sort(array, mid + 1, end, helper);
    merge(array, start, end, helper);
  }

  void merge(vector<int>& array, int start, int end, vector<int>& helper) {
    int mid = start + (end - start) / 2;
    int left = start;
    int right = mid + 1;
    int index = left;
    while (left <= mid && right <= end) {
      if (array[left] <= array[right]) {
        helper[index++] = array[left++];
      } else {
        helper[index++] = array[right++];
      }
    }
    while (left <= mid) {
      helper[index++] = array[left++];
    }
    while (right <= end) {
      helper[index++] = array[right++];
    }
    for (int i = start; i <= end; ++i) {
      array[i] = helper[i];
    }
  }
};
