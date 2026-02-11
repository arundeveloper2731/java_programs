package doublylinkedlist;

public class DoublyLinkedList 
{
    Node head;
    Node tail;
    void insertElement(int data)
    {
        Node n = new Node(data);
        
        if(head==null){
            head = n;
            tail=n;
        }
        else
        {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }
    void backward(int data){
        Node n= new Node(data);
        
        if(tail==null){
            head = n;
            tail=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head =n;
        }
    }
    void addMiddle(int position,int data)
    {
        if(head == null){
            System.out.println("List is empty");
        }
        if (position == 1) {
        backward(data);   // insert at beginning
        return;
    }
        Node temp = head;
        int count = 1;
        do{
            if(count == position-1){
                Node n=new Node(data);
                n.next = temp.next;
                n.prev = temp;
                if(temp.next !=null)
               {
                   temp.next.prev=n;
               }else{
                    tail = n;
                }
               temp.next=n;
               return;
                
            }
            temp=temp.next;
            count++;
        }while(temp !=null);
    }
 void display(){
     Node temp = head;
        
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
        }
        
        System.out.println("");
 }   
}