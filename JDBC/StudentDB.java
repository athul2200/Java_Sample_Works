import java.sql.*;
class StudentDB{
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","password123");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select*from student where mark between 50 and 80");

            while(rs.next()){
                System.out.printf("%d %s %d\n",rs.getInt("regno"),rs.getString("name"),rs.getInt("mark"));
            }
            con.close();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}