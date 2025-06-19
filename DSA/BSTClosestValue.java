public class BSTClosestValue {
    public static void main(String[] args) {
        BST root = new BST(10);
        root.left = new BST(5);
        root.right = new BST(15);
        root.left.left = new BST(2);
        root.left.right = new BST(5);
        root.right.left = new BST(13);
        root.right.right = new BST(22);
        root.left.left.left = new BST(1);
        root.right.left.right = new BST(14);

        int target = 12;

        System.out.println(closestValue(root, target));
    }

    // private static int closestValue(BST tree, int target) {
    // return closestValueHelper(tree, target, Integer.MAX_VALUE);
    // }

    // private static int closestValueHelper(BST tree, int target, int closeValue) {
    // if (tree == null)
    // return closeValue;

    // if (Math.abs(target - closeValue) > Math.abs(target - tree.value)) {
    // closeValue = tree.value;
    // }

    // if (target > tree.value) {
    // return closestValueHelper(tree.right, target, closeValue);
    // }
    // if (target < tree.value) {
    // return closestValueHelper(tree.left, target, closeValue);
    // }
    // return closeValue;
    // }

    private static int closestValue(BST tree, int target) {
        return closestValueHelper(tree, target, Integer.MAX_VALUE);
    }

    private static int closestValueHelper(BST tree, int target, int closeValue) {
        BST currentNode = tree;

        while (currentNode != null) {
            if (Math.abs(target - closeValue) > Math.abs(target - currentNode.value)) {
                closeValue = currentNode.value;
            }

            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }

        return closeValue;
    }

    static class BST {
        int value;
        BST left, right;

        BST(int value) {
            this.value = value;
        }
    }

}
