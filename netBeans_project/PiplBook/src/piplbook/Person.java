/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author panos
 */
public class Person
{
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final String address;
    private final String notes;
    private final String image;
    private ImageIcon imageIcon;
    private final String dateInsert;
    private final String dateEdit;
    
    public Person(int id, String firstName, String lastName, String phone, String address, String notes, String image, String dateInsert, String dateEdit)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.notes = notes;
        this.image = image;
        this.dateInsert = dateInsert;
        this.dateEdit = dateEdit;
    }
    
    // String representation used in printouts and in JLists

    public String toString()
    {
        return(getFirstName() + " " + getLastName() + " ");
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getNotes()
    {
        return this.notes;
    }
    
    public ImageIcon getImage()
    {
        Image in = Toolkit.getDefaultToolkit().createImage(image);
        Image scaledImage = in.getScaledInstance(60,-1,Image.SCALE_FAST);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                
        imageIcon = scaledImageIcon;
        
        return imageIcon;
    }
    
    public String getImagePath()
    {
        return this.image;
    }
    
    public String getDateInsert()
    {
        return this.dateInsert;
    }
    
    public String getDateEdit()
    {
        return this.dateEdit;
    }
}
