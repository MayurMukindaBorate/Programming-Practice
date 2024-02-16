import java.sql.*;

class Database
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql:\\localhost:3306\09 November 2023";
        String Username = "root";
        String Password = "root";
        String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2

        Statement sobj = cobj.createStatement();    //  3

        ResultSet robj = sobj.executeQuery(Query);  //  4 

        while(robj.next())      // 5
        {
            System.out.println("RID : "+robj.getInt("RollNo"));
            System.out.println("Name : "+robj.getString("name"));
            System.out.println("Address : "+robj.getString("Address"));
            System.out.println("Marks : "+robj.getInt("marks"));
        }  
    }
}

// execute()        create table
// executeQueary()  select
// executeUpdate()  delete / update / alter / insert