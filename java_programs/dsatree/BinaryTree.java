package dsatree;

import java.util.LinkedList;
import java.util.Queue;




public class BinaryTree  {
    
    //inorder traversal
    public static void inorder(Node root){
        if(root == null)
        {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data+"-> ");
        inorder(root.right);
    }
    
    //Preorder traversal
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"-> ");
        preorder(root.left);
        preorder(root.right);
    }
    
    //Postorder traversal
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"-> ");
    }
    
    //level order
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            Node current = queue.poll();
            System.out.print(current.data+"-> ");
            
            if (current.left !=null) {
                queue.add(current.left);
            }   
            
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

}