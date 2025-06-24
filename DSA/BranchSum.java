import java.util.ArrayList;
import java.util.List;

public class BranchSum {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);

        List<Integer> sums = branchSum(root);
        System.out.println("Branch sums: " + sums);
    }

    public static List<Integer> branchSum(BinaryTree root) {
        List<Integer> sums = new ArrayList<>();
        calculateBranchSum(root, 0, sums);
        return sums;
    }

    private static void calculateBranchSum(BinaryTree node, int num, List<Integer> sums) {
        if (node == null)
            return;

        int newNum = num + node.value;
        if (node.left == null && node.right == null) {
            sums.add(newNum);
            return;
        }
        calculateBranchSum(node.left, newNum, sums);
        calculateBranchSum(node.right, newNum, sums);
    }
}

class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
