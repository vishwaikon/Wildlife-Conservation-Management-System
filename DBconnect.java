
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DBconnect {
    public static Connection getConnection(){
    Connection conn=null;
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
     
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hasthiwcms","root","");
        
    
    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, e);
}

return conn;
}

    static java.sql.Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //static java.sql.Connection connect() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
