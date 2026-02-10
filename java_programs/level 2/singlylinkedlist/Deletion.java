package singlylinkedlist;

public class Deletion 
{
    
   
    void deletion(Node head, int value){
        Insertion in = new Insertion();
        
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.data == value){
            head = head.next;
            System.out.println("Node is deleted");
            
        }
        Node pre = head;
        Node curr = head.next;
        while(curr !=null){
            if(curr.data == value){
                pre.next = curr.next;
                System.out.println("Node deleted");
            }
            pre = curr;
            curr = curr.next;
        }
        
    } void display(Node head){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }
}
