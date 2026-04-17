package decorator;




public class Olive extends PizzaDecorator{

    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String plainPizza() {
        return pizza.plainPizza()+",Olive";
    }

    @Override
    public int getAmount() {
        return pizza.getAmount()+20;
    }

}