/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author panos
 */
class PersonCellRenderer extends DefaultListCellRenderer
{
    public Component getListCellRendererComponent(JList list, Object value,int index, boolean isSelected, boolean cellHasFocus)
    {        
        JLabel label = (JLabel)super.getListCellRendererComponent(list, value, index,  isSelected, cellHasFocus);
        
        Person entry = (Person) value;
        setText(entry.getLastName() + "    " + entry.getFirstName());        
        setIcon(entry.getImage());
    
        if (isSelected)
        {
            setBackground(Color.LIGHT_GRAY);
            setForeground(Color.white);
        }
        else
        {
            setBackground(Color.white);
            setForeground(Color.black);
        }
        
        Font displayFont = new Font("Italic", Font.BOLD, 15);
        
        this.setFont(displayFont);
        
        return label;
    }
}
