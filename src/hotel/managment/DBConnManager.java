package hotel.managment;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class DBConnManager {
    public String sourceURL;
    public DBConnManager() {         
        try {             
            Class.forName("com.mysql.jdbc.Driver");             
            sourceURL = "jdbc:mysql://localhost:3306/hotel managment?";         
        } 
        catch (ClassNotFoundException classNotFoundException) 
        {             
            System.out.println(classNotFoundException + " -- Unable to load database driver classes");         
        }     
    } 
    
    public Connection connect() {         
        Connection dbConn = null;         
        try {             
            
            dbConn = DriverManager.getConnection(sourceURL, "root", "");
        } 
        catch (SQLException sQLException) 
        {             
            System.out.println(sQLException + " -- DB connection failure");         
        }         
        return dbConn;  
    }
    public void connectionClose(Connection dbConn) {         
        try {             
            dbConn.close();         
        } 
        catch (SQLException sQLException) 
        {             
            System.out.println(sQLException + " -- DB connection closing failure");         
        }   
    }
}


