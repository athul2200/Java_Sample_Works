import java.sql.*;
import java.util.Scanner;
class EmployeeDB{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Minimum Salary: ");
        int minSal=sc.nextInt();
        System.out.print("Enter Maximum Salary: ");
        int maxSal=sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","password123");
            PreparedStatement ps=con.prepareStatement("select*from employee where salary between ? and ?");
            ps.setInt(1,minSal);
            ps.setInt(2,maxSal);

            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                System.out.printf("%d %s %s %d\n",rs.getInt("emp_no"),rs.getString("name"),rs.getString("dept"),rs.getInt("salary"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}