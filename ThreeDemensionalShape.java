/**
 * @author Donny (1972027)
 */

public abstract class ThreeDimensionalShape extends Shape {
    public abstract double getVolume();
    public abstract double getSurfaceArea();
    public abstract void showDetail();
    public void showDetail(){
        System.out.println(toString());
    }
}
