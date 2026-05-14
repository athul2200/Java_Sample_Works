import shapeSize.*;
public class FindArea{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,3);
        Circle c=new Circle(4);
        System.out.println("Area of Rectangle: "+r.rectArea());
        System.out.println("Perimeter of Rectangle: "+r.rectPerimeter());
        System.out.printf("Area of Circle: %.2f\n",c.circArea());
        System.out.printf("Perimeter of Circle: %.2f",c.circPerimeter());
    }
}