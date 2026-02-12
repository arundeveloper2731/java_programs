package mobileshopmanagementsystem;

public class Mobile 
{
    int MobileId;
    String BrandName;
    double Price;
    Mobile next;

    public Mobile(int MobileId, String BrandName, double Price) {
        this.MobileId = MobileId;
        this.BrandName = BrandName;
        this.Price = Price;
        Mobile next = null;
    }
    
    
    
}
