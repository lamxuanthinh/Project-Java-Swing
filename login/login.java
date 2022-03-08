package login;

import home.*;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfpassword = new javax.swing.JTextField();
        btexit = new javax.swing.JButton();
        btcreateaccount = new javax.swing.JButton();
        btlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD");

        tfpassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpasswordActionPerformed(evt);
            }
        });

        btexit.setBackground(new java.awt.Color(153, 255, 255));
        btexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btexit.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_shutdown_48px.png")); // NOI18N
        btexit.setText("EXIT");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });

        btcreateaccount.setBackground(new java.awt.Color(153, 255, 255));
        btcreateaccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btcreateaccount.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_create_order_40px.png")); // NOI18N
        btcreateaccount.setText("CREATE ACCOUNT");
        btcreateaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcreateaccountActionPerformed(evt);
            }
        });

        btlogin.setBackground(new java.awt.Color(153, 255, 255));
        btlogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btlogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_login_100px.png")); // NOI18N
        btlogin.setText("LOGIN");
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_male_user_100px_2.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_forgot_password_80px_1.png")); // NOI18N
        jLabel4.setText("jLabel3");

        tfusername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(9, 9, 9)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(tfpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                                        .addComponent(tfusername)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btlogin)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                                .addComponent(btcreateaccount)
                                                .addGap(18, 18, 18)
                                                .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(54, 54, 54)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(53, 53, 53)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btcreateaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void tfpasswordActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {
        // button exit:
        System.exit(0);
    }

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {
        // button login:
        String username1 = tfusername.getText();
        String password1 = tfpassword.getText();
        password1 = Utilyti.getSecurityMD5(password1);

        Users us = UserModify.Login(username1, password1);
        if (us == null) {
            JOptionPane.showMessageDialog(this, "Account does not exist !!!");
        } else if (us.getActive() == 0) {
            JOptionPane.showMessageDialog(this, "Account not activated !!!");
        } else {
            // 1 admin ; 2 user ;
            if (us.getRole_id() == 1) {
                new Admin().show();
                this.setVisible(false);
                this.dispose();
            } else {
                new viewhome().show();
                this.setVisible(false);
                this.dispose();
            }
        }
    }

    private void btcreateaccountActionPerformed(java.awt.event.ActionEvent evt) {
        // chuyển sang trang đăng kí :
        new CreateAccount().show();
        this.setVisible(false);
        this.dispose();
    }

    private void tfusernameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btcreateaccount;
    private javax.swing.JButton btexit;
    private javax.swing.JButton btlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfpassword;
    private javax.swing.JTextField tfusername;
    // End of variables declaration
}
