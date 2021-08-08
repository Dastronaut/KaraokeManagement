package View;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Trần Kim Tiến Đạt
 */
public class BillPrinterForm extends javax.swing.JFrame {

    private static String tenphongString;
    private static String giovaoString;
    private static String gioraString;
    private static int TienGio;
    private static int TongTien;
    private static List<Object[]> Listorder;
    public BillPrinterForm(String tenphong, String giovao, String giora, int tiengio, int tongtien, List<Object[]> listorder) {
        tenphongString = tenphong;
        giovaoString = giovao;
        gioraString = giora;
        TienGio = tiengio;
        TongTien = tongtien;
        Listorder = listorder;
        initComponents();
        loadData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tenphong = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebillprint = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnprint = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BillPanel.setMaximumSize(new java.awt.Dimension(148, 210));
        BillPanel.setMinimumSize(new java.awt.Dimension(148, 210));
        BillPanel.setPreferredSize(new java.awt.Dimension(148, 210));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("KARAOKE LAN RUNG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Đ/c: 75 Lý Tự Trọng, Thạch Thang, Hải Châu, Đà Nẵng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Phiếu Thanh Toán");

        tenphong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tenphong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tablebillprint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablebillprint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SP Dịch vụ", "Giá", "SL", "T. Tiền"
            }
        ));
        jScrollPane1.setViewportView(tablebillprint);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Xin Cảm Ơn Và Hẹn Gặp Lại Qúy Khách!");

        javax.swing.GroupLayout BillPanelLayout = new javax.swing.GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tenphong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BillPanelLayout.setVerticalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tenphong, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        btnprint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnprint.setForeground(new java.awt.Color(0, 0, 255));
        btnprint.setText("In bill");
        btnprint.setPreferredSize(new java.awt.Dimension(75, 30));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        btnclose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 0, 0));
        btnclose.setText("Đóng");
        btnclose.setPreferredSize(new java.awt.Dimension(75, 30));
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadData() {
        Object[] tiengiorow = { "Tiền Giờ: ", Model.PHONGModel.getGiaPhong(tenphongString), giovaoString + " - " + gioraString, TienGio},
            tongtienrow = { "Tổng Tiền: ", "", "", TongTien };
        tenphong.setText(tenphongString);
        DefaultTableModel tableModel = (DefaultTableModel)tablebillprint.getModel();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        for (Object[] order:Listorder) {
            tableModel.addRow(order);
        }
        tableModel.addRow(tiengiorow);
        tableModel.addRow(tongtienrow);
    }
    
    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        String header = "Bill" + tenphong.getText() + " " + giovaoString;
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName(header);
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.24, 0.24);
                BillPanel.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (PrinterException ex) {
            }
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(BillPrinterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillPrinterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillPrinterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillPrinterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillPrinterForm(tenphongString, giovaoString, gioraString, TienGio, TongTien, Listorder).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillPanel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnprint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablebillprint;
    private javax.swing.JLabel tenphong;
    // End of variables declaration//GEN-END:variables
}
