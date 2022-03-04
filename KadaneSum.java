public class KadaneSum {


    /**
     * Implementation of Kadane's algorithm as a solution to the maximum sum subarray problem
     * @param arr integer array containing values to be computed
     * @return the sum of the maximum subarray
     */
    public int kadaneSum (int[] arr) {

        // initialize variables
        int globalMax = arr[0];
        int currentSum = arr[0];

        // trivial case #2
        if (arr.length == 1) {
            return arr[0];
        }

        // iterate through the array to compare current sum and global sum
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum+arr[i]);
            globalMax = Math.max(globalMax, currentSum);
        }

        return globalMax;
    }

}
