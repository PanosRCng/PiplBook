/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piplbook;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author panos
 */
public class AdvancedSearchUI extends javax.swing.JFrame
{
    private mainUI main_window;
    private Person selectedPerson = null;
 
    JScrollPane scrollPane;
    List<Person> personsList = new ArrayList<Person>();
    JList personJList;
    
    private String sortingType = "alphabetic";
    
    /**
     * Creates new form AdvancedSearchUI
     */
    public AdvancedSearchUI(mainUI main)
    {
        this.main_window = main;
        
        initComponents();
        
        // set background color to white
        getContentPane().setBackground(Color.WHITE); 
        
        // set item listener to jComboBox for choosing sorting types
        jComboBox2.addItemListener(itemListener);
                
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Εξειδικευμένη αναζήτηση");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/header.png"))); // NOI18N

        jPanel1.setLayout(new java.awt.BorderLayout());

        jCheckBox1.setText("Όνομα:");

        jCheckBox2.setText("Επώνυμο:");

        jCheckBox3.setText("Τηλέφωνο:");

        jCheckBox4.setText("Διεύθυνση:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/show_profil.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });

        jLabel2.setText("Επιλογές αναζήτησης");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "αλφαβητικά", "κατά ημερομηνία εισαγωγής" }));

        jLabel13.setText("ταξινόμηση:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox2)
                                            .addComponent(jCheckBox1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // get the component of this evtent
        JLabel myLabel = (JLabel) evt.getComponent();

        //change the jLabel's icon
        try
        {
            myLabel.setIcon( new ImageIcon( javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/show_profil_selected.png")) ) );
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        // get the component of this evtent
        JLabel myLabel = (JLabel) evt.getComponent();

        //change the jLabel's icon
        try
        {
            myLabel.setIcon( new ImageIcon( javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/show_profil.png")) ) );
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }

        showProfileUI();
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
  //      search();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // get the component of this evtent
        JLabel myLabel = (JLabel) evt.getComponent();

        //change the jLabel's icon
        try
        {
            myLabel.setIcon( new ImageIcon( javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/show_profil_mouseOn.png")) ) );
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // get the component of this evtent
        JLabel myLabel = (JLabel) evt.getComponent();

        //change the jLabel's icon
        try
        {
            myLabel.setIcon( new ImageIcon( javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/show_profil.png")) ) );
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // get the component of this evtent
        JLabel myLabel = (JLabel) evt.getComponent();

        //change the jLabel's icon
        try
        {
            myLabel.setIcon( new ImageIcon( javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/search_selected.png")) ) );
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        // get the component of this evtent
        JLabel myLabel = (JLabel) evt.getComponent();

        //change the jLabel's icon
        try
        {
            myLabel.setIcon( new ImageIcon( javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/search.png")) ) );
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
        
        search();
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // get the component of this evtent
        JLabel myLabel = (JLabel) evt.getComponent();

        //change the jLabel's icon
        try
        {
            myLabel.setIcon( new ImageIcon( javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/search_mouseOn.png")) ) );
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // get the component of this evtent
        JLabel myLabel = (JLabel) evt.getComponent();

        //change the jLabel's icon
        try
        {
            myLabel.setIcon( new ImageIcon( javax.imageio.ImageIO.read(getClass().getResourceAsStream("/images/search.png")) ) );
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jLabel3MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void showProfileUI()
    {
        if(selectedPerson != null)
        {
            ProfileUI profileUI = new ProfileUI(main_window, selectedPerson);
            profileUI.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Επιλέξτε ένα πελάτη από την λίστα πελατών", "Δεν έχει επιλεγεί πελάτης", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // fill display scroll with entries
    private void fillTable()
    {     
        String query = "select * from persons";
        personsList = main_window.dbHandler.loadEntries(query);
        
        personsList = main_window.sorter.sortEntries(personsList, sortingType);
            
        Person[] personArray = new Person[ personsList.size() ];
        personsList.toArray( personArray );
            
        PersonCollection collection = new PersonCollection(personArray);
        PersonListModel listModel = new PersonListModel(collection);
        personJList = new JList(listModel);   
        
        personJList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse)
            {
                if (!lse.getValueIsAdjusting())
                {                    
                    int i = personJList.getSelectedIndex();

                    selectedPerson = (Person) personJList.getModel().getElementAt(i);
                }
            }
        });
        
        personJList.setCellRenderer(new PersonCellRenderer());
            
        scrollPane = new JScrollPane(personJList);           
        jPanel1.add(scrollPane);
    }
    
        // jComboBox item listener
    ItemListener itemListener = new ItemListener()
    {
        @Override
        public void itemStateChanged(ItemEvent itemEvent)
        {
            int state = itemEvent.getStateChange();
            
            if( (state == ItemEvent.SELECTED) )
            {
                if( itemEvent.getItem().equals("κατά ημερομηνία εισαγωγής") )
                {   
                    sortingType = "byDate";
                    personsList = main_window.sorter.sortEntries(personsList, sortingType);
                }
                else if( itemEvent.getItem().equals("αλφαβητικά") )
                {           
                    sortingType = "alphabetic";
                    personsList = main_window.sorter.sortEntries(personsList, sortingType);
                }
                
                if(personsList.size() > 0)
                {
                    Person[] personArray = new Person[ personsList.size() ];
                    personsList.toArray( personArray );
        
                    PersonCollection collection = new PersonCollection(personArray);
                    PersonListModel listModel = new PersonListModel(collection);
        
                    personJList = new JList(listModel);
        
                    personJList.addListSelectionListener(new ListSelectionListener() {

                        @Override
                        public void valueChanged(ListSelectionEvent lse)
                        {
                            if (!lse.getValueIsAdjusting())
                            {                    
                                int i = personJList.getSelectedIndex();

                                selectedPerson = (Person) personJList.getModel().getElementAt(i);
                            }
                        }
                    });
        
                    personJList.setCellRenderer(new PersonCellRenderer());
        
                    scrollPane.setViewportView(personJList);
                }
            }
        }
    };
      
    public String makeQuery()
    {        
        String query = "";
        
        String firstName = null;
	String lastName = null;
	String phone = null;
	String address = null;
        
	firstName = jTextField1.getText();
	lastName = jTextField2.getText();
        phone = jTextField3.getText();
        address = jTextField4.getText();
        
        String argv1 = "select * from persons";
        String argv2 = "select * from persons";
        String argv3 = "select * from persons";
        String argv4 = "select * from persons";
        String argv5 = "select * from persons";
                       
        if(jCheckBox1.isSelected())
        {
            argv1 = "select * from persons where firstName = " + "\"" + firstName + "\"";
        }
        
        if(jCheckBox2.isSelected())
        {
            argv2 = "select * from persons where lastName = " + "\"" + lastName + "\"";
        }

        if(jCheckBox3.isSelected())
        {
            argv3 = "select * from persons where phone = " + "\"" + phone + "\"";
        }
        
        if(jCheckBox4.isSelected())
        {
            argv4 = "select * from persons where address = " + "\"" + address + "\"";
        }
        
        query = argv1 + " intersect " + argv2 + " intersect " + argv3 + " intersect " + argv4 + ";";
        
        return query;
    }
    
    private void search()
    {
        personsList.clear();
        
        selectedPerson = null;
        
        String query = makeQuery();
        
        if(query != null)
        {
            personsList = main_window.dbHandler.loadEntries(query);
            
            refreshTable();
        }
    }
    
    // refresh the displayed entries
    private void refreshTable()
    {            
        personsList = main_window.sorter.sortEntries(personsList, sortingType);
        
        Person[] personArray = new Person[ personsList.size() ];
        personsList.toArray( personArray );
        
        PersonCollection collection = new PersonCollection(personArray);
        PersonListModel listModel = new PersonListModel(collection);
        
        personJList = new JList(listModel);
        
        personJList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse)
            {
                if (!lse.getValueIsAdjusting())
                {                    
                    int i = personJList.getSelectedIndex();

                    selectedPerson = (Person) personJList.getModel().getElementAt(i);
                }
            }
        });
        
        personJList.setCellRenderer(new PersonCellRenderer());
        
        scrollPane.setViewportView(personJList);
        
        if(personsList.size() == 0)
        {
            this.selectedPerson = null;
        }
    }

}
