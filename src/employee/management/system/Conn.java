package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3305/employeemanagementsystem", "root", "system");
            s=c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
