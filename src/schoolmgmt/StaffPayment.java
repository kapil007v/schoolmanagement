/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgmt;

import javax.swing.JOptionPane;

/**
 *
 * @author Kapil
 */
public class StaffPayment extends javax.swing.JFrame {

    /**
     * Creates new form StaffPayment
     */
    private Sql sql;
    public StaffPayment() {
        sql = new Sql(this);
        setVisible(true);
        setBounds(400, 300, 500,300);
        setTitle("Staff Payment");
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldId = new javax.swing.JTextField();
        jLabelTitle2 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        payButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jTextFieldAmount = new javax.swing.JTextField();
        jLabelTitle3 = new javax.swing.JLabel();
        jTextFieldbalance = new javax.swing.JTextField();
        jLabelTitle4 = new javax.swing.JLabel();
        jTextFieldComment = new javax.swing.JTextField();
        jLabelTitle5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldId.setColumns(2);
        jTextFieldId.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        jTextFieldId.setOpaque(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jLabelTitle2.setBackground(new java.awt.Color(102, 102, 255));
        jLabelTitle2.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        jLabelTitle2.setText("Enter Faculty ID");

        jTextFieldName.setColumns(2);
        jTextFieldName.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        jTextFieldName.setText("Faculty Name");
        jTextFieldName.setOpaque(false);

        payButton.setBackground(new java.awt.Color(0, 153, 0));
        payButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        payButton.setForeground(new java.awt.Color(255, 255, 255));
        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(153, 0, 0));
        cancelButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jTextFieldAmount.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTextFieldAmount.setText("Amount");
        jTextFieldAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldAmountFocusGained(evt);
            }
        });

        jLabelTitle3.setBackground(new java.awt.Color(102, 102, 255));
        jLabelTitle3.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        jLabelTitle3.setText("Name of Faculty");

        jTextFieldbalance.setColumns(2);
        jTextFieldbalance.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        jTextFieldbalance.setText("Amount");
        jTextFieldbalance.setOpaque(false);

        jLabelTitle4.setBackground(new java.awt.Color(102, 102, 255));
        jLabelTitle4.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        jLabelTitle4.setText("Amount");

        jTextFieldComment.setColumns(2);
        jTextFieldComment.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        jTextFieldComment.setText("comment");
        jTextFieldComment.setOpaque(false);

        jLabelTitle5.setBackground(new java.awt.Color(102, 102, 255));
        jLabelTitle5.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        jLabelTitle5.setText("Comment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabelTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabelTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabelTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabelTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldComment, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(191, 191, 191))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 356, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 127, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 198, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 29, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        
        // TODO add your handling code here:
        try{
            Integer id = Integer.valueOf(jTextFieldId.getText());
            double amount = Double.valueOf(jTextFieldAmount.getText());
            String comment= jTextFieldComment.getText();
            sql.addStaffPayment(new StaffPaymentRecipt(0, id, comment, " ",amount));
            sql.facultyAmountChange(id, -amount);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Cannot Update Amount.");
            return;
        }
        JOptionPane.showMessageDialog(this, "Amount Is Updated");
        
    }//GEN-LAST:event_payButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jTextFieldAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAmountFocusGained
        jTextFieldAmount.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmountFocusGained

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        Integer id = Integer.valueOf(jTextFieldId.getText());
        Teacher t = sql.getTeacher(id);
        jTextFieldName.setText(t.getName());
        jTextFieldbalance.setText(String.valueOf(t.getAmount()));
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JLabel jLabelTitle3;
    private javax.swing.JLabel jLabelTitle4;
    private javax.swing.JLabel jLabelTitle5;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldComment;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldbalance;
    private javax.swing.JButton payButton;
    // End of variables declaration//GEN-END:variables
}
