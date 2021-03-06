/* 
 *To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * add online sync button.
 */
package schoolmgmt;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.*;
import javax.swing.table.TableColumn;
/**
 *
 * @author kapil
 */

public class MainWindow11 extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow11() {
        initComponents();
        setVisible(true);
        setLocation(0, 0);
        setExtendedState(MAXIMIZED_BOTH);
        newa();
        showButton();
        jTable1.requestFocus();
    }

    /**
     * add two categories.
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jComboBoxFees = new javax.swing.JComboBox<>();
        jComboBoxClass = new javax.swing.JComboBox<>();
        schoolNameLabel = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        percentageText = new javax.swing.JTextField();
        aboutButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        feesPayButton = new javax.swing.JButton();
        addStudentButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        removeStudentButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button_show = new javax.swing.JButton();
        buttonEditStudent = new javax.swing.JButton();
        search_text = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        feesRadio = new javax.swing.JRadioButton();
        contactRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload1.png"))); // NOI18N
        jLabel5.setToolTipText("RollNumber Allocation");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 100, 50, 50));

        jComboBoxFees.setBackground(new java.awt.Color(51, 51, 0));
        jComboBoxFees.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jComboBoxFees.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxFees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFees.setAutoscrolls(true);
        jComboBoxFees.setOpaque(false);
        jComboBoxFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFeesActionPerformed(evt);
            }
        });
        jComboBoxFees.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxFeesPropertyChange(evt);
            }
        });
        jComboBoxFees.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jComboBoxFeesVetoableChange(evt);
            }
        });
        getContentPane().add(jComboBoxFees, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, 40));

        jComboBoxClass.setBackground(new java.awt.Color(51, 51, 0));
        jComboBoxClass.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jComboBoxClass.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class", "Nursary", "KG-1", "KG-2", "Class 1", "Class 2", "Class 3", "Class 4", "Class 5", "Class 6", "Class 7", "Class 8", "Class 9", "Class 10", "Class 11(M)", "Class 11(C)", "Class 11(B)", "Class 11(Ar)", "Class 11(Ag)", "Class 12(M)", "Class 12(C)", "Class 12(B)", "Class 12(Ar)", "Class 12(Ag)" }));
        jComboBoxClass.setAutoscrolls(true);
        jComboBoxClass.setOpaque(false);
        jComboBoxClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClassActionPerformed(evt);
            }
        });
        jComboBoxClass.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxClassPropertyChange(evt);
            }
        });
        jComboBoxClass.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jComboBoxClassVetoableChange(evt);
            }
        });
        getContentPane().add(jComboBoxClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 40));

        schoolNameLabel.setBackground(new java.awt.Color(0, 51, 153));
        schoolNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        schoolNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        schoolNameLabel.setText("School Name");
        schoolNameLabel.setOpaque(true);
        getContentPane().add(schoolNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 80));

        printButton.setBackground(new java.awt.Color(51, 0, 51));
        printButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.gif"))); // NOI18N
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 630, 70, 50));

        percentageText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        percentageText.setOpaque(false);
        getContentPane().add(percentageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, 40));

        aboutButton.setBackground(new java.awt.Color(0, 102, 204));
        aboutButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        aboutButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutButton.setText("Scholar Details");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aboutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, 170, 50));

        profileButton.setBackground(new java.awt.Color(255, 102, 0));
        profileButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Student Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 170, 50));

        feesPayButton.setBackground(new java.awt.Color(0, 204, 0));
        feesPayButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        feesPayButton.setForeground(new java.awt.Color(255, 255, 255));
        feesPayButton.setText("Fees Pay");
        feesPayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesPayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(feesPayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 170, 50));

        addStudentButton.setBackground(new java.awt.Color(0, 51, 153));
        addStudentButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        addStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        addStudentButton.setText("Add Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 170, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Class");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Fee Percentage");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Fees");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        removeStudentButton.setBackground(new java.awt.Color(153, 0, 51));
        removeStudentButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        removeStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        removeStudentButton.setText("Remove Student");
        removeStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 170, 50));

        reportsButton.setBackground(new java.awt.Color(153, 0, 153));
        reportsButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        reportsButton.setForeground(new java.awt.Color(255, 255, 255));
        reportsButton.setText("Reports");
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(reportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, 170, 50));

        staffButton.setBackground(new java.awt.Color(0, 102, 102));
        staffButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        staffButton.setForeground(new java.awt.Color(255, 255, 255));
        staffButton.setText("Staff");
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });
        getContentPane().add(staffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 170, 50));

        dateLabel.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        dateLabel.setText("jLabel2");
        getContentPane().add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 150, 160, 40));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 1340, 410));

        button_show.setBackground(new java.awt.Color(51, 153, 0));
        button_show.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        button_show.setForeground(new java.awt.Color(255, 255, 255));
        button_show.setText("Show");
        button_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_showMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_showMouseExited(evt);
            }
        });
        button_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_showActionPerformed(evt);
            }
        });
        getContentPane().add(button_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 120, 40));

        buttonEditStudent.setBackground(new java.awt.Color(0, 204, 0));
        buttonEditStudent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonEditStudent.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditStudent.setText("Edit Student");
        buttonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditStudentActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEditStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, -1, 26));

        search_text.setText("Enter text");
        search_text.setOpaque(false);
        search_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_textFocusGained(evt);
            }
        });
        search_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_textActionPerformed(evt);
            }
        });
        getContentPane().add(search_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 110, 150, 26));

        button_search.setBackground(new java.awt.Color(0, 204, 0));
        button_search.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        button_search.setForeground(new java.awt.Color(255, 255, 255));
        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });
        getContentPane().add(button_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 110, -1, 26));

        feesRadio.setText("Fees");
        feesRadio.setOpaque(false);
        getContentPane().add(feesRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 600, -1, -1));

        contactRadio.setText("Contact");
        contactRadio.setOpaque(false);
        getContentPane().add(contactRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 600, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1390, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initEvent(){
    button_show.addMouseMotionListener(new MouseMotionAdapter() {
});
    }
    
    private void button_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_showActionPerformed
        showButton();
    }//GEN-LAST:event_button_showActionPerformed

    private void search_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_textActionPerformed
       searchButton();
// TODO add your handling code here:
    }//GEN-LAST:event_search_textActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
      searchButton();
    }//GEN-LAST:event_button_searchActionPerformed

    private void jComboBoxClassVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jComboBoxClassVetoableChange
    }//GEN-LAST:event_jComboBoxClassVetoableChange

    private void jComboBoxClassPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxClassPropertyChange
    }//GEN-LAST:event_jComboBoxClassPropertyChange

    private void jComboBoxClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClassActionPerformed
    }//GEN-LAST:event_jComboBoxClassActionPerformed

    private void search_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_textFocusGained
        search_text.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_search_textFocusGained

    private void feesPayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesPayButtonActionPerformed
        feesPay();
        
        showButton();
    }//GEN-LAST:event_feesPayButtonActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        new AddStudent();
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void removeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentButtonActionPerformed
     int id = Integer.valueOf(JOptionPane.showInputDialog(this, "Enter Student ID Number :", "Remove Student", 1));
     new Sql(this).removeStudent(id);
     
        // TODO add your handling code here:
    }//GEN-LAST:event_removeStudentButtonActionPerformed

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
    this.hide();
    new Reports();
    }//GEN-LAST:event_reportsButtonActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
    new Staff();
        // TODO add your handling code here:
    }//GEN-LAST:event_staffButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
       new Profiler();
        // TODO add your handling code here:
    }//GEN-LAST:event_profileButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
//        new  EditStudent();
        new ScholarDetails();

// TODO add your handling code here:
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try{
        jTable1.print(JTable.PrintMode.FIT_WIDTH,new MessageFormat("Students List"),new MessageFormat(SchoolMgmt.schoolName));
        }
        catch(Exception e){
        e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_printButtonActionPerformed

    private void jComboBoxFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFeesActionPerformed

    private void jComboBoxFeesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxFeesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFeesPropertyChange

    private void jComboBoxFeesVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jComboBoxFeesVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFeesVetoableChange

    private void button_showMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_showMouseEntered
        button_show.setBackground(Color.green);
        // TODO add your handling code here:
    }//GEN-LAST:event_button_showMouseEntered

    private void button_showMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_showMouseExited
        button_show.setBackground(new Color(51,153,0));
        // TODO add your handling code here:
    }//GEN-LAST:event_button_showMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Sql().rollNumberAllocation();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void buttonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditStudentActionPerformed
        new EditStudent();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditStudentActionPerformed
public void showButton(){
    int count=0;
    double total=0;
    if(contactRadio.isSelected() == false){
    jTable1.getColumnModel().removeColumn(jTable1.getColumn("Contact number"));
    }
    
        LinkedList<Student> student;
        int key = jComboBoxClass.getSelectedIndex();
        int fees = jComboBoxFees.getSelectedIndex();
        int sClass=0;
        String cl = "";
        switch(key){
            case 1:
                cl ="N";
            break;
            case 2:
                cl ="K1";
            break;
            case 3:
                cl ="K2";
            break;
            default:
                 sClass =(jComboBoxClass.getSelectedIndex()-3);
                 cl = "k";
                break;
            case 14:
                sClass = 11;
                cl = "M";
            break;
            case 15:
                sClass = 11;
                cl = "C";
            break;
            case 16:
                sClass = 11;
                cl = "B";
            break;
            case 17:
                sClass = 11;
                cl = "Ar";
            break;
            case 18:
                sClass=11;
                cl ="Ag";
                break;
            case 19:
                sClass = 12;
                cl = "M";
            break;
            case 20:
                sClass = 12;
                cl = "C";
            break;
            case 21:
                sClass = 12;
                cl = "B";
            break;
            case 22:
                sClass = 12;
                cl = "Ar";
            break;
            case 23:
                sClass=12;
                cl="Ag";
        }
        Sql sql = new Sql(this);
        if(key == 0)
        student =  sql.getStudent();
        else
        student =  sql.getStudentsByClass(sClass,cl);
        
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        jTable1.setFont(new Font("verdana",Font.BOLD,12));
        jTable1.setSelectionBackground(Color.BLUE);
        jTable1.setSelectionForeground(Color.white);
        df.getDataVector().removeAllElements();
        
        for(int i=0;i<student.size();i++){
            Student st = student.get(i);
            String scl = String.valueOf(st.getStudentClass());
            if(st.getStudentClass() == 0){
                scl = st.getClassCat();
            }
           if(Double.valueOf(percentageText.getText()) == 100){
            if(fees == 0){
                if(st.getStudentClass() == 11 || st.getStudentClass() == 12)
                { 
                    String row[] = {String.valueOf(st.getId()),String.valueOf(st.getRollNo()),scl+st.getClassCat(),st.getFname(),st.getFatherName(),st.getStudentContact(),st.getCity(),String.valueOf(st.getFees())};
                    df.addRow(row);
                }
                else{
                    String row[] = {String.valueOf(st.getId()),String.valueOf(st.getRollNo()),scl,st.getFname(),st.getFatherName(),st.getStudentContact(),st.getCity(),String.valueOf(st.getFees())};
                    df.addRow(row);
                }
                
                
                count++;
                total += st.getFees();
           
            }
            else if(fees == 1){
            if(st.getFees()<=0){
            String row[] = {String.valueOf(st.getId()),String.valueOf(st.getRollNo()),scl,st.getFname(),st.getFatherName(),st.getStudentContact(),st.getCity(),String.valueOf(st.getFees())};
            df.addRow(row);
            count++;
            total += st.getFees();
           }
         }
            else  {
            if(st.getFees() > 0){  
            String row[] = {String.valueOf(st.getId()),String.valueOf(st.getRollNo()),scl,st.getFname(),st.getFatherName(),st.getStudentContact(),st.getCity(),String.valueOf(st.getFees())};
            df.addRow(row);
            count++;
            total += st.getFees();
          }
       }   
        }else{
               try{
               double per = Double.valueOf(percentageText.getText());
               double totalFees = sql.getFess(st.getStudentClass(),st.getClassCat());
               double min = totalFees*per/100;
               if(min <= st.getFees()){
                  String row[] = {String.valueOf(st.getId()),String.valueOf(st.getRollNo()),scl,st.getFname(),st.getFatherName(),st.getStudentContact(),st.getCity(),String.valueOf(st.getFees())};
               df.addRow(row);
               count++;
                total += st.getFees();
               }
            }catch(Exception e){e.printStackTrace();}
         } 
      }
        
     String row[] = {"","","","","","Total Student : "+String.valueOf(count),"Total Fees",String.valueOf(total)};
     df.addRow(row);
        
    
}
public void searchButton(){
  Student st;
        Sql sql = new Sql(this);
        LinkedList<Student> student =sql.searchStudent(search_text.getText());
        if(student.size() > 0){
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        df.getDataVector().removeAllElements();
        for(int i=0;i<student.size();i++){
        st = student.get(i);
        String cl="";
        int c = st.getStudentClass();
        String ccat = st.getClassCat();
            if(c == 0 || c == 11 || c == 12){
                switch(ccat){
                    case "N" :
                        cl = ccat;
                        break;
                    case "K1":
                        cl = ccat;
                        break;
                    case "K2":
                        cl = ccat;
                        break;
                        
                }
            }else{
                cl = ""+st.getStudentClass();
            }
            String row[] = {String.valueOf(st.getId()),String.valueOf(st.getRollNo()),cl,st.getFname(),st.getFatherName(),st.getStudentContact(),st.getCity(),String.valueOf(st.getFees())};
            df.addRow(row);
        }
      }
        else{
              JOptionPane.showMessageDialog(this, "not Found");              
        }
}
public void addStudent(){
int w=700,h=430;   
            JFrame frame = new AddStudent();
            frame.setTitle("Add Stduent");
            frame.setPreferredSize(new Dimension(w,h));
            frame.setMinimumSize(new Dimension(w,h));
            frame.setMaximumSize(new Dimension(w,h));
            frame.setLocation(350,190);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           
}
public void feesPay(){
            int w=502,h=293;   
            JFrame frame = new FeesPay();
            frame.setTitle("Fees Pay");
            frame.setPreferredSize(new Dimension(w,h));
            frame.setMinimumSize(new Dimension(w,h));
            frame.setMaximumSize(new Dimension(w,h));
            frame.setLocation(350,190);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);    
}
public void newa(){
     jTable1.removeAll();
     DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
     df.getDataVector().removeAllElements();
     jTable1.setRowHeight(25);
     df.addColumn("asd");
     df.addColumn("Contact number");
     df.addColumn("City/Town");
     df.addColumn("Fees");
     
     dateLabel.setText(SchoolMgmt.date);
     schoolNameLabel.setText("  "+SchoolMgmt.schoolName);
     
     this.setTitle("  "+"School Management");
     
     jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
     jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
     jTable1.getColumnModel().getColumn(0).setMinWidth(60);
     jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
     jTable1.getColumnModel().getColumn(0).setResizable(false);
     
     
     jTable1.getColumnModel().getColumn(01).setHeaderValue("Roll No.");
     jTable1.getColumnModel().getColumn(01).setPreferredWidth(60);
     jTable1.getColumnModel().getColumn(01).setMinWidth(60);
     jTable1.getColumnModel().getColumn(01).setMaxWidth(60);
     jTable1.getColumnModel().getColumn(01).setResizable(false);
     
     jTable1.getColumnModel().getColumn(02).setHeaderValue("Class");
     jTable1.getColumnModel().getColumn(02).setPreferredWidth(60);
     jTable1.getColumnModel().getColumn(02).setMinWidth(60);
     jTable1.getColumnModel().getColumn(02).setMaxWidth(60);
     jTable1.getColumnModel().getColumn(02).setResizable(false);
     
     jTable1.getColumnModel().getColumn(03).setHeaderValue("Name");
     jTable1.getColumnModel().getColumn(03).setPreferredWidth(300);
     jTable1.getColumnModel().getColumn(03).setMinWidth(300);
     jTable1.getColumnModel().getColumn(03).setMaxWidth(350);
     jTable1.getColumnModel().getColumn(03).setResizable(false);
  
     jTable1.getColumnModel().getColumn(04).setHeaderValue("Father Name");
     jTable1.getColumnModel().getColumn(04).setPreferredWidth(300);
     jTable1.getColumnModel().getColumn(04).setMinWidth(300);
     jTable1.getColumnModel().getColumn(04).setMaxWidth(400);
     jTable1.getColumnModel().getColumn(04).setResizable(false);
     
     jTable1.getColumnModel().getColumn(05).setPreferredWidth(300);
     jTable1.getColumnModel().getColumn(05).setMinWidth(150);
     jTable1.getColumnModel().getColumn(05).setMaxWidth(300);
     jTable1.getColumnModel().getColumn(05).setResizable(false);
    
     jTable1.getColumnModel().getColumn(06).setPreferredWidth(300);
     jTable1.getColumnModel().getColumn(06).setMinWidth(130);
     jTable1.getColumnModel().getColumn(06).setMaxWidth(180);
     jTable1.getColumnModel().getColumn(06).setResizable(false);
     
     DefaultTableCellRenderer right = new DefaultTableCellRenderer();
     right.setHorizontalAlignment(SwingConstants.RIGHT);
     jTable1.getColumnModel().getColumn(07).setPreferredWidth(300);
     jTable1.getColumnModel().getColumn(07).setMinWidth(120);
     jTable1.getColumnModel().getColumn(07).setMaxWidth(400);
     jTable1.getColumnModel().getColumn(07).setResizable(false);
     jTable1.getColumnModel().getColumn(07).setCellRenderer(right);
    
//     jComboBoxClass.removeAllItems();
//     jComboBoxClass.addItem("Class");
//     jComboBoxClass.addItem("Nursary");
//     jComboBoxClass.addItem("KG-1");
//     jComboBoxClass.addItem("KG-2");
//     for(int i=1;i<=12;i++){ jComboBoxClass.addItem("Class "+i);}  
//     
     percentageText.setText("100");
     jComboBoxFees.removeAllItems();
     jComboBoxFees.addItem("Fees");
     jComboBoxFees.addItem("Paid");
     jComboBoxFees.addItem("Unpaid");
     //
     
     contactRadio.setSelected(true);
     feesRadio.setSelected(true);
     
     
     
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton buttonEditStudent;
    private javax.swing.JButton button_search;
    private javax.swing.JButton button_show;
    private javax.swing.JRadioButton contactRadio;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton feesPayButton;
    private javax.swing.JRadioButton feesRadio;
    private javax.swing.JComboBox<String> jComboBoxClass;
    private javax.swing.JComboBox<String> jComboBoxFees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField percentageText;
    private javax.swing.JButton printButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton removeStudentButton;
    private javax.swing.JButton reportsButton;
    private javax.swing.JLabel schoolNameLabel;
    private javax.swing.JTextField search_text;
    private javax.swing.JButton staffButton;
    // End of variables declaration//GEN-END:variables
}
