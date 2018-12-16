/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realstate_development_manaagement_system;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Jubair Hossain
 */
public class dbconnect {
    Connection conn=null;
	public static Connection dbConnector()
	{
		 try {
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
			//Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/real","root","");
			//JOptionPane.showMessageDialog(null,"Connection Successful.");
			return conn;
			 
		} catch (Exception e) 
		 {
		JOptionPane.showMessageDialog(null, e);
		return null;
		}
	}

}
