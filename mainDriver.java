public class mainDriver {

    public static void main(String[] args) {

        // code for executing Binary Search
        int [] arr = new int[] {2,4,6,8,10,100,101,122};
        int res = BinarySearch.binarySearchIterative(arr, 100);
        System.out.println("Iterative search: " + res); // works
        int resRe = BinarySearch.binarySearchRecursive(arr, 100);
        System.out.println("Recursive Search: " + resRe);









    }
}
