public class BinarySearch {

    /**
     * Implements Binary Search algorithm on a sorted array.
     *
     * @param nums   Input (sorted) array.
     * @param target Search target to be located.
     * @return Index value of the position where TARGET is located in the sorted array.
     */
    public static int binarySearchIterative(int[] nums, int target) {

        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int mid = 0;
        int res = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                res = mid;
                break;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (nums[res] != target) {
            return -1;
        } else {
            return res;
        }
    }

    public static int binarySearchRecursiveCall(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;
        if (arr[middle] == target) {
            return middle;
        }

        if (target < arr[middle]) {
            return binarySearchRecursiveCall(arr, target, left, middle - 1);
        }

        if (target > arr[middle]) {
            return binarySearchRecursiveCall(arr, target, middle + 1, right);
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    public static int search (int[] arr, int key, int left, int right) {

        // base condition
        if (left > right) {
            return -1;
        }
        int middle = (left+right)/2;

        if (key == arr[middle]) {
            return middle;
        }

        if (key > arr[middle]) {
            left = middle + 1;
            return search(arr, key, left, right);
        }

        if (key < arr[middle]) {
            right = middle -1;
            return search (arr, key, left, right);
        }

        return -1;
    }


}
