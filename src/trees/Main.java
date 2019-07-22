package trees;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(10);
        intTree.insert(4);
        intTree.insert(25);
        intTree.insert(19);
        intTree.insert(11);
        intTree.insert(65);
        intTree.insert(28);
        intTree.insert(88);

        intTree.inOrderTravsersal();
        System.out.println();
        intTree.postOrderTravsersal();
        System.out.println();
        intTree.preOrderTravsersal();

        System.out.println(intTree.getMin());
        System.out.println(intTree.getMax());
    }
}
