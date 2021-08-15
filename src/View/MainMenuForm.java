package View;

import Model.DataModel.SANPHAM;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Trần Kim Tiến Đạt
 */
public class MainMenuForm extends javax.swing.JFrame {
    private static String user = "";
    private static JButton checkButon = null;
    SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat timep = new SimpleDateFormat("HH:mm");
    public MainMenuForm(String userString) {
        user = userString;
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedpane = new javax.swing.JTabbedPane();
        pane0 = new javax.swing.JPanel();
        mp3 = new javax.swing.JButton();
        mp4 = new javax.swing.JButton();
        mp1 = new javax.swing.JButton();
        mp2 = new javax.swing.JButton();
        mp8 = new javax.swing.JButton();
        mp7 = new javax.swing.JButton();
        mp6 = new javax.swing.JButton();
        mp5 = new javax.swing.JButton();
        mp12 = new javax.swing.JButton();
        mp11 = new javax.swing.JButton();
        mp10 = new javax.swing.JButton();
        mp9 = new javax.swing.JButton();
        mp16 = new javax.swing.JButton();
        mp15 = new javax.swing.JButton();
        mp14 = new javax.swing.JButton();
        mp13 = new javax.swing.JButton();
        pane1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameroomlabel = new javax.swing.JLabel();
        checkinlabel = new javax.swing.JLabel();
        checkoutlabel = new javax.swing.JLabel();
        endroombtn = new javax.swing.JButton();
        startbtn = new javax.swing.JButton();
        swroombtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablespdv = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablespdvadded = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        sltxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spdvlabel = new javax.swing.JLabel();
        removebtn = new javax.swing.JButton();
        choosebtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        billbtn = new javax.swing.JButton();
        spdvtxt = new javax.swing.JTextField();
        tienphongtxt = new javax.swing.JTextField();
        phuthutxt = new javax.swing.JTextField();
        discounttxt = new javax.swing.JTextField();
        thanhtoantxt = new javax.swing.JTextField();
        tratruoctxt = new javax.swing.JTextField();
        pane2 = new javax.swing.JScrollPane();
        tabledsbilll = new javax.swing.JTable();
        pane3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablesold = new javax.swing.JTable();
        navbar = new javax.swing.JMenuBar();
        qlykaramenu = new javax.swing.JMenu();
        reopenitem = new javax.swing.JMenuItem();
        locbillitem = new javax.swing.JMenuItem();
        qlykhomenu = new javax.swing.JMenu();
        menusp = new javax.swing.JMenuItem();
        spdv = new javax.swing.JMenuItem();
        qlytkmenu = new javax.swing.JMenu();
        settingmenu = new javax.swing.JMenu();
        settingroomitm = new javax.swing.JMenuItem();
        thoatmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý Karaoke - Team");
        setLocation(new java.awt.Point(180, 50));
        setResizable(false);

        tabbedpane.setBackground(new java.awt.Color(51, 153, 255));
        tabbedpane.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        pane0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mp3.setBackground(java.awt.Color.lightGray);
        mp3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp3.setText("Phòng 3");
        mp3.setMaximumSize(new java.awt.Dimension(100, 30));
        mp3.setPreferredSize(new java.awt.Dimension(90, 25));
        mp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp3ActionPerformed(evt);
            }
        });

        mp4.setBackground(java.awt.Color.lightGray);
        mp4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp4.setText("Phòng 4");
        mp4.setMaximumSize(new java.awt.Dimension(100, 30));
        mp4.setPreferredSize(new java.awt.Dimension(90, 25));
        mp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp4ActionPerformed(evt);
            }
        });

        mp1.setBackground(java.awt.Color.lightGray);
        mp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp1.setText("Phòng 1");
        mp1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mp1.setMaximumSize(new java.awt.Dimension(100, 30));
        mp1.setPreferredSize(new java.awt.Dimension(90, 25));
        mp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp1ActionPerformed(evt);
            }
        });

        mp2.setBackground(java.awt.Color.lightGray);
        mp2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp2.setText("Phòng 2");
        mp2.setMaximumSize(new java.awt.Dimension(100, 30));
        mp2.setPreferredSize(new java.awt.Dimension(90, 25));
        mp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp2ActionPerformed(evt);
            }
        });

        mp8.setBackground(java.awt.Color.lightGray);
        mp8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp8.setText("Phòng 8");
        mp8.setMaximumSize(new java.awt.Dimension(100, 30));
        mp8.setPreferredSize(new java.awt.Dimension(90, 25));

        mp7.setBackground(java.awt.Color.lightGray);
        mp7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp7.setText("Phòng 7");
        mp7.setMaximumSize(new java.awt.Dimension(100, 30));
        mp7.setPreferredSize(new java.awt.Dimension(90, 25));

        mp6.setBackground(java.awt.Color.lightGray);
        mp6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp6.setText("Phòng 6");
        mp6.setMaximumSize(new java.awt.Dimension(100, 30));
        mp6.setPreferredSize(new java.awt.Dimension(90, 25));
        mp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp6ActionPerformed(evt);
            }
        });

        mp5.setBackground(java.awt.Color.lightGray);
        mp5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp5.setText("Phòng 5");
        mp5.setMaximumSize(new java.awt.Dimension(100, 30));
        mp5.setPreferredSize(new java.awt.Dimension(90, 25));
        mp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp5ActionPerformed(evt);
            }
        });

        mp12.setBackground(java.awt.Color.lightGray);
        mp12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp12.setText("Phòng 12");
        mp12.setMaximumSize(new java.awt.Dimension(100, 30));
        mp12.setPreferredSize(new java.awt.Dimension(90, 25));

        mp11.setBackground(java.awt.Color.lightGray);
        mp11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp11.setText("Phòng 11");
        mp11.setMaximumSize(new java.awt.Dimension(100, 30));
        mp11.setPreferredSize(new java.awt.Dimension(90, 25));

        mp10.setBackground(java.awt.Color.lightGray);
        mp10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp10.setText("Phòng 10");
        mp10.setMaximumSize(new java.awt.Dimension(100, 30));
        mp10.setPreferredSize(new java.awt.Dimension(90, 25));

        mp9.setBackground(java.awt.Color.lightGray);
        mp9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp9.setText("Phòng 9");
        mp9.setMaximumSize(new java.awt.Dimension(100, 30));
        mp9.setPreferredSize(new java.awt.Dimension(90, 25));

        mp16.setBackground(java.awt.Color.lightGray);
        mp16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp16.setText("Phòng 16");
        mp16.setMaximumSize(new java.awt.Dimension(100, 30));
        mp16.setPreferredSize(new java.awt.Dimension(90, 25));

        mp15.setBackground(java.awt.Color.lightGray);
        mp15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp15.setText("Phòng 15");
        mp15.setMaximumSize(new java.awt.Dimension(100, 30));
        mp15.setPreferredSize(new java.awt.Dimension(90, 25));

        mp14.setBackground(java.awt.Color.lightGray);
        mp14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp14.setText("Phòng 14");
        mp14.setMaximumSize(new java.awt.Dimension(100, 30));
        mp14.setPreferredSize(new java.awt.Dimension(90, 25));

        mp13.setBackground(java.awt.Color.lightGray);
        mp13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mp13.setText("Phòng 13");
        mp13.setMaximumSize(new java.awt.Dimension(100, 30));
        mp13.setPreferredSize(new java.awt.Dimension(90, 25));

        javax.swing.GroupLayout pane0Layout = new javax.swing.GroupLayout(pane0);
        pane0.setLayout(pane0Layout);
        pane0Layout.setHorizontalGroup(
            pane0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane0Layout.createSequentialGroup()
                        .addComponent(mp1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(mp2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(mp3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(mp4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pane0Layout.createSequentialGroup()
                        .addComponent(mp5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(mp6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(mp7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(mp8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pane0Layout.createSequentialGroup()
                        .addComponent(mp9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(mp10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(mp11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(mp12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pane0Layout.createSequentialGroup()
                        .addComponent(mp13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(mp14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(mp15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(mp16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        pane0Layout.setVerticalGroup(
            pane0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mp1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pane0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mp5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pane0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mp9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pane0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mp13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        tabbedpane.addTab("Quản lý phòng", pane0);

        pane1.setEnabled(false);
        pane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pane1ComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setEnabled(false);

        jLabel1.setText("Nhân viên: ");

        userlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userlabel.setForeground(new java.awt.Color(0, 51, 255));

        jLabel3.setText("Phòng: ");

        jLabel4.setText("Giờ vào:");

        jLabel5.setText("Giờ ra: ");

        nameroomlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        checkinlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        checkoutlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        endroombtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        endroombtn.setForeground(new java.awt.Color(255, 0, 0));
        endroombtn.setText("Kết Thúc");
        endroombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endroombtnActionPerformed(evt);
            }
        });

        startbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startbtn.setForeground(new java.awt.Color(0, 51, 255));
        startbtn.setText("Bắt đầu");
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });

        swroombtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        swroombtn.setForeground(new java.awt.Color(0, 153, 0));
        swroombtn.setText("Chuyển phòng");
        swroombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swroombtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkinlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameroomlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkoutlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(swroombtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endroombtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameroomlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endroombtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(checkinlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(swroombtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(checkoutlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tablespdv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablespdv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sản phẩm dịch vụ", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablespdv.setColumnSelectionAllowed(true);
        tablespdv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablespdvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablespdv);
        tablespdv.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        tablespdvadded.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablespdvadded.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Tên SP", "Đơn Vị", "Giá bán", "Số Lượng", "T. Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablespdvadded.getTableHeader().setReorderingAllowed(false);
        tablespdvadded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablespdvaddedMousePressed(evt);
            }
        });
        tablespdvadded.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tablespdvaddedComponentResized(evt);
            }
        });
        jScrollPane2.setViewportView(tablespdvadded);
        if (tablespdvadded.getColumnModel().getColumnCount() > 0) {
            tablespdvadded.getColumnModel().getColumn(0).setMinWidth(40);
            tablespdvadded.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablespdvadded.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        sltxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sltxtMousePressed(evt);
            }
        });

        jLabel2.setText("SP dịch vụ:");

        spdvlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spdvlabel.setForeground(new java.awt.Color(0, 204, 51));

        removebtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removebtn.setForeground(new java.awt.Color(255, 51, 0));
        removebtn.setText("Bỏ");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });

        choosebtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        choosebtn.setForeground(new java.awt.Color(0, 0, 255));
        choosebtn.setText("Đặt");
        choosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(spdvlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(choosebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spdvlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(choosebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(removebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jLabel6.setText("SP DV: ");

        jLabel7.setText("Tiền phòng: ");

        jLabel8.setText("Phụ thu: ");

        jLabel9.setText("Giảm giá: ");

        jLabel10.setText("Thanh toán: ");

        jLabel11.setText("Trả trước: ");

        billbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        billbtn.setForeground(new java.awt.Color(0, 0, 255));
        billbtn.setText("Xuất bill");
        billbtn.setPreferredSize(new java.awt.Dimension(75, 25));
        billbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billbtnActionPerformed(evt);
            }
        });

        spdvtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spdvtxt.setText("0");
        spdvtxt.setEnabled(false);

        tienphongtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tienphongtxt.setText("0");
        tienphongtxt.setEnabled(false);

        phuthutxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phuthutxt.setText("0");

        discounttxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        discounttxt.setText("0");

        thanhtoantxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thanhtoantxt.setText("0");
        thanhtoantxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        thanhtoantxt.setEnabled(false);

        tratruoctxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tratruoctxt.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phuthutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spdvtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(tienphongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(discounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tratruoctxt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(thanhtoantxt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(billbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(spdvtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tienphongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tratruoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(phuthutxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thanhtoantxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(billbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addGroup(pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedpane.addTab("Chi tiết phòng", pane1);

        pane2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pane2ComponentShown(evt);
            }
        });

        tabledsbilll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabledsbilll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Phòng", "Tiền SP DV", "Tiền phòng", "Phụ thu", "Giảm", "Trả trước", "T. Tiền", "Nhận Phòng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabledsbilll.getTableHeader().setReorderingAllowed(false);
        pane2.setViewportView(tabledsbilll);
        if (tabledsbilll.getColumnModel().getColumnCount() > 0) {
            tabledsbilll.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabledsbilll.getColumnModel().getColumn(3).setPreferredWidth(40);
            tabledsbilll.getColumnModel().getColumn(4).setPreferredWidth(40);
            tabledsbilll.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        tabbedpane.addTab("Danh sách bill", pane2);

        pane3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pane3ComponentShown(evt);
            }
        });

        tablesold.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablesold.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SP dịch vụ đã bán", "Số lượng", "Tổng giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablesold);
        if (tablesold.getColumnModel().getColumnCount() > 0) {
            tablesold.getColumnModel().getColumn(0).setMinWidth(180);
            tablesold.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablesold.getColumnModel().getColumn(0).setMaxWidth(220);
            tablesold.getColumnModel().getColumn(1).setMinWidth(80);
            tablesold.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablesold.getColumnModel().getColumn(1).setMaxWidth(120);
            tablesold.getColumnModel().getColumn(2).setMinWidth(80);
            tablesold.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablesold.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        javax.swing.GroupLayout pane3Layout = new javax.swing.GroupLayout(pane3);
        pane3.setLayout(pane3Layout);
        pane3Layout.setHorizontalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pane3Layout.createSequentialGroup()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 289, Short.MAX_VALUE)))
        );
        pane3Layout.setVerticalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
            .addGroup(pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
        );

        tabbedpane.addTab("SP dịch vụ đã bán", pane3);

        navbar.setBackground(new java.awt.Color(255, 153, 0));
        navbar.setAutoscrolls(true);
        navbar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        navbar.setMargin(new java.awt.Insets(0, 10, 0, 10));

        qlykaramenu.setBackground(new java.awt.Color(255, 153, 0));
        qlykaramenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), null));
        qlykaramenu.setForeground(new java.awt.Color(0, 0, 255));
        qlykaramenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/images/add-list-32.png"))); // NOI18N
        qlykaramenu.setMnemonic('K');
        qlykaramenu.setText("Quản lý Karaoke");
        qlykaramenu.setBorderPainted(true);
        qlykaramenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qlykaramenu.setMargin(new java.awt.Insets(0, 10, 0, 10));

        reopenitem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reopenitem.setText("Mở lại phòng vừa đóng");
        reopenitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reopenitemActionPerformed(evt);
            }
        });
        qlykaramenu.add(reopenitem);

        locbillitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        locbillitem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        locbillitem.setMnemonic('b');
        locbillitem.setText("Lọc bill đơn hàng");
        locbillitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locbillitemActionPerformed(evt);
            }
        });
        qlykaramenu.add(locbillitem);

        navbar.add(qlykaramenu);

        qlykhomenu.setBackground(new java.awt.Color(204, 204, 255));
        qlykhomenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), null));
        qlykhomenu.setForeground(new java.awt.Color(0, 0, 255));
        qlykhomenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/images/cart-59-32.png"))); // NOI18N
        qlykhomenu.setMnemonic('H');
        qlykhomenu.setText("Quản lý Kho hàng");
        qlykhomenu.setBorderPainted(true);
        qlykhomenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qlykhomenu.setMargin(new java.awt.Insets(0, 10, 0, 10));

        menusp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menusp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menusp.setText("SP Dịch vụ");
        menusp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuspActionPerformed(evt);
            }
        });
        qlykhomenu.add(menusp);

        spdv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        spdv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spdv.setText("Lọc SP Dịch vụ");
        spdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spdvActionPerformed(evt);
            }
        });
        qlykhomenu.add(spdv);

        navbar.add(qlykhomenu);

        qlytkmenu.setBackground(new java.awt.Color(204, 204, 255));
        qlytkmenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), null));
        qlytkmenu.setForeground(new java.awt.Color(0, 0, 255));
        qlytkmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/images/edit-user-32.png"))); // NOI18N
        qlytkmenu.setMnemonic('U');
        qlytkmenu.setText("Quản lý Tài khoản");
        qlytkmenu.setBorderPainted(true);
        qlytkmenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qlytkmenu.setMargin(new java.awt.Insets(0, 10, 0, 10));
        qlytkmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                qlytkmenuMousePressed(evt);
            }
        });
        navbar.add(qlytkmenu);

        settingmenu.setBackground(new java.awt.Color(204, 204, 255));
        settingmenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), null));
        settingmenu.setForeground(new java.awt.Color(153, 153, 153));
        settingmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/images/settings-4-32.png"))); // NOI18N
        settingmenu.setText("Cài Đặt");
        settingmenu.setBorderPainted(true);
        settingmenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        settingmenu.setMargin(new java.awt.Insets(0, 10, 0, 10));

        settingroomitm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        settingroomitm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        settingroomitm.setText("Cài đặt giá phòng");
        settingroomitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingroomitmActionPerformed(evt);
            }
        });
        settingmenu.add(settingroomitm);

        navbar.add(settingmenu);

        thoatmenu.setBackground(new java.awt.Color(204, 204, 255));
        thoatmenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), null));
        thoatmenu.setForeground(new java.awt.Color(255, 0, 51));
        thoatmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/images/power-32.png"))); // NOI18N
        thoatmenu.setMnemonic('S');
        thoatmenu.setText("Thoát");
        thoatmenu.setBorderPainted(true);
        thoatmenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        thoatmenu.setMargin(new java.awt.Insets(0, 10, 0, 10));
        thoatmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                thoatmenuMousePressed(evt);
            }
        });
        navbar.add(thoatmenu);

        setJMenuBar(navbar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedpane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static int round(int d, int decimalPlacesRequired) {
        double factor = Math.pow(10, decimalPlacesRequired);
        int result = (int)(Math.round((d * factor)) / factor);
        return result;
    }
        
    private int getTongTien() {
        int tongtien = 0,
            tiensp = Integer.valueOf(spdvtxt.getText()),
            tienphong = Math.round(Float.valueOf(tienphongtxt.getText())),
            phuthu = Integer.valueOf(phuthutxt.getText()),
            giamgia = Integer.valueOf(discounttxt.getText()),
            tratruoc = Integer.valueOf(tratruoctxt.getText());
        tongtien = tiensp + tienphong + phuthu - giamgia - tratruoc;
        return round(tongtien, -3);
    }
    
    public static void displayRoom(String tenphong, JButton f) {
        setButton(true);
        checkButon = f;
        checkButon.setBackground(Color.green);
        // hiện phòng
        Object o[] = Controller.CHITIETPHONGService.displayDetailPhong(tenphong);
        nameroomlabel.setText(tenphong);
        String giovao = String.valueOf(o[0]);
        checkinlabel.setText(giovao);
        checkoutlabel.setText("0 - 0");
        spdvtxt.setText(String.valueOf(o[3]));
        tienphongtxt.setText(String.valueOf(o[2]));
        phuthutxt.setText(String.valueOf(o[4]));
        discounttxt.setText(String.valueOf(o[5]));
        // hiện order
        List<Object[]> listOrder = Controller.CHITIETPHONGService.displayDetailOrder(tenphong);
        if (listOrder != null) {
            DefaultTableModel tableadd = (DefaultTableModel)tablespdvadded.getModel();
            tableadd.setRowCount(0);
            tableadd.getDataVector().removeAllElements();
            tableadd.fireTableDataChanged();
            for (Object[] order:listOrder) {
                int tongtien = ((int) order[2])*((int) order[3]);
                Object orderrow[] = {tablespdvadded.getRowCount()+1, String.valueOf(order[0]), String.valueOf(order[1]),(int) order[2],(int) order[3], tongtien};
                tableadd.addRow(orderrow);
            }
        }
        // hiện sản phẩm
        DefaultTableModel tableModel = (DefaultTableModel)tablespdv.getModel();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        List<SANPHAM> sps = Controller.SANPHAMService.getAllSanPham();
        for (SANPHAM sanpham:sps) {
            Object sp[] = {sanpham.getTenSanPham(), sanpham.getGiaBan()};
            tableModel.addRow(sp);
        } 
    }

    private void roomDetailSelect(String roomname, JButton f) {
        tabbedpane.setSelectedIndex(1);
        nameroomlabel.setText(roomname);
        if (Controller.PHONGService.checkRoomStatus(roomname) == true) {
            checkButon = f;
            checkinlabel.setText("0 - 0");
            checkoutlabel.setText("0 - 0");
            spdvtxt.setText("0");
            tienphongtxt.setText("0");
            phuthutxt.setText("0");
            discounttxt.setText("0");
            setButton(false);
            DefaultTableModel tableModel = (DefaultTableModel)tablespdvadded.getModel();
            tableModel.getDataVector().removeAllElements();
            tableModel.fireTableDataChanged();
        }
        else {
            displayRoom(roomname, f);
        }
    }
    
    private static void setButton(boolean isStart) {
        endroombtn.setEnabled(isStart);
        swroombtn.setEnabled(isStart);
        choosebtn.setEnabled(isStart);
        removebtn.setEnabled(isStart);
        billbtn.setEnabled(isStart);
        startbtn.setEnabled(!isStart);
    }
    
    private boolean checkExistedSP(String sp) {
        boolean existed = false;
        if (tablespdvadded.getRowCount() != 0) {
            for (int i = 0; i < tablespdvadded.getRowCount(); i++) {
                if (String.valueOf(tablespdvadded.getValueAt(i, 1)).equals(sp)) {
                    JOptionPane.showMessageDialog(this, "Sản phẩm đã được thêm. Hãy nhập số lượng.");
                    existed = true;
                    break;
                }
            }
        }
        return existed;
    }
    
    private void reloadTienDV() {
        if (tablespdvadded.getRowCount() != 0) {
            int tienspdv = 0;
            for (int i = 0; i < tablespdvadded.getRowCount(); i++) {
                String sl = String.valueOf(tablespdvadded.getValueAt(i, 4)),
                        gia = String.valueOf(tablespdvadded.getValueAt(i, 3));
                tienspdv += Integer.valueOf(sl)*Integer.valueOf(gia);
            }
            spdvtxt.setText(String.valueOf(tienspdv));
        }
        else {
            spdvtxt.setText("0");
        }
    }
    
    private String setTienPhong() {
        String giotmp = time.format(new Date()), tenphong = nameroomlabel.getText(), giovao = checkinlabel.getText();
        tienphongtxt.setText(String.format("%.1f", Controller.PHONGService.getTienPhong(tenphong, giovao, giotmp)));
        return (date.format(new Date())+ " " + giotmp);
    }
    
    public static void reloadBill(String timefrom, String timeto) {
        DefaultTableModel tableModel = (DefaultTableModel)MainMenuForm.tabledsbilll.getModel();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        for (Object[] bill:Controller.CHITIETPHONGService.getBillbyDate(timefrom, timeto)) {
            tableModel.addRow(bill);
        }
        if (tableModel.getRowCount() != 0) {
            int tienphong = 0, tiendv = 0, tratruoc = 0, phuthu = 0, giamgia = 0, tongtien = 0;
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                tiendv += (int) tableModel.getValueAt(i, 1);
                tienphong += (int) tableModel.getValueAt(i, 2);
                phuthu += (int) (int) tableModel.getValueAt(i, 3);
                giamgia += (int) tableModel.getValueAt(i, 4);
                tratruoc += (int) tableModel.getValueAt(i, 5);
                tongtien += (int) tableModel.getValueAt(i, 6);
            }
            Object[] o = {"Tổng", tiendv, tienphong, phuthu, giamgia, tratruoc, tongtien};
            tableModel.addRow(o);
        }
    }
    private void spdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spdvActionPerformed
        tabbedpane.setSelectedIndex(3);
        LocSanPham f = new LocSanPham();
        f.setVisible(true);
    }//GEN-LAST:event_spdvActionPerformed
    
    private void mp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp1ActionPerformed
        String roomname = mp1.getText();
        roomDetailSelect(roomname, mp1);
    }//GEN-LAST:event_mp1ActionPerformed

    private void mp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp2ActionPerformed
        String roomname = mp2.getText();
        roomDetailSelect(roomname, mp2);
    }//GEN-LAST:event_mp2ActionPerformed

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
        if (!nameroomlabel.getText().equals("")) {
            setButton(true);
            String giovao = date.format(new Date()) + " " + time.format(new Date()), tenphong = nameroomlabel.getText();
            checkinlabel.setText(giovao);
            if (checkButon != null) {
                checkButon.setBackground(Color.green);
            }
            Controller.CHITIETPHONGService.setChiTietPhong(tenphong, false, giovao, giovao, 0, 0, 0, 0, 0);
            DefaultTableModel tableModel = (DefaultTableModel)tablespdv.getModel();
            tableModel.getDataVector().removeAllElements();
            tableModel.fireTableDataChanged();
            List<SANPHAM> sps = Controller.SANPHAMService.getAllSanPham();
            for (SANPHAM sanpham:sps) {
                Object o[] = {sanpham.getTenSanPham(), sanpham.getGiaBan()};
                tableModel.addRow(o);
            }
        }
    }//GEN-LAST:event_startbtnActionPerformed

    private void endroombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endroombtnActionPerformed
        int n = JOptionPane.showConfirmDialog(this,"Phòng sẽ không được lưu?", "Hủy phòng", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            Controller.CHITIETPHONGService.endRoomButton(nameroomlabel.getText(), checkinlabel.getText());
            setButton(false);
            DefaultTableModel tableModel = (DefaultTableModel)tablespdvadded.getModel();
            tableModel.getDataVector().removeAllElements();
            tableModel.fireTableDataChanged();
            checkinlabel.setText("0 - 0");
            checkoutlabel.setText("0 - 0");
            checkButon.setBackground(Color.lightGray);
        }
    }//GEN-LAST:event_endroombtnActionPerformed

    private void thoatmenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoatmenuMousePressed
        int n = JOptionPane.showConfirmDialog(this,"Bạn có chắc chắn muốn thoát?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_thoatmenuMousePressed

    private void sltxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sltxtMousePressed
        NumberForm f = new NumberForm();
        f.setVisible(true);
    }//GEN-LAST:event_sltxtMousePressed

    private void settingroomitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingroomitmActionPerformed
        SetPhongForm f = new SetPhongForm();
        f.setVisible(true);
    }//GEN-LAST:event_settingroomitmActionPerformed

    private void tablespdvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablespdvMouseClicked
        if (evt.getClickCount() == 2) {
            String tensp = String.valueOf(tablespdv.getValueAt(tablespdv.getSelectedRow(), tablespdv.getSelectedColumn()));
            DefaultTableModel tableModel = (DefaultTableModel)tablespdvadded.getModel();
            List<SANPHAM> sps = Controller.SANPHAMService.getAllSanPham();
            for (SANPHAM sp:sps) {
                if (sp.getTenSanPham().equals(tensp) && !checkExistedSP(tensp)) {
                        Object o[] = {tablespdvadded.getRowCount()+1, tensp, sp.getDonVi(), sp.getGiaBan(), 1, sp.getGiaBan()};
                        tableModel.addRow(o);
                }
            }
        }
    }//GEN-LAST:event_tablespdvMouseClicked

    private void choosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtnActionPerformed
        if (tablespdvadded.getRowCount() != 0 && tablespdvadded.getSelectedRow() != -1 && !sltxt.getText().equals("")) {
            tablespdvadded.setValueAt(Integer.valueOf(sltxt.getText()), tablespdvadded.getSelectedRow(), 4);
            int tongtien, gia = (int)tablespdvadded.getValueAt(tablespdvadded.getSelectedRow(), 3),
                soluong = (int)tablespdvadded.getValueAt(tablespdvadded.getSelectedRow(), 4);
            tongtien = gia*soluong;
            tablespdvadded.setValueAt(tongtien, tablespdvadded.getSelectedRow(), 5);
        }
        reloadTienDV();
    }//GEN-LAST:event_choosebtnActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
        if (tablespdvadded.getRowCount() != 0 && tablespdvadded.getRowSelectionAllowed()) {
            DefaultTableModel tableModel = (DefaultTableModel)tablespdvadded.getModel();
            tableModel.removeRow(tablespdvadded.getSelectedRow());
        }
        reloadTienDV();
    }//GEN-LAST:event_removebtnActionPerformed

    private void tablespdvaddedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablespdvaddedMousePressed
        if (tablespdvadded.getRowCount() != 0 && tablespdvadded.getRowSelectionAllowed()) {
            spdvlabel.setText(String.valueOf(tablespdvadded.getValueAt(tablespdvadded.getSelectedRow(), 1)));
        }
    }//GEN-LAST:event_tablespdvaddedMousePressed

    private void tablespdvaddedComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablespdvaddedComponentResized
        reloadTienDV();
    }//GEN-LAST:event_tablespdvaddedComponentResized

    private void pane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pane1ComponentShown
        userlabel.setText(user);
        JTableHeader h1 = tablespdvadded.getTableHeader(),
                h2 = tablespdv.getTableHeader();
        h1.setBackground(Color.CYAN);
        h2.setBackground(Color.CYAN);
        if (!startbtn.isEnabled()) {
            setTienPhong();
            thanhtoantxt.setText(String.valueOf(getTongTien()));
        }
        else setButton(false);
    }//GEN-LAST:event_pane1ComponentShown

    private void billbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billbtnActionPerformed
        String giora = date.format(new Date()) + " " + time.format(new Date()),
            tenphong = nameroomlabel.getText(),
            giovao = checkinlabel.getText(),
                giophutvao = "",
                giophutra = "";
        try {
            giophutra = timep.format(new Date());
            giophutvao = timep.format(timep.parse(giovao.substring(11, 16)));
        } catch (ParseException ex) {
        }
        int tiengio = round(Math.round(Float.valueOf(tienphongtxt.getText())), -3),
            tiendv = Integer.valueOf(spdvtxt.getText()),
            phuthu = Integer.valueOf(phuthutxt.getText()),
            giamgia = Integer.valueOf(discounttxt.getText()),
            tratruoc = Integer.valueOf(tratruoctxt.getText()),
            tongtien = getTongTien(),
            idorder = Controller.CHITIETPHONGService.updateChiTietPhong(tenphong, true, giovao, giora, tiengio, tiendv, phuthu, giamgia, tratruoc);
        HashMap<String, Integer> spdvMap = new HashMap<>();
        List<Object[]> listorder = new ArrayList<>();
        checkoutlabel.setText(setTienPhong());
        thanhtoantxt.setText(String.valueOf(tongtien));
        setButton(false);
        checkButon.setBackground(Color.lightGray);
        for (int i = 0; i < tablespdvadded.getRowCount(); i++) {
            spdvMap.put(String.valueOf(tablespdvadded.getValueAt(i, 1)), (int)tablespdvadded.getValueAt(i, 4));
        }
        Controller.CHITIETORDERService.insertChiTietOrder(idorder, spdvMap);
        
        // In bill đơn hàng
        for (int i = 0; i < tablespdvadded.getRowCount(); i++) {
            Object[] order = {
                tablespdvadded.getValueAt(i, 1),
                tablespdvadded.getValueAt(i, 3),
                tablespdvadded.getValueAt(i, 4),
                tablespdvadded.getValueAt(i, 5),
            };
            listorder.add(order);
        }
        BillPrinterForm f = new BillPrinterForm(tenphong, giophutvao, giophutra, tiendv, phuthu, giamgia, tratruoc, tiengio, tongtien, listorder);
        f.setVisible(true);
    }//GEN-LAST:event_billbtnActionPerformed

    private void menuspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuspActionPerformed
        new ThemSanPhamForm().setVisible(true);
    }//GEN-LAST:event_menuspActionPerformed

    private void locbillitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locbillitemActionPerformed
        LocBillForm f = new LocBillForm();
        f.setVisible(true);
        tabbedpane.setSelectedIndex(2);
    }//GEN-LAST:event_locbillitemActionPerformed

    private void qlytkmenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlytkmenuMousePressed
        RegisterDetailsForm rd = new RegisterDetailsForm(true);
        rd.setVisible(true);
    }//GEN-LAST:event_qlytkmenuMousePressed

    private void reopenitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reopenitemActionPerformed
        ReopenRoomForm f = new ReopenRoomForm(true);
        f.setVisible(true);
    }//GEN-LAST:event_reopenitemActionPerformed

    private void pane2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pane2ComponentShown
        JTableHeader h1 = tabledsbilll.getTableHeader();
        h1.setBackground(Color.CYAN);
        String timeFrom = date.format(new Date()) + " " + "00:00:00",
                timeTo = date.format(new Date()) + " " + time.format(new Date()) + ":00:00";
        reloadBill(timeFrom, timeTo);
    }//GEN-LAST:event_pane2ComponentShown

    private void pane3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pane3ComponentShown
        JTableHeader h1 = tablesold.getTableHeader();
        h1.setBackground(Color.CYAN);
    }//GEN-LAST:event_pane3ComponentShown

    private void swroombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swroombtnActionPerformed
        ReopenRoomForm f = new ReopenRoomForm(false);
        f.setVisible(true);
    }//GEN-LAST:event_swroombtnActionPerformed

    private void mp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp3ActionPerformed
        String roomname = mp3.getText();
        roomDetailSelect(roomname, mp3);
    }//GEN-LAST:event_mp3ActionPerformed

    private void mp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp4ActionPerformed
        String roomname = mp4.getText();
        roomDetailSelect(roomname, mp4);
    }//GEN-LAST:event_mp4ActionPerformed

    private void mp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp5ActionPerformed
        String roomname = mp5.getText();
        roomDetailSelect(roomname, mp5);
    }//GEN-LAST:event_mp5ActionPerformed

    private void mp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp6ActionPerformed
        String roomname = mp6.getText();
        roomDetailSelect(roomname, mp6);
    }//GEN-LAST:event_mp6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton billbtn;
    public static javax.swing.JLabel checkinlabel;
    private static javax.swing.JLabel checkoutlabel;
    private static javax.swing.JButton choosebtn;
    private static javax.swing.JTextField discounttxt;
    private static javax.swing.JButton endroombtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem locbillitem;
    private javax.swing.JMenuItem menusp;
    public static javax.swing.JButton mp1;
    private javax.swing.JButton mp10;
    private javax.swing.JButton mp11;
    private javax.swing.JButton mp12;
    private javax.swing.JButton mp13;
    private javax.swing.JButton mp14;
    private javax.swing.JButton mp15;
    private javax.swing.JButton mp16;
    public static javax.swing.JButton mp2;
    public static javax.swing.JButton mp3;
    public static javax.swing.JButton mp4;
    public static javax.swing.JButton mp5;
    public static javax.swing.JButton mp6;
    public static javax.swing.JButton mp7;
    public static javax.swing.JButton mp8;
    public static javax.swing.JButton mp9;
    public static javax.swing.JLabel nameroomlabel;
    private javax.swing.JMenuBar navbar;
    private javax.swing.JPanel pane0;
    public static javax.swing.JPanel pane1;
    private javax.swing.JScrollPane pane2;
    private javax.swing.JPanel pane3;
    private static javax.swing.JTextField phuthutxt;
    private javax.swing.JMenu qlykaramenu;
    private javax.swing.JMenu qlykhomenu;
    private javax.swing.JMenu qlytkmenu;
    private static javax.swing.JButton removebtn;
    private javax.swing.JMenuItem reopenitem;
    private javax.swing.JMenu settingmenu;
    private javax.swing.JMenuItem settingroomitm;
    public static javax.swing.JTextField sltxt;
    private javax.swing.JMenuItem spdv;
    private javax.swing.JLabel spdvlabel;
    private static javax.swing.JTextField spdvtxt;
    private static javax.swing.JButton startbtn;
    private static javax.swing.JButton swroombtn;
    public static javax.swing.JTabbedPane tabbedpane;
    public static javax.swing.JTable tabledsbilll;
    public static javax.swing.JTable tablesold;
    public static javax.swing.JTable tablespdv;
    public static javax.swing.JTable tablespdvadded;
    private static javax.swing.JTextField thanhtoantxt;
    private javax.swing.JMenu thoatmenu;
    private static javax.swing.JTextField tienphongtxt;
    private static javax.swing.JTextField tratruoctxt;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}