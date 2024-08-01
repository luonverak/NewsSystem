package View;

import Controller.CategoryController;
import Controller.PositionController;
import Popup.AddCategory;
import Popup.AddNews;
import Popup.AddPosition;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    private int userId;

    public Dashboard() {
        initComponents();
    }

    public Dashboard(int id) {
        this.userId = id;
        initComponents();
    }

    public void click() {
        JOptionPane.showMessageDialog(this, "Home");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        indexPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        categoryPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        newsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kButton2 = new com.k33ptoo.components.KButton();
        profilePanel = new javax.swing.JPanel();
        positionPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        staffPosition = new javax.swing.JTable();
        menusPanel = new javax.swing.JPanel();
        dashboardTitle = new javax.swing.JLabel();
        categoryFeature = new javax.swing.JLabel();
        newsFeature = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        positionFeature = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1626, 868));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        indexPanel.setBackground(new java.awt.Color(255, 255, 255));
        indexPanel.setMinimumSize(new java.awt.Dimension(1416, 730));
        indexPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Panel");
        jPanel1.add(jLabel1);

        homePanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 1420, 70);

        indexPanel.add(homePanel, "card2");

        categoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        categoryPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("News category");
        categoryPanel.add(jLabel2);
        jLabel2.setBounds(40, 30, 259, 45);

        kButton1.setText("Add");
        kButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(255, 0, 51));
        kButton1.setkEndColor(new java.awt.Color(0, 102, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 51, 51));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 51, 102));
        kButton1.setkSelectedColor(new java.awt.Color(0, 51, 255));
        kButton1.setkStartColor(new java.awt.Color(0, 0, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        categoryPanel.add(kButton1);
        kButton1.setBounds(1180, 70, 185, 45);

        categoryTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Category Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        categoryTable.setRowHeight(50);
        categoryTable.getTableHeader().setResizingAllowed(false);
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);
        if (categoryTable.getColumnModel().getColumnCount() > 0) {
            categoryTable.getColumnModel().getColumn(0).setMinWidth(200);
            categoryTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            categoryTable.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        categoryPanel.add(jScrollPane1);
        jScrollPane1.setBounds(40, 140, 1320, 690);

        indexPanel.add(categoryPanel, "card3");

        newsPanel.setBackground(new java.awt.Color(255, 255, 255));
        newsPanel.setMinimumSize(new java.awt.Dimension(200, 220));
        newsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel3.setText("News Contents");
        newsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 750, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Title", "Category", "Description", "Views", "Admin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        newsPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1390, 760));

        kButton2.setText("Add");
        kButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 0, 51));
        kButton2.setkEndColor(new java.awt.Color(0, 102, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 0, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 51, 51));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 51, 102));
        kButton2.setkSelectedColor(new java.awt.Color(0, 51, 255));
        kButton2.setkStartColor(new java.awt.Color(0, 0, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        newsPanel.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 40, -1, -1));

        indexPanel.add(newsPanel, "card5");

        profilePanel.setBackground(new java.awt.Color(0, 51, 204));
        profilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        indexPanel.add(profilePanel, "card4");

        positionPanel.setBackground(new java.awt.Color(255, 255, 255));
        positionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel6.setText("Staff Position");
        positionPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        kButton3.setText("Add");
        kButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        kButton3.setkEndColor(new java.awt.Color(0, 102, 255));
        kButton3.setkHoverEndColor(new java.awt.Color(51, 51, 255));
        kButton3.setkStartColor(new java.awt.Color(0, 0, 255));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        positionPanel.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 40, -1, -1));

        staffPosition.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        staffPosition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Position"
            }
        ));
        staffPosition.setRowHeight(40);
        jScrollPane3.setViewportView(staffPosition);
        if (staffPosition.getColumnModel().getColumnCount() > 0) {
            staffPosition.getColumnModel().getColumn(0).setMinWidth(200);
            staffPosition.getColumnModel().getColumn(0).setPreferredWidth(200);
            staffPosition.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        positionPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1380, 700));

        indexPanel.add(positionPanel, "card6");

        getContentPane().add(indexPanel);
        indexPanel.setBounds(210, 0, 1420, 870);

        menusPanel.setBackground(new java.awt.Color(0, 0, 0));
        menusPanel.setMaximumSize(new java.awt.Dimension(170, 725));
        menusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        dashboardTitle.setForeground(new java.awt.Color(255, 255, 255));
        dashboardTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardTitle.setText("Dashboard");
        dashboardTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardTitleMouseClicked(evt);
            }
        });
        menusPanel.add(dashboardTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, -1));

        categoryFeature.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        categoryFeature.setForeground(new java.awt.Color(255, 255, 255));
        categoryFeature.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categoryFeature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        categoryFeature.setText("Category");
        categoryFeature.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        categoryFeature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryFeatureMouseClicked(evt);
            }
        });
        menusPanel.add(categoryFeature, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        newsFeature.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        newsFeature.setForeground(new java.awt.Color(255, 255, 255));
        newsFeature.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newsFeature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/news.png"))); // NOI18N
        newsFeature.setText("News");
        newsFeature.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        newsFeature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newsFeatureMouseClicked(evt);
            }
        });
        menusPanel.add(newsFeature, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, -1));

        logout.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menusPanel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 820, 190, -1));

        logout1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        logout1.setForeground(new java.awt.Color(255, 255, 255));
        logout1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        logout1.setText("Profile");
        logout1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        menusPanel.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 190, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/management.png"))); // NOI18N
        jLabel4.setText("Staff");
        menusPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, -1));

        positionFeature.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        positionFeature.setForeground(new java.awt.Color(255, 255, 255));
        positionFeature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/job.png"))); // NOI18N
        positionFeature.setText("Position");
        positionFeature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                positionFeatureMouseClicked(evt);
            }
        });
        menusPanel.add(positionFeature, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, -1));

        getContentPane().add(menusPanel);
        menusPanel.setBounds(0, 0, 210, 870);

        setSize(new java.awt.Dimension(1627, 896));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void categoryFeatureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryFeatureMouseClicked
        indexPanel.removeAll();
        indexPanel.add(categoryPanel);
        indexPanel.repaint();
        indexPanel.revalidate();
        new CategoryController().getCategory(categoryTable);
    }//GEN-LAST:event_categoryFeatureMouseClicked

    private void newsFeatureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsFeatureMouseClicked
        indexPanel.removeAll();
        indexPanel.add(newsPanel);
        indexPanel.repaint();
        indexPanel.revalidate();
    }//GEN-LAST:event_newsFeatureMouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        indexPanel.removeAll();
        indexPanel.add(profilePanel);
        indexPanel.repaint();
        indexPanel.revalidate();
    }//GEN-LAST:event_logout1MouseClicked

    private void dashboardTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTitleMouseClicked
        indexPanel.removeAll();
        indexPanel.add(homePanel);
        indexPanel.repaint();
        indexPanel.revalidate();
    }//GEN-LAST:event_dashboardTitleMouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        new AddCategory().setVisible(true);
    }//GEN-LAST:event_kButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        DefaultTableModel tableModel = (DefaultTableModel) this.categoryTable.getModel();
        int row = this.categoryTable.getSelectedRow();

        int catId = Integer.parseInt(tableModel.getValueAt(row, 0).toString());
        String category = tableModel.getValueAt(row, 1).toString();
        new AddCategory(catId, category).setVisible(true);

    }//GEN-LAST:event_categoryTableMouseClicked

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        new AddNews().setVisible(true);
    }//GEN-LAST:event_kButton2ActionPerformed

    private void positionFeatureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_positionFeatureMouseClicked
        indexPanel.removeAll();
        indexPanel.add(positionPanel);
        indexPanel.repaint();
        indexPanel.revalidate();
        new PositionController().getPosition(this.staffPosition);
    }//GEN-LAST:event_positionFeatureMouseClicked

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        new AddPosition().setVisible(true);
    }//GEN-LAST:event_kButton3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryFeature;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JTable categoryTable;
    private javax.swing.JLabel dashboardTitle;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel indexPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logout1;
    private javax.swing.JPanel menusPanel;
    private javax.swing.JLabel newsFeature;
    private javax.swing.JPanel newsPanel;
    private javax.swing.JLabel positionFeature;
    private javax.swing.JPanel positionPanel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JTable staffPosition;
    // End of variables declaration//GEN-END:variables
}
