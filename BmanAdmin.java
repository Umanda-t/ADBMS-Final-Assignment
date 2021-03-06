
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BmanAdmin extends javax.swing.JFrame {

    /**
     * Creates new form BmanAdmin
     */
    public BmanAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        adminDetailsPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        loginDetailsPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        employeeDetailsPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        dependentDetailsPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        stockDetailsPanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        supplierDetailsPanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1454, 873));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel8.setBackground(new java.awt.Color(31, 24, 100));
        jPanel8.setPreferredSize(new java.awt.Dimension(216, 92));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Admin");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_administrative_tools_60px.png"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_delete_60px.png"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel33MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_back_60px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminDetailsPanel.setBackground(new java.awt.Color(44, 37, 167));
        adminDetailsPanel.setPreferredSize(new java.awt.Dimension(361, 453));
        adminDetailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDetailsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminDetailsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminDetailsPanelMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Admin Details");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_administrative_tools_60px.png"))); // NOI18N

        javax.swing.GroupLayout adminDetailsPanelLayout = new javax.swing.GroupLayout(adminDetailsPanel);
        adminDetailsPanel.setLayout(adminDetailsPanelLayout);
        adminDetailsPanelLayout.setHorizontalGroup(
            adminDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminDetailsPanelLayout.createSequentialGroup()
                .addGroup(adminDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminDetailsPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel21))
                    .addGroup(adminDetailsPanelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel22)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        adminDetailsPanelLayout.setVerticalGroup(
            adminDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel21)
                .addGap(60, 60, 60))
        );

        loginDetailsPanel.setBackground(new java.awt.Color(44, 37, 167));
        loginDetailsPanel.setPreferredSize(new java.awt.Dimension(361, 453));
        loginDetailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginDetailsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginDetailsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginDetailsPanelMouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Login Details");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_user_70px.png"))); // NOI18N

        javax.swing.GroupLayout loginDetailsPanelLayout = new javax.swing.GroupLayout(loginDetailsPanel);
        loginDetailsPanel.setLayout(loginDetailsPanelLayout);
        loginDetailsPanelLayout.setHorizontalGroup(
            loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDetailsPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(99, 99, 99))
        );
        loginDetailsPanelLayout.setVerticalGroup(
            loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel23)
                .addGap(60, 60, 60))
        );

        employeeDetailsPanel.setBackground(new java.awt.Color(44, 37, 167));
        employeeDetailsPanel.setPreferredSize(new java.awt.Dimension(361, 453));
        employeeDetailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeDetailsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                employeeDetailsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                employeeDetailsPanelMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Employee Details");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_management_60px.png"))); // NOI18N

        javax.swing.GroupLayout employeeDetailsPanelLayout = new javax.swing.GroupLayout(employeeDetailsPanel);
        employeeDetailsPanel.setLayout(employeeDetailsPanelLayout);
        employeeDetailsPanelLayout.setHorizontalGroup(
            employeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeDetailsPanelLayout.createSequentialGroup()
                .addGroup(employeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employeeDetailsPanelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel26))
                    .addGroup(employeeDetailsPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel25)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        employeeDetailsPanelLayout.setVerticalGroup(
            employeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel25)
                .addGap(60, 60, 60))
        );

        dependentDetailsPanel.setBackground(new java.awt.Color(44, 37, 167));
        dependentDetailsPanel.setPreferredSize(new java.awt.Dimension(361, 453));
        dependentDetailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dependentDetailsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dependentDetailsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dependentDetailsPanelMouseExited(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Dependent Details");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_guardian_70px.png"))); // NOI18N

        javax.swing.GroupLayout dependentDetailsPanelLayout = new javax.swing.GroupLayout(dependentDetailsPanel);
        dependentDetailsPanel.setLayout(dependentDetailsPanelLayout);
        dependentDetailsPanelLayout.setHorizontalGroup(
            dependentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dependentDetailsPanelLayout.createSequentialGroup()
                .addGroup(dependentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dependentDetailsPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel27))
                    .addGroup(dependentDetailsPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel28)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        dependentDetailsPanelLayout.setVerticalGroup(
            dependentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dependentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel27)
                .addGap(59, 59, 59))
        );

        stockDetailsPanel.setBackground(new java.awt.Color(44, 37, 167));
        stockDetailsPanel.setPreferredSize(new java.awt.Dimension(361, 453));
        stockDetailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockDetailsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockDetailsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockDetailsPanelMouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Stock Details");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_warehouse_60px.png"))); // NOI18N

        javax.swing.GroupLayout stockDetailsPanelLayout = new javax.swing.GroupLayout(stockDetailsPanel);
        stockDetailsPanel.setLayout(stockDetailsPanelLayout);
        stockDetailsPanelLayout.setHorizontalGroup(
            stockDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockDetailsPanelLayout.createSequentialGroup()
                .addGroup(stockDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stockDetailsPanelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel30))
                    .addGroup(stockDetailsPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel29)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        stockDetailsPanelLayout.setVerticalGroup(
            stockDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stockDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel29)
                .addGap(60, 60, 60))
        );

        supplierDetailsPanel.setBackground(new java.awt.Color(44, 37, 167));
        supplierDetailsPanel.setPreferredSize(new java.awt.Dimension(361, 453));
        supplierDetailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierDetailsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supplierDetailsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supplierDetailsPanelMouseExited(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Supplier Details");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_supplier_60px.png"))); // NOI18N

        javax.swing.GroupLayout supplierDetailsPanelLayout = new javax.swing.GroupLayout(supplierDetailsPanel);
        supplierDetailsPanel.setLayout(supplierDetailsPanelLayout);
        supplierDetailsPanelLayout.setHorizontalGroup(
            supplierDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierDetailsPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel32)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(84, 84, 84))
        );
        supplierDetailsPanelLayout.setVerticalGroup(
            supplierDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel31)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1454, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dependentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stockDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adminDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(loginDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(employeeDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dependentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 106, Short.MAX_VALUE))
        );

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminDetailsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDetailsPanelMouseClicked
       Admin_Registration adminRegistration=new Admin_Registration();
       adminRegistration.setVisible(true);
    }//GEN-LAST:event_adminDetailsPanelMouseClicked

    private void adminDetailsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDetailsPanelMouseEntered
       setColor(adminDetailsPanel);
    }//GEN-LAST:event_adminDetailsPanelMouseEntered

    private void adminDetailsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDetailsPanelMouseExited
       resetColor(adminDetailsPanel);
    }//GEN-LAST:event_adminDetailsPanelMouseExited

    private void loginDetailsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginDetailsPanelMouseClicked
       Employee_Login_Details employeeLoginDetails=new Employee_Login_Details();
       employeeLoginDetails.setVisible(true);
    }//GEN-LAST:event_loginDetailsPanelMouseClicked

    private void loginDetailsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginDetailsPanelMouseEntered
        setColor(loginDetailsPanel);
    }//GEN-LAST:event_loginDetailsPanelMouseEntered

    private void loginDetailsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginDetailsPanelMouseExited
        resetColor(loginDetailsPanel);
    }//GEN-LAST:event_loginDetailsPanelMouseExited

    private void employeeDetailsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeDetailsPanelMouseClicked
       Employee_Details employeeDetails=new Employee_Details();
       employeeDetails.setVisible(true);
    }//GEN-LAST:event_employeeDetailsPanelMouseClicked

    private void employeeDetailsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeDetailsPanelMouseEntered
        setColor(employeeDetailsPanel);
    }//GEN-LAST:event_employeeDetailsPanelMouseEntered

    private void employeeDetailsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeDetailsPanelMouseExited
        resetColor(employeeDetailsPanel);
    }//GEN-LAST:event_employeeDetailsPanelMouseExited

    private void dependentDetailsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dependentDetailsPanelMouseClicked
       Dependent dependent=new Dependent();
       dependent.setVisible(true);
    }//GEN-LAST:event_dependentDetailsPanelMouseClicked

    private void dependentDetailsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dependentDetailsPanelMouseEntered
        setColor(dependentDetailsPanel);
    }//GEN-LAST:event_dependentDetailsPanelMouseEntered

    private void dependentDetailsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dependentDetailsPanelMouseExited
        resetColor(dependentDetailsPanel);
    }//GEN-LAST:event_dependentDetailsPanelMouseExited

    private void stockDetailsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockDetailsPanelMouseClicked
       Stock stock=new Stock();
       stock.setVisible(true);
    }//GEN-LAST:event_stockDetailsPanelMouseClicked

    private void stockDetailsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockDetailsPanelMouseEntered
        setColor(stockDetailsPanel);
    }//GEN-LAST:event_stockDetailsPanelMouseEntered

    private void stockDetailsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockDetailsPanelMouseExited
        resetColor(stockDetailsPanel);
    }//GEN-LAST:event_stockDetailsPanelMouseExited

    private void supplierDetailsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierDetailsPanelMouseClicked
       Supplier supplier=new Supplier();
       supplier.setVisible(true);
    }//GEN-LAST:event_supplierDetailsPanelMouseClicked

    private void supplierDetailsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierDetailsPanelMouseEntered
         setColor(supplierDetailsPanel);
    }//GEN-LAST:event_supplierDetailsPanelMouseEntered

    private void supplierDetailsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierDetailsPanelMouseExited
        resetColor(supplierDetailsPanel);
    }//GEN-LAST:event_supplierDetailsPanelMouseExited

    private void jLabel33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel33MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        int result=JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "LOGOUT",JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
           this.hide();
           MainPage mainPage=new MainPage();
           mainPage.setVisible(true);
        }
        else if(result==JOptionPane.NO_OPTION)
        {
            this.setVisible(true);
        }
        else
        {
            this.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MousePressed

    void setColor(JPanel panel)
    {
        panel.setBackground(new Color(105,101,181));
    }
    
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(44,37,167));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BmanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BmanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BmanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BmanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BmanAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminDetailsPanel;
    private javax.swing.JPanel dependentDetailsPanel;
    private javax.swing.JPanel employeeDetailsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel loginDetailsPanel;
    private javax.swing.JPanel stockDetailsPanel;
    private javax.swing.JPanel supplierDetailsPanel;
    // End of variables declaration//GEN-END:variables
}
