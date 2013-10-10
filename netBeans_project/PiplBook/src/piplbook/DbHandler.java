/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author panos
 */
public class DbHandler
{
    Connection dbConnection = null;	/* holds the connection with the database */
    Statement dbStatement = null;      /* holds the statement with the database */
  
    public DbHandler()
    {
        connectDatabase();
    }
    
    // connect to database
    private void connectDatabase()
    {
        // set the sqlite db driver
        try
        {
            Class.forName("org.sqlite.JDBC");
        }
        catch(java.lang.ClassNotFoundException e)
        {
            System.err.println(e.getMessage());
        }
        
        try
        {
            // create a database connection
            dbConnection = DriverManager.getConnection("jdbc:sqlite:piplBook.db");
            dbStatement = dbConnection.createStatement();
            dbStatement.setQueryTimeout(30);  // set timeout to 30 sec.
        }
        catch(SQLException e)
        {
            // if the error message is "out of memory", 
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }
    }  
    
    // initializes the db - creates the persons table
    public void initializedDb()
    {
        try
        {
            dbStatement.executeUpdate("create table persons (id integer primary key autoincrement, firstName string, lastName string, phone string, address string, notes string, image string, dateInsert string, dateLastEdit string)");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    // checks if database is initialized
    public boolean isDbInitialized()
    {
        boolean initialized = false;
        
        try
        {
            ResultSet rs = dbStatement.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='persons'");
            
            int rowCounter=0;
            
            while( rs.next() )
            {
                rowCounter++;
            }
            
            rs.close();
            
            // if there is 1 row in the result set - the person table exists - db already is initialized
            if( rowCounter ==1 )
            {
                initialized = true;
            }       
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
            
        return initialized;
    }
    
    // fetch all persons entries
    public List<Person> loadEntries(String query)
    {
        List<Person> personsList = new ArrayList<Person>();
        
        try
        {
            ResultSet rs = dbStatement.executeQuery(query);
                        
            while( rs.next() )
            {
                int id = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String phone = rs.getString(4);
                String address = rs.getString(5);
                String notes = rs.getString(6);
                String image = rs.getString(7);
                String dateInsert = rs.getString(8);
                String dateEdit = rs.getString(9);
                                
                Person my_person = new Person(id, firstName, lastName, phone, address, notes, image, dateInsert, dateEdit);
                
                personsList.add(my_person);
            }
            
            rs.close();
        }
        catch(SQLException e)
        {
            System.err.print(e.getMessage());
        } 
        
        return personsList;
    }
    
    public boolean dbUpdatePerson(int id, String firstName, String lastName, String phone, String address, String notes, String image, String dateInsert, String dateEdit)
    {        
	String query = "update persons set firstName=\"" + firstName + "\"" + ",  lastName=" + "\"" + lastName + "\"" + ", phone=" + "\"" + phone + "\"" + ", address=" + "\"" + address + "\"" + ", notes=" + "\"" + notes + "\"" + ", dateInsert=" + "\"" + dateInsert + "\"" + ", dateLastEdit=" + "\"" + dateEdit + "\""  + ", image=" + "\"" + image + "\""  + " where id = " + "\"" + id + "\"" + " ;";
        
	try
        {
                dbStatement.executeUpdate(query);

	}
        catch(SQLException ex)
        {
		System.err.println("SQLException: " + ex.getMessage());
                
                return false;
        }

        return true;
    }
    
        // check if this entry already exists
    public boolean checkIfExists(String firstName, String lastName)
    {
        String id = null;
            
        // check if this entry already exists
        try
        {
            String query = "select id from persons where firstName= \"" + firstName + "\"" + " and lastName=" + "\"" + lastName + "\"" + ";";

            ResultSet rs = dbStatement.executeQuery(query);
		
            while (rs.next())
            {
		id = rs.getString(1);
            }

            rs.close();
        }
        catch(SQLException ex)
        {
            System.err.println("SQLException: " + ex.getMessage());
        }

        if(id != null )
        {
            JOptionPane.showMessageDialog(null, "Αυτή η επαφή υπάρχει ήδη", "Σφάλμα εισαγωγής", JOptionPane.WARNING_MESSAGE);
           
            return true;
        }
        
        return false;
    }
    
    // delete persno entry from db
    public boolean dbDeletePerson(int id)
    {
    	String query = "delete from persons where id = " + "\"" + id + "\"" + " ;";
               
	try
        {
            dbStatement.executeUpdate(query);

	}
        catch(SQLException ex)
        {
            System.err.println("SQLException: " + ex.getMessage());
                
            return false;
        }

        return true;
    }
    
    public boolean dbAddPerson(String firstName, String lastName, String phone, String address, String notes, String image, String dateInsert, String dateEdit)
    {        
        // insert person to database's persons table
        try
        {
            PreparedStatement prep = dbConnection.prepareStatement("insert into persons values (?, ?, ?, ?, ?, ?, ?, ?, ?);");

            prep.setNull(1, java.sql.Types.NULL);
            prep.setString(2, firstName);
            prep.setString(3, lastName);
            prep.setString(4, phone);
            prep.setString(5, address);
            prep.setString(6, notes);
            prep.setString(7, image);
            prep.setString(8, dateInsert);
            prep.setString(9, dateEdit);
            prep.addBatch();

            dbConnection.setAutoCommit(false);
            prep.executeBatch();
            dbConnection.setAutoCommit(true);

        }
        catch(SQLException ex)
        {
            System.err.println("SQLException: " + ex.getMessage());
                
            return false;
        }
                
        return true;
    }
    
}
