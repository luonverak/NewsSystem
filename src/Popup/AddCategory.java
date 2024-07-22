
package Popup;

public class AddCategory extends javax.swing.JFrame {

    public AddCategory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        categortyField = new javax.swing.JTextField();
        saveCategory = new com.k33ptoo.components.KButton();
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

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create new category");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 72));

        categortyField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        categortyField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(51, 153, 255)));
        categortyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categortyFieldActionPerformed(evt);
            }
        });
        jPanel1.add(categortyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 570, 60));

        saveCategory.setText("Save");
        saveCategory.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        saveCategory.setkBackGroundColor(new java.awt.Color(255, 51, 51));
        saveCategory.setkEndColor(new java.awt.Color(51, 102, 255));
        saveCategory.setkHoverEndColor(new java.awt.Color(51, 51, 255));
        saveCategory.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        saveCategory.setkSelectedColor(new java.awt.Color(255, 102, 102));
        saveCategory.setkStartColor(new java.awt.Color(51, 102, 255));
        jPanel1.add(saveCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

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

    private void categortyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categortyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categortyFieldActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categortyField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton saveCategory;
    // End of variables declaration//GEN-END:variables
}
