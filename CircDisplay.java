import java.util.*;
class CircDisplay{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]={2,3,4,5,6,7,8};
        int pos=0;

        System.out.println("The Given Array is:");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        try {
            System.out.print("\nEnter Starting Position: ");
            pos=sc.nextInt();
            pos--;
        } catch (InputMismatchException e) {
            System.out.println("\nWrong Input!!");
            System.exit(0);
        }
        System.out.println("\nArray Displayed in Circular Fashion");
        for(int i=0;i<num.length;i++){
            try {
                System.out.print(num[pos]+" ");
                pos--;
                if(pos<0)
                    pos=num.length-1;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nInvalid position");
                break;
            }
        }
    }
}
