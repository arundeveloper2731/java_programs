package decorator;




public class PlainPizza implements Pizza
{

    @Override
    public String plainPizza() 
    {
        return "Plain Pizza";
    }

    @Override
    public int getAmount() {
        return 120;
    }
    

}