
package dsatree;

public class Main {

    public static void main(String[] args) 
    {
        Node root=new Node(8);
        
        root.left = new Node(4);
        root.right = new Node(6);
        
        root.right.left = new Node(10);
        root.right.right = new  Node(14);
        
        System.out.println("Inorder Traversal: ");
        BinaryTree.inorder(root);
        
        System.out.println();
        
        System.out.println("Preorder Travesal: ");
        BinaryTree.preorder(root);
        
        System.out.println();
        
        System.out.println("PostOrder Travesal: ");
        BinaryTree.postorder(root);
        System.out.println();
        
        System.out.println("LevelOrder Traversal: ");
        BinaryTree.levelorder(root);
    }
    
}
