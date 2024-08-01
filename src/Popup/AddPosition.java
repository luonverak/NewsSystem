package Popup;

import Controller.CategoryController;
import Controller.PositionController;
import Model.CategoryModel;
import Model.PositionModel;
import View.Dashboard;
import javax.swing.JOptionPane;

public class AddPosition extends javax.swing.JFrame {

    private int categoryId;
    private String category;
    private Dashboard dashboard=new Dashboard();

    public AddPosition() {
        initComponents();
    }

    public AddPosition(int catId, String category) {
        initComponents();
        this.categoryId = catId;
        this.category = category;

        if (category != null) {
            this.categoryLabel.setText("Edit category");
            this.savePosition.setText("Update");
        }
        this.positionField.setText(category);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JLabel();
        positionField = new javax.swing.JTextField();
        savePosition = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(624, 314));
        setSize(new java.awt.Dimension(624, 314));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setEnabled(false);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoryLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryLabel.setText("Create new position");
        jPanel1.add(categoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 72));

        positionField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        positionField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(51, 153, 255)));
        positionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionFieldActionPerformed(evt);
            }
        });
        jPanel1.add(positionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 570, 60));

        savePosition.setText("Save");
        savePosition.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        savePosition.setkBackGroundColor(new java.awt.Color(255, 51, 51));
        savePosition.setkEndColor(new java.awt.Color(51, 102, 255));
        savePosition.setkHoverEndColor(new java.awt.Color(51, 51, 255));
        savePosition.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        savePosition.setkSelectedColor(new java.awt.Color(255, 102, 102));
        savePosition.setkStartColor(new java.awt.Color(51, 102, 255));
        savePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePositionActionPerformed(evt);
            }
        });
        jPanel1.add(savePosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        kButton2.setText("Cancel");
        kButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 255, 204));
        kButton2.setkEndColor(new java.awt.Color(255, 51, 51));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 0));
        kButton2.setkPressedColor(new java.awt.Color(255, 153, 153));
        kButton2.setkSelectedColor(new java.awt.Color(204, 204, 0));
        kButton2.setkStartColor(new java.awt.Color(255, 0, 51));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(624, 342));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void positionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionFieldActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void savePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePositionActionPerformed
        String position = this.positionField.getText();

        if (position.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Something went wrong");
            return;
        }


        if (new PositionController().insert(new PositionModel(position))) {
            JOptionPane.showMessageDialog(this, "Position add success");
            dispose();
            return;
        }
        JOptionPane.showMessageDialog(this, "Position add failed");

    }//GEN-LAST:event_savePositionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JTextField positionField;
    private com.k33ptoo.components.KButton savePosition;
    // End of variables declaration//GEN-END:variables
}
