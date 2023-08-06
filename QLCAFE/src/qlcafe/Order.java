/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlcafe;

import Model.NHANVIEN;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */        String id="";
    public Order() {
        initComponents();
        ShowProducts();
    }
public Order(NHANVIEN nv) {
        initComponents();     
        id=nv.IDNV;
        tfTest.setText(nv.IDNV);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        txBill = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tfPay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfChange = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        lblPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pro_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        tfTest = new javax.swing.JTextField();

        txBill.setColumns(20);
        txBill.setRows(5);
        jScrollPane3.setViewportView(txBill);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel2.setBackground(new java.awt.Color(71, 72, 83));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/java.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(223, 125, 54));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/order_cam.png"))); // NOI18N
        jLabel2.setText("Đặt Món");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 236, 236));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/product_trang.png"))); // NOI18N
        jLabel4.setText("Thực Đơn");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 236, 236));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/customer_trang.png"))); // NOI18N
        jLabel5.setText("Khách Hàng");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 236, 236));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/summary_trang.png"))); // NOI18N
        jLabel6.setText("Thống Kê");

        btnLogout.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 236, 236));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nhanvien_trang.png"))); // NOI18N
        jLabel10.setText("Nhân Viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("HÓA ĐƠN");

        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Tên Món", "Loại", "Đơn Giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblBill);
        if (tblBill.getColumnModel().getColumnCount() > 0) {
            tblBill.getColumnModel().getColumn(0).setResizable(false);
            tblBill.getColumnModel().getColumn(1).setResizable(false);
            tblBill.getColumnModel().getColumn(2).setResizable(false);
            tblBill.getColumnModel().getColumn(3).setResizable(false);
            tblBill.getColumnModel().getColumn(4).setResizable(false);
            tblBill.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 72, 83));
        jLabel9.setText("Tiền khách đưa:");

        tfPay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfPay.setForeground(new java.awt.Color(71, 72, 83));
        tfPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPayFocusLost(evt);
            }
        });
        tfPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPayKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 72, 83));
        jLabel11.setText("Tổng Tiền:");

        tfTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 72, 83));
        jLabel12.setText("Tiền Thừa:");

        tfChange.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfChange.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnPrint.setBackground(new java.awt.Color(223, 125, 54));
        btnPrint.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Xuất Hóa Đơn");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        lblPhone.setText("Số điện thoại KH:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addGap(93, 93, 93))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTotal)
                    .addComponent(tfPay)
                    .addComponent(tfChange)
                    .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(tfChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pro_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pro_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID ", "Hình ảnh", "Loại", "Tên Món", "Đơn Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pro_table.setShowGrid(true);
        pro_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pro_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pro_table);
        if (pro_table.getColumnModel().getColumnCount() > 0) {
            pro_table.getColumnModel().getColumn(0).setResizable(false);
            pro_table.getColumnModel().getColumn(1).setResizable(false);
            pro_table.getColumnModel().getColumn(2).setResizable(false);
            pro_table.getColumnModel().getColumn(3).setResizable(false);
            pro_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 72, 83));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/filter.png"))); // NOI18N
        jLabel8.setText("Bộ lọc:");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(71, 72, 83));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - -", "Đồ Ăn", "Thức Uống", "Tráng Miệng" }));

        btnAdd.setText("Thêm vào hóa đơn");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(btnAdd)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(tfTest, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addGap(51, 51, 51)
                .addComponent(tfTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed
    String key = "";
    String name = "";
    String cate = "";
    int price = 0;
    int count = 1;
    private void pro_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) pro_table.getModel();
        int myIndex = pro_table.getSelectedRow();
        key = String.valueOf(model.getValueAt(myIndex, 0).toString());
//        tfName.setText((String) model.getValueAt(myIndex, 2));
        cate = String.valueOf(model.getValueAt(myIndex, 2));
//        tfCate.setText((String) model.getValueAt( myIndex, 3));
        name = String.valueOf(model.getValueAt(myIndex, 3));
        price = Integer.parseInt(model.getValueAt(myIndex, 4).toString());
    }//GEN-LAST:event_pro_tableMouseClicked
    int sum = 0;
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblBill.getModel();
        String nameToAdd = name;
        int countToAdd = 1;
        int rowIndexToUpdate = -1; // Biến để lưu index của dòng cần cập nhật count

// Kiểm tra xem name đã tồn tại trong bảng hay chưa
        for (int i = 0; i < model.getRowCount(); i++) {
            String nameInTable = model.getValueAt(i, 2).toString();
            if (nameInTable.equals(nameToAdd)) {
                // Nếu name đã tồn tại, tăng count lên
                countToAdd = Integer.parseInt(model.getValueAt(i, 5).toString()) + 1;
                rowIndexToUpdate = i; // Gán index của dòng cần cập nhật
                break;
            }
        }

