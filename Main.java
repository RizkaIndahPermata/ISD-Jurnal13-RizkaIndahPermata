public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        char[] elements = {'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J'};

        for (char element : elements) {
            bst.insert(element);
        }

        System.out.println("Inorder traversal:");
        bst.inorder();
        System.out.println();

        System.out.println("Preorder traversal:");
        bst.preorder();
        System.out.println();

        System.out.println("Postorder traversa:");
        bst.postorder();
        System.out.println();

        System.out.println("Search for K: " + bst.search('K'));
        System.out.println("Search for A: " + bst.search('A'));
    }
}