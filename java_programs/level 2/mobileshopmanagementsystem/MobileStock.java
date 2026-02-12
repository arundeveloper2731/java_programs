package mobileshopmanagementsystem;

public class MobileStock 
{
    Mobile head;
    
    void insertAtHead(int id,String brandName,double price){
        Mobile m = new Mobile(id, brandName, price);
        
        m.next = head;
        head = m;
        
        System.out.println("Latest Launch mobile added successfully");
    }
    
    void insertAtTail(int id ,String brandName,double price)
    {
        Mobile m = new Mobile(id, brandName, price);
        
        if(head == null){
            head = m;
            
        }
        else
        {
            Mobile temp = head;
            
            while(temp.next !=null)
            {
                temp = temp.next;
            }
            temp.next = m;
        }
        System.out.println("Regular stock Mobile Added Succesfully");
    }
    
    //display
    void display(){
        if(head == null ){
            System.out.println("No Mobile Availabnle in shop");
            return;
        }
        Mobile temp = head;
        System.out.println("...Available Mobiles.....");
        
        while(temp != null){
            System.out.println("============");
            System.out.println("Mobile ID : "+ temp.MobileId);
            System.out.println("Mobile Brand Name : "+ temp.BrandName);
            System.out.println("Mobile Price : "+ temp.Price);
            System.out.println("============");
            
            temp = temp.next;
        }
    }
}
