package shoppingcart;

public class ShoppingCart {
 
    Product head ;
    
    void addItem(int productId,String productName,double price )
    {
        Product p = new Product(productId, productName, price);
        if(head == null)
        {
            head = p;
        } 
        else
        {
            Product temp = head;
            
            while(temp.next !=null)
            {
                temp = temp.next;
            }
            temp.next = p;
        }
       
    }
   //display items
    
    void cartItem()
    {
        Product temp= head;
         
         if(head==null)
         {
             System.out.println("List data is empty");
         }
         
         while(temp!=null)
         {
             System.out.println("Product Id :: "+temp.productId);
             System.out.println("Product Name :: "+temp.productName);
             System.out.println("Price "+temp.price);
             System.out.println("_________(..)_________");
             temp=temp.next;
         }
    }
    
    
}
