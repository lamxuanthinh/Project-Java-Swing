package home;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Viewhome extends javax.swing.JFrame {

    public List<Account> accountlist = new ArrayList<>();
    DefaultTableModel tableModel;

    public Viewhome() {
        initComponents();
        tableModel = (DefaultTableModel) tableaccount.getModel();
        showAccount();
    }

    public void showAccount() {
        accountlist = AccountModify.findAll();
        tableModel.setRowCount(0);

        for (Account x : accountlist) {
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, x.getUsername(),
                    x.getPassword(), x.getUrl(), x.getAccountname(), x.getAccountcreatedate()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableaccount = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfaccountcreatedate = new javax.swing.JTextField();
        tfaccountname = new javax.swing.JTextField();
        tfurl = new javax.swing.JTextField();
        tfpassword = new javax.swing.JTextField();
        btsearchUsername = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        btback = new javax.swing.JButton();
        btshow = new javax.swing.JToggleButton();
        btupdate = new javax.swing.JToggleButton();
        btsave = new javax.swing.JToggleButton();
        btreset = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        btsearchDate = new javax.swing.JButton();
        btsearchPassWord = new javax.swing.JButton();
        btsearchURL = new javax.swing.JButton();
        btshowAll = new javax.swing.JButton();
        btsearchName = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD");

        tfusername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tableaccount.setBackground(new java.awt.Color(153, 255, 153));
        tableaccount.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "No", "UserName", "PassWord", "URL", "Account Name", "Account Name Date"
                }
        ));
        jScrollPane1.setViewportView(tableaccount);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ACCOUNT NAME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ACCOUNT CREATE DATE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("USERNAME");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("URL");

        tfaccountcreatedate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfaccountcreatedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfaccountcreatedateActionPerformed(evt);
            }
        });

        tfaccountname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfaccountname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfaccountnameActionPerformed(evt);
            }
        });

        tfurl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfpassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btsearchUsername.setBackground(new java.awt.Color(153, 255, 255));
        btsearchUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btsearchUsername.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_search_48px_3.png")); // NOI18N
        btsearchUsername.setText(" USERNAME");
        btsearchUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchUsernameActionPerformed(evt);
            }
        });

        btdelete.setBackground(new java.awt.Color(153, 255, 255));
        btdelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btdelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_Delete_48px.png")); // NOI18N
        btdelete.setText("DELETE");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });

        btback.setBackground(new java.awt.Color(153, 255, 255));
        btback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btback.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_back_to_50px.png")); // NOI18N
        btback.setText("BACK");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        btshow.setBackground(new java.awt.Color(153, 255, 255));
        btshow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btshow.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_sort_by_recently_viewed_48px.png")); // NOI18N
        btshow.setText("SHOW");
        btshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btshowActionPerformed(evt);
            }
        });

        btupdate.setBackground(new java.awt.Color(153, 255, 255));
        btupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_available_updates_50px_1.png")); // NOI18N
        btupdate.setText("UPDATE");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        btsave.setBackground(new java.awt.Color(153, 255, 255));
        btsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_save_50px.png")); // NOI18N
        btsave.setText("SAVE");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        btreset.setBackground(new java.awt.Color(153, 255, 255));
        btreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btreset.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_reset_50px.png")); // NOI18N
        btreset.setText("RESET");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\Downloads\\CIO (1).png")); // NOI18N

        btsearchDate.setBackground(new java.awt.Color(153, 255, 255));
        btsearchDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btsearchDate.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_search_48px_3.png")); // NOI18N
        btsearchDate.setText("DATE");
        btsearchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchDateActionPerformed(evt);
            }
        });

        btsearchPassWord.setBackground(new java.awt.Color(153, 255, 255));
        btsearchPassWord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btsearchPassWord.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_search_48px_3.png")); // NOI18N
        btsearchPassWord.setText("PASSWORD");
        btsearchPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchPassWordActionPerformed(evt);
            }
        });

        btsearchURL.setBackground(new java.awt.Color(153, 255, 255));
        btsearchURL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btsearchURL.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_search_48px_3.png")); // NOI18N
        btsearchURL.setText(" URL");
        btsearchURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchURLActionPerformed(evt);
            }
        });

        btshowAll.setBackground(new java.awt.Color(153, 255, 255));
        btshowAll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btshowAll.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_show_property_40px.png")); // NOI18N
        btshowAll.setText("SHOW ALL");
        btshowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btshowAllActionPerformed(evt);
            }
        });

        btsearchName.setBackground(new java.awt.Color(153, 255, 255));
        btsearchName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btsearchName.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAMXUANTHINH\\AppData\\Local\\Temp\\icons8_search_48px_3.png")); // NOI18N
        btsearchName.setText("NAME");
        btsearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ACCOUNT MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btsave, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btreset, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfaccountcreatedate, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfaccountname, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btshow, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfurl, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(btshowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(49, 49, 49)
                                                                .addComponent(btdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                                                .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jScrollPane1))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btsearchUsername)
                                                .addGap(23, 23, 23)
                                                .addComponent(btsearchPassWord)
                                                .addGap(40, 40, 40)
                                                .addComponent(btsearchURL, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(btsearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(btsearchDate, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btsearchPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btsearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btsearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btsearchUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btsearchURL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(231, 231, 231)
                                                                .addComponent(btsave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btshow, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btreset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btshowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(tfurl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(21, 21, 21)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(tfaccountname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(tfaccountcreatedate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                                .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void tfaccountcreatedateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tfaccountnameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btsearchUsernameActionPerformed(java.awt.event.ActionEvent evt) {
        // button search by username :
        String input = JOptionPane.showInputDialog(this, "Please enter the name you are search by username ?");
        if (input.length() > 0) {
            accountlist = AccountModify.SearchbyUsername(input);
            tableModel.setRowCount(0);
            for (Account x : accountlist) {
                tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, x.getUsername(),
                        x.getPassword(), x.getUrl(), x.getAccountname(), x.getAccountcreatedate()});
            }
        }
    }

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {
        // button delete
        int selectedindex = tableaccount.getSelectedRow();
        if (selectedindex >= 0) {
            Account ac = accountlist.get(selectedindex);
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete");
            if (option == 0) {
                AccountModify.delete(ac.getNo());
                showAccount();
            } else {
                showAccount();
            }
        } else {
            JOptionPane.showMessageDialog(this, "please select the line to delete !!!");
        }
    }

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {
        // button back:
        new login.login().show();
        this.setVisible(false);
        this.dispose();
    }

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {
        // button sava :
        String username1 = tfusername.getText();
        String password1 = tfpassword.getText();
        String url1 = tfurl.getText();
        String accountname1 = tfaccountname.getText();
        String accountcreatedate1 = tfaccountcreatedate.getText();
        if (username1.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Username information is required");
        } else if (password1.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "PassWord information is required");
        } else if (accountname1.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Account Name information is required");
        } else {
            Account ac = new Account(username1, password1, url1, accountname1, accountcreatedate1);
            AccountModify.insert(ac);
            showAccount();
        }
    }

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {
        // button reset :
        tfusername.setText("");
        tfpassword.setText("");
        tfurl.setText("");
        tfaccountname.setText("");
        tfaccountcreatedate.setText("");
    }

    private void btshowActionPerformed(java.awt.event.ActionEvent evt) {
        // show data :
        int selectedindex = tableaccount.getSelectedRow();
        if (selectedindex >= 0) {
            Account ac = accountlist.get(selectedindex);
            tfusername.setText(ac.getUsername());
            tfpassword.setText(ac.getPassword());
            tfurl.setText(ac.getUrl());
            tfaccountname.setText(ac.getAccountname());
            tfaccountcreatedate.setText(ac.getAccountcreatedate());
        } else {
            JOptionPane.showMessageDialog(this, "please select the line to show data !!!");
        }
    }

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {
        // button update :
        String username1 = tfusername.getText();
        String password1 = tfpassword.getText();
        String url1 = tfurl.getText();
        String accountname1 = tfaccountname.getText();
        String accountcreatedate1 = tfaccountcreatedate.getText();
        if (username1.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Username information is required");
        } else if (password1.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "PassWord information is required");
        } else if (accountname1.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Account Name information is required");
        } else {

            int selectedindex = tableaccount.getSelectedRow();
            if (selectedindex >= 0) {
                Account ac1 = accountlist.get(selectedindex);
                Account ac = new Account(ac1.getNo(), username1, password1, url1, accountname1, accountcreatedate1);
                AccountModify.update(ac);
                showAccount();
            } else {
                JOptionPane.showMessageDialog(this, "Please select the line to update");
            }
        }
    }

    private void btsearchPassWordActionPerformed(java.awt.event.ActionEvent evt) {
        // button Search by Password :
        String input = JOptionPane.showInputDialog(this, "Please enter the name you are search by password ?");
        if (input.length() > 0) {
            accountlist = AccountModify.SearchbyPassword(input);
            tableModel.setRowCount(0);
            // xóa hết các hàng trên bảng
            for (Account x : accountlist) {
                tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, x.getUsername(),
                        x.getPassword(), x.getUrl(), x.getAccountname(), x.getAccountcreatedate()});
            }
        }
    }

    private void btshowAllActionPerformed(java.awt.event.ActionEvent evt) {
        // button show All:
        showAccount();
    }

    private void btsearchURLActionPerformed(java.awt.event.ActionEvent evt) {
        // button Search by URL :
        String input = JOptionPane.showInputDialog(this, "Please enter the name you are search by URL ?");
        if (input.length() > 0) {
            accountlist = AccountModify.SearchbyURL(input);
            tableModel.setRowCount(0);
            // xóa hết các hàng trên bảng
            for (Account x : accountlist) {
                tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, x.getUsername(),
                        x.getPassword(), x.getUrl(), x.getAccountname(), x.getAccountcreatedate()});
            }
        }
    }

    private void btsearchNameActionPerformed(java.awt.event.ActionEvent evt) {
        // button Search by Account Name:
        String input = JOptionPane.showInputDialog(this, "Please enter the name you are search by Account Name ?");
        if (input.length() > 0) {
            accountlist = AccountModify.SearchbyName(input);
            tableModel.setRowCount(0);
            // xóa hết các hàng trên bảng
            for (Account x : accountlist) {
                tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, x.getUsername(),
                        x.getPassword(), x.getUrl(), x.getAccountname(), x.getAccountcreatedate()});
            }
        }
    }

    private void btsearchDateActionPerformed(java.awt.event.ActionEvent evt) {
        // button Search by Password :
        String input = JOptionPane.showInputDialog(this, "Please enter the name you are search by Account create Name ?");
        if (input.length() > 0) {
            accountlist = AccountModify.SearchbyDate(input);
            tableModel.setRowCount(0);
            // xóa hết các hàng trên bảng
            for (Account x : accountlist) {
                tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, x.getUsername(),
                        x.getPassword(), x.getUrl(), x.getAccountname(), x.getAccountcreatedate()});
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btback;
    private javax.swing.JButton btdelete;
    private javax.swing.JToggleButton btreset;
    private javax.swing.JToggleButton btsave;
    private javax.swing.JButton btsearchDate;
    private javax.swing.JButton btsearchName;
    private javax.swing.JButton btsearchPassWord;
    private javax.swing.JButton btsearchURL;
    private javax.swing.JButton btsearchUsername;
    private javax.swing.JToggleButton btshow;
    private javax.swing.JButton btshowAll;
    private javax.swing.JToggleButton btupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableaccount;
    private javax.swing.JTextField tfaccountcreatedate;
    private javax.swing.JTextField tfaccountname;
    private javax.swing.JTextField tfpassword;
    private javax.swing.JTextField tfurl;
    private javax.swing.JTextField tfusername;
    // End of variables declaration

}
