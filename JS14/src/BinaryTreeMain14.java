public class BinaryTreeMain14 {
    public static void main(String[] args) {
        BinaryTree14 bst = new BinaryTree14();
        bst.add(new Student14("244107020230", "Garino", "TI-1I", 3.90));
        bst.add(new Student14("244107020029", "Kenaan", "TI-1I", 3.95));
        bst.add(new Student14("244107020222", "Wahyu", "TI-1I", 3.21));
        bst.add(new Student14("244107020089", "Angelina", "TI-1I", 3.54));
        System.out.println("Student list (in-order traversal)");
        bst.traverseInOrder(bst.root);
        System.out.println("Search data");
        System.out.print("Search a student with IPK: 3.54: ");
        String result = bst.find(3.54) ? "Found" : "Not Found";
        System.out.println(result);
        System.out.print("Search a student with IPK: 3.22: ");
        result = bst.find(3.22) ? "Found" : "Not Found";
        System.out.println(result);
        bst.add(new Student14("244107020223", "Andhika", "TI-1I", 3.72));
        bst.add(new Student14("244107020226", "Bima", "TI-1I", 3.37));
        bst.add(new Student14("244107020181", "Eiyu", "TI-1I", 3.46));
        System.out.println("Student list:");
        System.out.println("In-order traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("Pre-order traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("Post-order traversal:");
        bst.traversePostOrder(bst.root);
        System.out.println("Data deletion");
        bst.delete(3.57);
        System.out.println("Student list after deletion:");
        bst.traverseInOrder(bst.root);
    }
}
