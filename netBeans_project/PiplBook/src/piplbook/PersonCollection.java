/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

/**
 *
 * @author panos
 */
public class PersonCollection
{
    private static Person[] defaultPersons = { 
    };

    private Person[] persons;
    private int numPersons;

    public PersonCollection(Person[] personsArray)
    {        
        this.persons = personsArray;

        this.numPersons = persons.length;
    }
  
    public PersonCollection()
    {
        this.persons = defaultPersons;
    }

    public Person[] getPersons()
    {
        return(persons);
    }

    public int getNumPersons()
    {
        return(numPersons);
    }
}