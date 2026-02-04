
package areaofdifferentshapes;


public class Circle extends Shape 
{

    public Circle(double value) {
        super(value);
    }
   
    

    @Override
    double caculateArea() {
        double pi=3.14;
        double areaofcircle = pi*value*value;
        return areaofcircle;
        
    }
    
}
