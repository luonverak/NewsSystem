package Popup;

import Components.ChooseFile;
import Controller.CategoryController;
import Controller.NewsController;
import Model.NewsModel;
import Model.UserModel;
import javax.swing.JOptionPane;

public class AddNews extends javax.swing.JFrame {

    private CategoryController categoryController = new CategoryController();
    private UserModel user = new UserModel();
    private String fileName;
    private int categoryId;

    public AddNews() {
        initComponents();
        categoryController.getCategory();
        categoryController.listCategory.forEach(e -> {
            this.categoryCombo.addItem(e.getCategoryTitle());
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        categoryCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        thumbnail = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1370, 690));
        setMinimumSize(new java.awt.Dimension(1370, 690));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Category");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        title.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 530, 60));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("Thumbnail");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        categoryCombo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPanel1.add(categoryCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 530, 60));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("Description");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        thumbnail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/news_thumbnail.png"))); // NOI18N
        thumbnail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        thumbnail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thumbnailMouseClicked(evt);
            }
        });
        jPanel1.add(thumbnail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 240, 270));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setText("Title");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 700, 510));

        kButton1.setText("Cancel");
        kButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(255, 51, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton1.setkStartColor(new java.awt.Color(255, 0, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, -1, -1));

        kButton2.setText("Save");
        kButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 51, 255));
        kButton2.setkStartColor(new java.awt.Color(0, 51, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 630, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1370, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        String title = this.title.getText();
        String description = this.description.getText();
        String category = this.categoryCombo.getSelectedItem().toString();

        categoryController.listCategory.forEach(e -> {
            if (e.getCategoryTitle().equals(category)) {
                categoryId = e.getId();
            }
        });
        if (!title.isEmpty() && !description.isEmpty() && categoryId != 0 && user.listId.getFirst() != null) {
            if (new NewsController().addNews(new NewsModel(title, description, fileName, categoryId, user.listId.getFirst()))) {
                JOptionPane.showMessageDialog(this, "News add success");
                return;
            }
            JOptionPane.showMessageDialog(this, "Failed");

        }
        JOptionPane.showMessageDialog(this, "Something went wrong");

    }//GEN-LAST:event_kButton2ActionPerformed

    private void thumbnailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thumbnailMouseClicked
        fileName = new ChooseFile().chooseFile(this.thumbnail);
    }//GEN-LAST:event_thumbnailMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryCombo;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JLabel thumbnail;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
