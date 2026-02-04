
package areaofdifferentshapes;


public abstract class Shape {
    double value;
    
    Shape(double value){
        this.value = value;
    }
    
    abstract double caculateArea();
}
