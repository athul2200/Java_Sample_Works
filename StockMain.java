import java.util.Scanner;
class Stock{
    int prodId,qty,reoQty;
    float price;
    String product;
    float findRate(){
        return qty*price;
    }
}
class StockMain{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Stock items[]=new Stock[10];
        int n;
        float stockValue=0;
        System.out.print("\nHow many Products: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            items[i]=new Stock();
            System.out.print("Enter Details of Product: "+(i+1));
            System.out.print("\nEnter Product ID: ");
            items[i].prodId=sc.nextInt();
            System.out.print("Enter Product Name: ");
            sc.nextLine();items[i].product=sc.nextLine();
            System.out.print("Enter Enter Quantity: ");
            items[i].qty=sc.nextInt();
            System.out.print("Enter Reorder Quantity: ");
            items[i].reoQty=sc.nextInt();
            System.out.print("Enter Product Price: ");
            items[i].price=sc.nextFloat();

        }
        System.out.println("\n\nList of Reorder Items");
        for(int i=0;i<n;i++){
            
            if(items[i].qty<items[i].reoQty){
                System.out.printf("%d %s %d %d\n",items[i].prodId,items[i].product,items[i].qty,items[i].reoQty);
                stockValue+=(items[i].reoQty*items[i].price);
            }
        }
        System.out.printf("\nTotal Stock Value is: %.2f",stockValue);

    }
}