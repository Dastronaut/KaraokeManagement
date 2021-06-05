package View;

import Model.SANPHAM;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Trần Kim Tiến Đạt
 */
public class ThemSanPhamForm extends javax.swing.JFrame {

    /**
     * Creates new form LocSPForm
     */
    private static String TenSanPham= "";
    public ThemSanPhamForm() {
        initComponents();
        loadSanPham();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablespthem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        soluongtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tensptxt = new javax.swing.JTextField();
        donvitxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gianhaptxt = new javax.swing.JTextField();
        giabantxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        filllabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        resetbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý Menu Sản phẩm");

        tablespthem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SP dịch vụ", "Đơn vị", "S. Lượng", "Giá nhập", "Giá bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        tablespthem.setColumnSelectionAllowed(true);
        tablespthem.setRequestFocusEnabled(false);
        tablespthem.getTableHeader().setReorderingAllowed(false);
        tablespthem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablespthemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablespthem);
        tablespthem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel4.setText("Giá nhập: ");

        jLabel5.setText("Giá bán: ");

        jLabel2.setText("Đơn vị: ");

        jLabel3.setText("Số lượng: ");

        jLabel1.setText("Tên hàng:");

        filllabel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filllabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tensptxt)
                            .addComponent(donvitxt)
                            .addComponent(soluongtxt)
                            .addComponent(giabantxt)
                            .addComponent(gianhaptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tensptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(donvitxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(soluongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gianhaptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(giabantxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filllabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        resetbtn.setForeground(new java.awt.Color(0, 204, 0));
        resetbtn.setText("Nhập lại");
        resetbtn.setMaximumSize(new java.awt.Dimension(80, 25));
        resetbtn.setMinimumSize(new java.awt.Dimension(70, 20));
        resetbtn.setPreferredSize(new java.awt.Dimension(100, 40));
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        delbtn.setForeground(new java.awt.Color(255, 102, 0));
        delbtn.setText("Gỡ bỏ");
        delbtn.setMaximumSize(new java.awt.Dimension(80, 25));
        delbtn.setMinimumSize(new java.awt.Dimension(70, 20));
        delbtn.setPreferredSize(new java.awt.Dimension(100, 40));
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        addbtn.setForeground(new java.awt.Color(0, 204, 0));
        addbtn.setText("Thêm mới");
        addbtn.setMaximumSize(new java.awt.Dimension(80, 25));
        addbtn.setMinimumSize(new java.awt.Dimension(70, 20));
        addbtn.setPreferredSize(new java.awt.Dimension(100, 40));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setForeground(new java.awt.Color(0, 204, 51));
        editbtn.setText("Thay đổi");
        editbtn.setMaximumSize(new java.awt.Dimension(80, 25));
        editbtn.setMinimumSize(new java.awt.Dimension(70, 20));
        editbtn.setPreferredSize(new java.awt.Dimension(100, 40));
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        closebtn.setForeground(new java.awt.Color(255, 0, 0));
        closebtn.setText("Đóng");
        closebtn.setMaximumSize(new java.awt.Dimension(80, 25));
        closebtn.setMinimumSize(new java.awt.Dimension(70, 20));
        closebtn.setPreferredSize(new java.awt.Dimension(100, 40));
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadSanPham() {
        DefaultTableModel tableModel = (DefaultTableModel)tablespthem.getModel();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        List<SANPHAM> sps = Controller.SANPHAMService.getAllSanPham();
        for (SANPHAM sanpham:sps) {
            Object o[] = {sanpham.getTenSanPham(), sanpham.getDonVi(), sanpham.getSoLuong(), sanpham.getGiaNhap(), sanpham.getGiaBan()};
            tableModel.addRow(o);
        }
    }
    private boolean isFilled() {
        if (tensptxt.getText().equals("") || soluongtxt.getText().equals("") || donvitxt.getText().equals("")
                || giabantxt.getText().equals("") || gianhaptxt.getText().equals("")) {
            filllabel.setText("Vui lòng nhập đầy đủ thông tin.");
            return false;
        }
        return true;
    }
    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        if (tablespthem.getRowCount() != 0 && tablespthem.getRowSelectionAllowed() && tablespthem.getSelectedRow() != -1) {
            String tensp = String.valueOf(tablespthem.getValueAt(tablespthem.getSelectedRow(), 0));
            if (Controller.SANPHAMService.deleteSanPham(tensp) != 0) {
                DefaultTableModel tableModel = (DefaultTableModel)tablespthem.getModel();
                tableModel.removeRow(tablespthem.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Xóa sản phẩm thành công.");
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm trước khi xóa.");
        }
        loadSanPham();
    }//GEN-LAST:event_delbtnActionPerformed

    private void resetText() {
        tensptxt.setText("");
        soluongtxt.setText("");
        donvitxt.setText("");
        giabantxt.setText("");
        gianhaptxt.setText("");
    }
    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        
    }//GEN-LAST:event_resetbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        if (isFilled()) {
            String tensp = tensptxt.getText(),
                donvi = donvitxt.getText();
            int soluong = Integer.valueOf(soluongtxt.getText()),
                giaban = Integer.valueOf(giabantxt.getText()),
                gianhap = Integer.valueOf(gianhaptxt.getText());
            if (!Controller.SANPHAMService.checkExistedSP(tensp) && Controller.SANPHAMService.setSanPham(tensp, soluong, donvi, gianhap, giaban) != 0) {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thất bại.");
            }
            resetText();
            loadSanPham();
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        if (isFilled() && !TenSanPham.equals("")) {
            String tenmoi = tensptxt.getText(),
                donvi = donvitxt.getText();
            int soluong = Integer.valueOf(soluongtxt.getText()),
                giaban = Integer.valueOf(giabantxt.getText()),
                gianhap = Integer.valueOf(gianhaptxt.getText());
            if (Controller.SANPHAMService.updateSanPham(TenSanPham, tenmoi, soluong, donvi, gianhap, giaban) != 0) {
                JOptionPane.showMessageDialog(this, "Sửa sản phẩm thành công.");
            }
            resetText();
            loadSanPham();
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void tablespthemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablespthemMouseClicked
        if (evt.getClickCount() == 2) {
            String tensp = String.valueOf(tablespthem.getValueAt(tablespthem.getSelectedRow(), 0));
            TenSanPham = tensp;
            List<SANPHAM> sps = Controller.SANPHAMService.getAllSanPham();
            for (SANPHAM sanpham:sps) {
                if (sanpham.getTenSanPham().equals(tensp)) {
                    tensptxt.setText(sanpham.getTenSanPham());
                    donvitxt.setText(sanpham.getDonVi());
                    soluongtxt.setText(String.valueOf(sanpham.getSoLuong()));
                    gianhaptxt.setText(String.valueOf(sanpham.getGiaNhap()));
                    giabantxt.setText(String.valueOf(sanpham.getGiaBan()));
                    break;
                }
            }
        }
    }//GEN-LAST:event_tablespthemMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemSanPhamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSanPhamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSanPhamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSanPhamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSanPhamForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton delbtn;
    private javax.swing.JTextField donvitxt;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel filllabel;
    private javax.swing.JTextField giabantxt;
    private javax.swing.JTextField gianhaptxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField soluongtxt;
    private javax.swing.JTable tablespthem;
    private javax.swing.JTextField tensptxt;
    // End of variables declaration//GEN-END:variables
}