// Nếu tìm thấy dòng trùng, chỉ cập nhật count
        if (rowIndexToUpdate != -1) {
            model.setValueAt(countToAdd, rowIndexToUpdate, 5);
        } else {
            // Nếu không tìm thấy dòng trùng, thêm dòng mới
            String nextRowID = Integer.toString(model.getRowCount());
            model.addRow(new Object[]{
                Integer.parseInt(nextRowID) + 1,
                key,
                nameToAdd,
                cate,
                price,
                countToAdd,});
        }
        int total = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            int rowPrice = Integer.parseInt(model.getValueAt(i, 4).toString()); // Giả sử cột "price" nằm ở vị trí thứ 3 trong bảng
            int rowCount = Integer.parseInt(model.getValueAt(i, 5).toString()); // Giả sử cột "count" nằm ở vị trí thứ 4 trong bảng
            total += rowPrice * rowCount;
        }
        sum = total;
        String sum = String.format("%,d", total);
        tfTotal.setText(sum + "VND");
//        calculateChange(total);
    }//GEN-LAST:event_btnAddActionPerformed

    private void tfPayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPayKeyReleased
        // TODO add your handling code here:
        calculateChange();
    }//GEN-LAST:event_tfPayKeyReleased

    private void tfPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPayFocusLost
        // TODO add your handling code here:
        //    calculateChange();
    }//GEN-LAST:event_tfPayFocusLost

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
         MyConnection con = new MyConnection();
        ResultSet rs;
        DefaultTableModel model = (DefaultTableModel) tblBill.getModel();
        String phone = String.valueOf(tfPhone.getText().trim());
        try{
            String et = "INSERT INTO DONHANG (TongGia, NgayDatHang, IDNV, SDT) VALUES (?,?,?,?)";       
            PreparedStatement donhang = con.getConnection().prepareStatement(et);            
            
            String sql = "INSERT INTO chitietdonhang (SOLUONG, DONGIA, MaDH, ID_SP) VALUES (?, ?, ?,?)";
            PreparedStatement ctdh =con.getConnection().prepareStatement(sql);
                  for (int i = 0; i < model.getRowCount(); i++) {
                      int SL = Integer.parseInt(model.getValueAt(i,5).toString());
                      int dongia = Integer.parseInt(model.getValueAt(i,4).toString());
                      String masp = String.valueOf(model.getValueAt(i,1));
                       java.util.Date ngayDatHang = new java.util.Date();
                       donhang.setInt(1, sum);
                       donhang.setDate(2, new java.sql.Date(ngayDatHang.getTime()));
                       donhang.setString(3,id );
                       donhang.setString(4, phone);
                      donhang.executeUpdate();
                      
                      ResultSet generatedKeys = donhang.getGeneratedKeys();
                int madh = 0;
                if (generatedKeys.next()) {
                    madh = generatedKeys.getInt(1);
                }
                     ctdh.setInt(1, SL);
                     ctdh.setInt(2,  dongia);
                     ctdh.setInt(3, madh);
                     ctdh.setString(4, masp );
                     ctdh.executeUpdate();
                  }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPrintActionPerformed
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Beverage bev = new Beverage();
        this.dispose();
        bev.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked
    public void calculateChange() {
        int tienkhachdua = Integer.parseInt(tfPay.getText().trim());
        int total = sum;
        int change = tienkhachdua - total;
        tfChange.setText(String.format("%,d", change) + "VND");
    }

    class ImageRenderer extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                // Hiển thị hình ảnh trong cột
                setIcon((ImageIcon) value);
                setHorizontalAlignment(JLabel.CENTER);
                setVerticalAlignment(JLabel.CENTER);
                setOpaque(true);
                setBackground(Color.WHITE); // Cài đặt nền cho JLabel là màu trắng
            } else {
                // Nếu không phải hình ảnh, hiển thị giá trị mặc định của TableCellRenderer
                setText((value != null) ? value.toString() : "");
            }
            return this;
        }
    }

    public void ShowProducts() {
        String sql = "Select * from product";
        try {
            MyConnection con = new MyConnection();
            PreparedStatement ps;
            ps = con.getConnection().prepareStatement(sql);
            ResultSet rs;
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) pro_table.getModel();
            pro_table.getColumnModel().getColumn(1).setCellRenderer(new Order.ImageRenderer());
            //canh giữa
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            pro_table.setDefaultRenderer(String.class, centerRenderer);
            model.setRowCount(0);
            pro_table.setRowHeight(60);
            while (rs.next()) {
                byte[] imageBytes = rs.getBytes("Image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(imageBytes).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                model.addRow(new Object[]{
                    rs.getString("ID_SP"),
                    imageIcon,
                    rs.getString("Loai"),
                    rs.getString("TenSP"),
                    rs.getInt("GiaSP")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTable pro_table;
    private javax.swing.JTable tblBill;
    private javax.swing.JTextField tfChange;
    private javax.swing.JTextField tfPay;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfTest;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextArea txBill;
    // End of variables declaration//GEN-END:variables
}
