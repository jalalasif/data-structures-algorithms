public class mainDriver {

    public static void main(String[] args) {

        // code for executing Binary Search
//        int [] arr = new int[] {2,4,6,8,10,100,101,122};
//        int res = BinarySearch.binarySearchIterative(arr, 100);
//        System.out.println("Iterative search: " + res); // works
//        int resRe = BinarySearch.binarySearchRecursive(arr, 100);
//        System.out.println("Recursive Search: " + resRe);

        // Code for showing BinaryTree
        BinaryTree<String> A = new BinaryTree<String>();
        BinaryTree<String> B = new BinaryTree<String>();
        BinaryTree<String> C = new BinaryTree<String>();
        BinaryTree<String> D = new BinaryTree<String>();
        BinaryTree<String> E = new BinaryTree<String>();
        BinaryTree<String> F = new BinaryTree<String>();
        BinaryTree<String> G = new BinaryTree<String>();

        A.makeRoot("A");
        B.makeRoot("B");
        C.makeRoot("C");
        D.makeRoot("D");
        E.makeRoot("E");
        F.makeRoot("F");
        G.makeRoot("G");


        A.attachLeft(B);
        A.attachRight(C);

        B.attachLeft(D);
        B.attachRight(E);

        C.attachLeft(F);
        C.attachRight(G);

       BinaryTree.preorderTraversal(A);
        System.out.println();
       BinaryTree.postOrderTraversal(A);
        System.out.println();
       BinaryTree.inOrderTraversal(A);
        System.out.println();
       BinaryTree.levelOrder(A);
        System.out.println();












    }
}
