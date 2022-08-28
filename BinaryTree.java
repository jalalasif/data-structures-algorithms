/**
 * This program implements a Binary Tree which is to be later used for a Depth-First and Breadth-First Search
 *
 * Basic Primer: Begin with a root node. Then add two "branches" - each of which will be called the root node.
 * Depth: Attribute of a particular NODE based on it's distance from the root node.
 * Height: Attribute of the tree itself based on the level distance between the maximum node and the root node
 *
 * Strictly Binary Tree: Every node either has no child or two children
 * Complete Binary Tree: Every level but the last must have the maximum number nodes possible at that level.
 *
 * Max nodes at a given level N: Max(N) = 2^(N+1) -1
 * Following the above: Max nodes in a Binary Tree at height H is: Max(H) = log(N(Max) + 1) + 1
 *
 * @author jalalasif
 * @version 1.0
 */

public class BinaryTree<T> {

    // Instance variables
    private T data; // this is the data in the root/parent
    private BinaryTree<T> parent; // if this is the primal node, then this parent==root
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    public BinaryTree() {
        parent = left = right = null;
        data = null;
    }

    public T getData() {
        return this.data;
    }

    public boolean isEmpty () {
        if (this.data == null) {
            return true;
        }

        return false;
    }

    public void clear () {
        parent = left = right = null;
    }

    public void makeRoot (T data) {
        if(!this.isEmpty()) {
            System.out.println("Cannot make root; root already exists!");
        } else {
            this.data = data;
        }
    }

    public BinaryTree<T> getParent () {
        return this.parent;
    }

    public BinaryTree<T> getLeft() {
        return left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }

    public void setParent (BinaryTree<T> tree) {
        parent = tree;
    }

    public void setLeft(BinaryTree<T> left) {
        this.left = left;
    }

    public void setRight(BinaryTree<T> right) {
        this.right = right;
    }

    /**
     *
     * @param tree
     *
     * print null is tree is empty
     *
     */
    public void attachLeft (BinaryTree<T> tree) {
        if (tree == null) {
            return;
        }

        if (left != null || tree.getParent() != null) {
            System.out.println("Spot taken");
            return;
        }

        this.setLeft(tree);
        tree.setParent(this);
    }

    public void attachRight (BinaryTree<T> tree) {
        if (tree == null) {
            return;
        }

        if (right != null || tree.getParent() != null) {
            System.out.println("Spot taken");
            return;
        }

        this.setRight(tree);
        tree.setParent(this);
    }

    public BinaryTree<T> detachLeft () {

        if (this.isEmpty()) {
            return null;
        }

        BinaryTree<T> retLeft;
        retLeft = left;
        left = null;

        if (!retLeft.isEmpty()) {
            retLeft.setParent(null);
        }

        return retLeft;
    }

    /**
     * Easier to use a WHILE LOOP instead of doing this through recursion
     * @return returns the ROOT of the tree on which this method is called
     */
    public BinaryTree<T> getRoot () {
        if (this.getParent() == null) {
            return this;
        }

        BinaryTree<T> next = this.getParent();
        while (next.getParent() != null) {
            next = next.getParent();
        }

        return next;

    }

    /**
     * Root -> Left -> Right
     *
     * @param tree
     */
    public static<T> void preorderTraversal (BinaryTree<T> tree) {
        if (tree != null) {
            System.out.print(tree.data); // we can do this b/c we start from the root
            tree.preorderTraversal(tree.getLeft());
            tree.preorderTraversal(tree.getRight());
        }
    }

    /**
     * Left -> Right -> Root
     *
     * Goes to the leftmost node
     * Then looks for right nodes adjacent to currently occupied leftmost node
     * If no rightmost exists, then prints the left, else prints the right
     *
     * Goes up the call stack to print the root at the end
     *
     * @param tree
     */
    public static<T> void postOrderTraversal (BinaryTree<T> tree) {
        if (tree != null) {
            postOrderTraversal(tree.getLeft());
            postOrderTraversal(tree.getRight());
            System.out.print(tree.getData());
        }
    }

    /**
     * Left -> Root -> Right
     *
     * Left call stack: goes all the way down to the left most node
     * Climbs back up by one call stack
     *
     * Immediately executes the next line(s) of code which print the current data -
     * - and then goes on to execute the right call stack on that level
     *
     * @param tree
     */
    public static<T> void inOrderTraversal (BinaryTree<T> tree) {
        if (tree != null) {
            inOrderTraversal(tree.getLeft());
            System.out.print(tree.getData());
            inOrderTraversal(tree.getRight());
        }
    }

    public static <T> void levelOrder(BinaryTree<T> tree) {
        if (tree != null) {
            System.out.print(tree.getData());
            levelOrder(tree.getLeft());
            levelOrder(tree.getRight());
        }
    }




}















