package trees;

class Tree {

    private TreeNode root;

    void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    void inOrderTravsersal() {
        if (root != null) {
            root.inOrderTraversal();
        }
    }

    void postOrderTravsersal() {
        if (root != null) {
            root.postOrderTravsersal();
        }
    }

    void preOrderTravsersal() {
        if (root != null) {
            root.preOrderTravsersal();
        }
    }

    TreeNode get(int data) {
        return root.get(data);
    }

    int getMin() {
        return root.getMin();
    }

    int getMax() {
        return root.getMax();
    }
}
