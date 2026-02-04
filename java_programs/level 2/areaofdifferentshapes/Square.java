
package areaofdifferentshapes;

public class Square extends Shape
{
    Square (double side){
        super(side);
    }
    @Override
    double caculateArea(){
        double areaofsqure = value * value;
        return areaofsqure;
    }
}
