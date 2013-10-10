/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author panos
 */
public class Sorter
{
    public Sorter()
    {
        //
    }
    
    public List<Person> sortEntries(List<Person> personsList, String sortingType)
    {        
        if( sortingType.equals("alphabetic") )
        {
            Collections.sort(personsList, new alphabeticComparator());
        }
        else if( sortingType.equals("byDate") )
        {    
            Collections.sort(personsList, new byDateComparator());
        }
        
        return personsList;
    }
}
