/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author panos
 */

public class PersonListModel implements ListModel
{
    private PersonCollection collection;
  
    public PersonListModel(PersonCollection collection)
    {
        this.collection = collection;
    }

    public Object getElementAt(int index)
    {
        return(collection.getPersons()[index]);
    }

    public int getSize()
    {
        return(collection.getPersons().length);
    }

    public void addListDataListener(ListDataListener l) {}

    public void removeListDataListener(ListDataListener l) {}
}