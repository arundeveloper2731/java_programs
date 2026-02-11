package doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList in = new DoublyLinkedList();
        
        in.insertElement(12);
        in.insertElement(14);
        in.insertElement(16);
        in.backward(1237);
        in.addMiddle(2, 177);
        in.addMiddle(4, 345);
        in.display();

    }
    
}
