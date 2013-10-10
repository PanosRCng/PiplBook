/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import java.util.Comparator;

/**
 *
 * @author panos
 */

public class alphabeticComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2)
    {
        String one = o1.getLastName() + o1.getFirstName();
        String two = o2.getLastName() + o2.getFirstName();
        
        return one.compareTo(two);
    }
}
