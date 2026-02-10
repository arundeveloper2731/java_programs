package singlylinkedlist;

public class Main {

    public static void main(String[] args) 
    {
        Insertion list = new Insertion();

        // Insertion
        list.insertionelement(25);
        list.insertionelement(32);
        list.insertionelement(45);
        list.insertionelement(6);
        list.insertionelement(24);
        list.insertionelement(52);

        System.out.println("Before Deletion:");
        list.display();

        // Deletion
        Deletion del = new Deletion();
        del.deletion(list.head, 6);

        System.out.println("After Deletion:");
        del.display(list.head);

    }
    
}
