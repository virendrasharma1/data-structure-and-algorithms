package trees;

public class TreeNode {

    private int data;
    private TreeNode left;
    private TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }

    void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        }

        if (value > data) {
            if (right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    void inOrderTraversal() {

        if (left != null) {
            left.inOrderTraversal();
        }

        System.out.print(data + " ");

        if (right != null) {
            right.inOrderTraversal();
        }
    }

    void postOrderTravsersal() {

        if (left != null) {
            left.postOrderTravsersal();
        }

        if (right != null) {
            right.postOrderTravsersal();
        }

        System.out.print(data + " ");
    }

    void preOrderTravsersal() {

        System.out.print(data + " ");

        if (left != null) {
            left.preOrderTravsersal();
        }

        if (right != null) {
            right.preOrderTravsersal();
        }
    }

    TreeNode get(int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (left != null) {
                return left.get(value);
            }
        } else {
            if (right != null) {
                return right.get(value);
            }
        }

        return null;
    }

    int getMin() {
            if (left != null) {
                return left.getMin();
            }
        return data;
    }

    int getMax() {
            if (right != null) {
                return right.getMax();
            }
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
