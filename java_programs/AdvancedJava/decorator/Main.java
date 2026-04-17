
package decorator;


public class Main {

    
    public static void main(String[] args) 
    {
         Pizza pizza1 = new PlainPizza();

        Pizza pizza2 = new Cheese(new PlainPizza());

        Pizza pizza3 = new Musroom(
                            new Cheese(
                                new PlainPizza()));

        Pizza pizza4 = new Olive(
                            new Musroom(
                                new Cheese(
                                    new PlainPizza())));

        printPizza(pizza1);
        printPizza(pizza2);
        printPizza(pizza3);
        printPizza(pizza4);
    }

    private static void printPizza(Pizza pizza) {
        System.out.println("Description : " + pizza.plainPizza());
        System.out.println("Cost        : " + pizza.getAmount());
        System.out.println();
    }
    
    
}
