package decorator;




public class Musroom extends PizzaDecorator {

    public Musroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String plainPizza() {
        return pizza.plainPizza()+", Musroom";
    }

    @Override
    public int getAmount() {
        return pizza.getAmount()+25;
    }

}