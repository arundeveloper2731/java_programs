package singlylinkedlist;

public class Insertion 
{
    Node head;
    
    void insertionelement(int data)
    {
        Node n = new Node(data, null);
        
        if(head == null){
            head = n;
        }
        else
        {
           Node temp = head;
           
           while(temp.next !=null)
            {
                temp = temp.next;
            }
            temp.next = n;
        }
        
    }
    void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
            
        }
        System.out.println("null");
    }
    
}
