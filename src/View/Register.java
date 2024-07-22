package View;

import Components.Compoments;
import Controller.UserController;
import Model.UserModel;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YY");
    private Compoments compoments = new Compoments();
    private UserController controller = new UserController();

    public Register() {
        initComponents();
        controller.getUsername();
        this.usernameExsited.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameExsited = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1199, 626));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SwingGUI/images/images-label.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 440, 410));

        jPanel2.setBackground(new java.awt.Color(146, 190, 254));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Our News");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 40);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("Username");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 302, 109, 29);

        usernameExsited.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        usernameExsited.setForeground(new java.awt.Color(255, 51, 51));
        usernameExsited.setText("Username already existed*");
        jPanel2.add(usernameExsited);
        usernameExsited.setBounds(10, 400, 230, 17);

        username.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(10, 337, 568, 60);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 427, 107, 29);

        password.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jPanel2.add(password);
        password.setBounds(10, 460, 568, 60);

        register.setBackground(new java.awt.Color(0, 102, 255));
        register.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel2.add(register);
        register.setBounds(300, 540, 280, 60);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel6.setText("Gender");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 190, 79, 29);

        firstName.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jPanel2.add(firstName);
        firstName.setBounds(10, 100, 265, 60);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel7.setText("Last name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(315, 65, 112, 29);

        lastName.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jPanel2.add(lastName);
        lastName.setBounds(315, 100, 265, 60);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel8.setText("First name");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 65, 113, 29);

        gender.add(male);
        male.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male);
        male.setBounds(10, 225, 75, 47);

        gender.add(female);
        female.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female);
        female.setBounds(103, 225, 101, 47);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel9.setText("Date of birth");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(224, 190, 134, 29);

        dob.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jPanel2.add(dob);
        dob.setBounds(222, 225, 356, 47);

        cancel.setBackground(new java.awt.Color(255, 51, 51));
        cancel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel);
        cancel.setBounds(10, 540, 280, 60);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 590, 630));

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

        setSize(new java.awt.Dimension(1199, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        try {
            String firstName = this.firstName.getText();
            String lastName = this.lastName.getText();
            String dob = sdf.format(this.dob.getDate());
            String username = this.username.getText();
            String password = new String(this.password.getPassword());

            String gender = "";
            var groupGender = this.gender.getSelection();

            if (groupGender == null) {
                JOptionPane.showMessageDialog(rootPane, "Something went wrong");
                return;
            } else {
                gender = this.male.isSelected() == true ? "Male" : "Female";
            }

            if (!firstName.isEmpty() && !lastName.isEmpty() && !username.isEmpty() && !password.isEmpty()) {

                if (controller.createAccount(new UserModel(firstName, lastName, gender, dob, username, password))) {
                    JOptionPane.showMessageDialog(this, "Create account completed");
                    compoments.clear(this.firstName, this.lastName, this.username, this.password, this.gender, this.dob);
                    return;
                }

            }

            JOptionPane.showMessageDialog(rootPane, "Something went wrong");

        } catch (Exception e) {

            if (e.getMessage().equalsIgnoreCase("date must not be null")) {
                JOptionPane.showMessageDialog(rootPane, "Something went wrong");
                return;
            }
        }
    }//GEN-LAST:event_registerActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        String username = this.username.getText();
        boolean check = controller.listUsername.contains(username);
        if (check) {
            this.username.setForeground(Color.red);
            this.usernameExsited.setVisible(true);
            register.setEnabled(false);
        } else {
            this.username.setForeground(Color.black);
            this.usernameExsited.setVisible(false);
            register.setEnabled(true);
        }
    }//GEN-LAST:event_usernameKeyReleased

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Register().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastName;
    private javax.swing.JRadioButton male;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameExsited;
    // End of variables declaration//GEN-END:variables
}
