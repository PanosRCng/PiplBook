/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author panos
 */
public class byDateComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2)
    {
        String one = o1.getDateInsert();
        String two = o2.getDateInsert();
            
        Date date1=null;
        Date date2=null;
            
        try
        {
            date1 = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss", Locale.ENGLISH).parse(one);
            date2 = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss", Locale.ENGLISH).parse(two);
        }
        catch (Exception e)
        {
            System.err.println(e.toString());
        }
                 
        if( date1.compareTo(date2) > 0 )
        {
            return -1;
        }
        else if( date1.compareTo(date2) < 0 )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
