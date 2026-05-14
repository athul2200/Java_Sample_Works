import java.util.Scanner;
class Employee{
    String name,desig;
    int BP,PF,MI,DA,HRA;
    void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter Designation: ");
        desig=sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        BP=sc.nextInt();
        System.out.print("Enter Rate of HRA and DA: ");
        HRA=sc.nextInt();DA=sc.nextInt();
        System.out.print("Enter PF and MI: ");
        PF=sc.nextInt();MI=sc.nextInt();
    }
    float calculateSalary(){
        float sal=BP+BP*HRA/100+BP*DA/100-PF-MI;
        return sal;
    }
}
class SalesRep extends Employee{
    int salesAmount,bonus;
    float getSalary(){
        float sal=super.calculateSalary()+salesAmount*bonus/100;
        return sal;
    }
}
class EmpMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SalesRep rep=new SalesRep();
        rep.setData();
        System.out.print("Enter Sales Amount: ");
        rep.salesAmount=sc.nextInt();
        System.out.print("Enter Bonus Rate: ");
        rep.bonus=sc.nextInt();
        System.out.println("Name: "+rep.name);
        System.out.println("Designation: "+rep.desig);
        System.out.println("Salary: "+rep.getSalary());
    }
}