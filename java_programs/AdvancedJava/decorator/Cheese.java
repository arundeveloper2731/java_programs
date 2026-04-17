package decorator;




public class Cheese extends PizzaDecorator{

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    
    @Override
    public String plainPizza() {
        return pizza.plainPizza() + " , Cheese";
    }

    @Override
    public int getAmount() {
        return pizza.getAmount()+30;
    }

}