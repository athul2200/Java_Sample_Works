import java.util.Scanner;

class Shape{
    float rectArea(float l){
        return l*l;
    }
    float rectArea(float l,float b){
        return l*b;
    }
    float rectArea(float l,float b,float h){
        return 2*(l*b+l*h+b*h);
    }
    float rectArea(float l,float b,float h,float x){
        return 2*h*(l+b);
    }
}
class Shapes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape s=new Shape();
        int choice;
        float l,b,h;
        float area=0;
        do { 
            System.out.println("1.Area of Square\n2.Area of Rectangle\n3.Area of Cuboid\n4.Lateral Surface Area\n5.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:System.out.print("Enter Length: ");
                    l=sc.nextInt();
                    area=s.rectArea(l);
                    break;
                case 2:System.out.print("Enter Length and Breadth: ");
                    l=sc.nextInt();b=sc.nextInt();
                    area=s.rectArea(l,b);
                    break;
                case 3:System.out.print("Enter Length, Breadth and Heigth: ");
                    l=sc.nextInt();b=sc.nextInt();h=sc.nextInt();
                    area=s.rectArea(l,b,h);
                    break;
                case 4:System.out.print("Enter Length, Breadth and Heigth: ");
                    l=sc.nextInt();b=sc.nextInt();h=sc.nextInt();
                    area=s.rectArea(l,b,h,0);
                    break;
                case 5:System.out.print("Exiting the Program: ");
                    System.exit(0);
            }

            System.out.println("Area is: "+area);
        } while (choice!=5);
    }
}