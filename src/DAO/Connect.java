
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.SourceVersion;
import javax.swing.JOptionPane;
import view.NhanVien;




public class Connect {


public  Statement st = null;
    ResultSet rs = null;
    public Connection conn = null;
    String URL = "jdbc:sqlserver://localhost:1433;database=qlyQuanPho";
    String user = "sa";
    String pw = "123";
     public Connect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL,user,pw);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"That bai");
        }
        
}
public static void main(String[] args ){
            new Connect();
        }
}



