public class Tree {
    int key;
    Tree left, right;
    public Tree(int item) {
        key = item;
        left = right = null;
    }
    public static void main(String[] args) {
        Tree root = new Tree(1);
        
        root.left = new Tree(2);
        root.right = new Tree(3);

        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        System.out.println(root.left.key);
    }
}