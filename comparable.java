
public class Exercise {

    //comparing two objects to find the max using comparable
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(15);
        
        ComparableCircle circle3 = (ComparableCircle)Max.max(circle1, circle2);
        System.out.println("The max circle's radius is " + circle3.getRadius());
        System.out.println(circle3);
    }
    
}

class ComparableCircle extends Circle implements Comparable <ComparableCircle>
{
    public ComparableCircle(int radius){
        super(radius);
    }
    @Override
    public int compareTo (ComparableCircle o) {
        if(getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        else 
            return 0;
    }
}
class Circle
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
class Max{
    public static ComparableCircle max(ComparableCircle o1, ComparableCircle o2){
        if(o1.compareTo(o2) > 0)
            return o1;
        else 
            return o2;
    }
}
