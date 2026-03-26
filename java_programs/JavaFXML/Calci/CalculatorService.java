
package calculator;


public class CalculatorService 
{

    CalculatorRepository repo = new CalculatorRepository();

    public double performCalculation(double num1, double num2, String operator) {

        return repo.calculate(num1, num2, operator);

    }
}
