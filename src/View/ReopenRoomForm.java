package View;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Trần Kim Tiến Đạt
 */
public class ReopenRoomForm extends javax.swing.JFrame {

    private static boolean isReopen = true;
    public ReopenRoomForm(boolean status) {
        initComponents();
        isReopen = status;
        if (isReopen) {
            this.setTitle("Mở Lại Phòng Vừa Đóng");
            label.setText("Chọn phòng cần mở lại: ");
            loadCBBRecentRoom();
        }
        else {
            this.setTitle("Chuyển phòng");
            label.setText("Chọn phòng chuyển đến: ");
            loadCBBSwitchRoom();
        }
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        cbbroom = new javax.swing.JComboBox<>();
        btnclose = new javax.swing.JButton();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mở lại phòng vừa đóng");
        setLocation(new java.awt.Point(1050, 150));
        setMaximumSize(new java.awt.Dimension(381, 92));
        setMinimumSize(new java.awt.Dimension(381, 92));
        setResizable(false);

        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Chọn phòng cần mở lại: ");

        btnclose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 0, 0));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        btnok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnok.setForeground(new java.awt.Color(0, 204, 0));
        btnok.setText("Submit");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbbroom, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cbbroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private static JButton roomToButton(String tenphong) {
        JButton f = null;
        switch (tenphong) {
            case "Phòng 1" :
            {
                f = MainMenuForm.mp1;
                break;
            }
            case "Phòng 2" :
            {
                f = MainMenuForm.mp2;
                break;
            }
            case "Phòng 3" :
            {
                f = MainMenuForm.mp3;
                break;
            }
            case "Phòng 4" :
            {
                f = MainMenuForm.mp4;
                break;
            }
            case "Phòng 5" :
            {
                f = MainMenuForm.mp5;
                break;
            }
            case "Phòng 6" :
            {
                f = MainMenuForm.mp6;
                break;
            }
            case "Phòng 7" :
            {
                f = MainMenuForm.mp7;
                break;
            }
            case "Phòng 8" :
            {
                f = MainMenuForm.mp8;
                break;
            }
            case "Phòng 9" :
            {
                f = MainMenuForm.mp9;
                break;
            }
        }
        return f;
    }
    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        String phongdich = String.valueOf(cbbroom.getSelectedItem());
        if (isReopen) {
            Controller.PHONGService.setEmptyRoom(phongdich);
            MainMenuForm.tabbedpane.setSelectedIndex(1);
            MainMenuForm.displayRoom(phongdich, roomToButton(phongdich));
        }
        else {
            String giovao = MainMenuForm.checkinlabel.getText(),
                phongchuyen = MainMenuForm.nameroomlabel.getText();
            roomToButton(phongchuyen).setBackground(Color.lightGray);
            MainMenuForm.nameroomlabel.setText(phongdich);
            Controller.PHONGService.switchRoomButton(phongchuyen, phongdich, giovao);
        }
        this.dispose();
    }//GEN-LAST:event_btnokActionPerformed

    private void loadCBBRecentRoom() {
        cbbroom.removeAllItems();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String today = date.format(new Date());
        for (String name:Controller.PHONGService.getRecentRoom(today)) {
            cbbroom.addItem(name);
        }
    }
    
    private void loadCBBSwitchRoom() {
        cbbroom.removeAllItems();
        for (String name:Controller.PHONGService.getEmptyRoom()) {
            cbbroom.addItem(name);
        }
    }
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
            java.util.logging.Logger.getLogger(ReopenRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReopenRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReopenRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReopenRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReopenRoomForm(isReopen).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox<String> cbbroom;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
