
package online_food_order;


public class FoodOrder extends Customer implements Order
{
    String foodItem;
    double price;
    public FoodOrder(String customerName,String foodItem,double price) {
        super(customerName);
        this.foodItem = foodItem;
        this.price=price;
        
    }

    

    @Override
    public void placeOrder() {
        System.out.println("Order sucessfully");
    }

    @Override
    public void showBill() {
        System.out.println("\n--- Bill Details ---");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Food Item     : " + foodItem);
        System.out.println("Price         : " + price);
   
    }
   

    
    
}
