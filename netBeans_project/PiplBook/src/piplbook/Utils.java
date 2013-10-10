/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import javax.imageio.ImageIO;

/**
 *
 * @author panos
 */
public class Utils
{
    public Utils()
    {
        //
    }
    
    public void copyFile(File sourceFile, File destFile) throws IOException
    {
        if(!destFile.exists())
        {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;

        try
        {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        }
        finally
        {
            if(source != null)
            {
                source.close();
            }
        
            if(destination != null)
            {
                destination.close();
            }
        }
    }
    
    public String getMd5(String phrase)
    {
        String md5="";
        
        try
        {
            String name = phrase;
            byte[] bytesOfMessage = name.getBytes("UTF-8");

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(bytesOfMessage);
            md5 = thedigest.toString();
         }
         catch (Exception e)
         {
            System.err.println(e.toString());
         }
        
        return md5;
    }
    
    public boolean checkMinimal(String entry)
    {
        boolean ok = false;
        
        if( entry.length() > 0 )
        {
            ok = true;
        }
        
        return ok;
    }
    
    public boolean checkEntry(String entry)
    {
        boolean ok = false;
        
        if( (entry.length() < 256) )
        {
            ok = true;
        }
        
        return ok;
    }
    
    public boolean checkNotes(String notes)
    {
        boolean ok = false;
        
        if( notes.length() < 1024 )
        {
            ok = true;
        }
        
        return ok;
    }
        
    public boolean changedMinimals(String firstName, String lastName, Person person)
    {
        if( (person.getFirstName().equals(firstName)) && (person.getLastName().equals(lastName)) )
        {
            return false;
        }
        
        return true;
    }
    
    public void createDirectory(String dirName)
    {
          File theDir = new File(dirName);

            // if the directory does not exist, create it
          if( theDir.exists() )
          {
              theDir.delete(); 
          }
         
          theDir.mkdir(); 
          
          BufferedImage scaledImage = null;
            
          try
          {
                scaledImage = javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/small_person.png"));
          }
          catch(Exception e)
          {
                System.err.println(e.toString());
          }
            
          String filePath = new java.io.File("").getAbsolutePath() + File.separator + "personsPhotos" + File.separator + "small_person.png";
          File photoDst = new File(filePath);    
            
          try
          {
                ImageIO.write(scaledImage, "png", photoDst);
          }
          catch(Exception e)
          {
                System.err.println(e.toString());
          }
    }
    
}
