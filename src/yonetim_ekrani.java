import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays; 
import java.util.stream.IntStream; 
import javax.swing.JTable;

public class yonetim_ekrani extends javax.swing.JFrame {

    public yonetim_ekrani() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_bilet_kes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnl_salon = new javax.swing.JPanel();
        lbl_toplam_tutar = new javax.swing.JLabel();
        lbl_bilet_tipi = new javax.swing.JLabel();
        cmb_bilet_tipi_sec = new javax.swing.JComboBox<>();
        lbl_tutar = new javax.swing.JLabel();
        lbl_seans_saati = new javax.swing.JLabel();
        lbl_film_adi1 = new javax.swing.JLabel();
        lbl_salon_adi = new javax.swing.JLabel();
        txt_film_adi = new javax.swing.JTextField();
        txt_salon_adi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbl_seans_tarihi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_seanslar = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_filmler = new javax.swing.JTable();
        txt_seans_tarih = new javax.swing.JTextField();
        txt_seans_saat = new javax.swing.JTextField();
        lbl_koltuk_sayisi = new javax.swing.JLabel();
        txt_koltuk_sayisi = new javax.swing.JTextField();
        txt_seans_dili = new javax.swing.JTextField();
        txt_goruntu_tipi = new javax.swing.JTextField();
        lbl_panel_salon_adi = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_seans_yazdir = new javax.swing.JButton();
        menu_bar = new javax.swing.JMenuBar();
        menu_film_ekle = new javax.swing.JMenu();
        menu_seans_ekle = new javax.swing.JMenu();
        menu_salon_ekle = new javax.swing.JMenu();
        menu_bilet_fiyat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetim Ekranı");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_bilet_kes.setBackground(new java.awt.Color(255, 153, 0));
        btn_bilet_kes.setText("Bilet Kes");
        btn_bilet_kes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bilet_kesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel1.setText("Bilet Satış Paneli");

        pnl_salon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout pnl_salonLayout = new javax.swing.GroupLayout(pnl_salon);
        pnl_salon.setLayout(pnl_salonLayout);
        pnl_salonLayout.setHorizontalGroup(
            pnl_salonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        pnl_salonLayout.setVerticalGroup(
            pnl_salonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_toplam_tutar.setText("Toplam Tutar:");

        lbl_bilet_tipi.setText("Bilet Tipi:");

        cmb_bilet_tipi_sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tam", "Öğrenci", "Konuk" }));
        cmb_bilet_tipi_sec.setPreferredSize(new java.awt.Dimension(150, 25));
        cmb_bilet_tipi_sec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_bilet_tipi_secİtemStateChanged(evt);
            }
        });

        lbl_tutar.setText("00.00 TL");

        lbl_seans_saati.setText("Seans Saati:");

        lbl_film_adi1.setText("Film adı:");

        lbl_salon_adi.setText("Salon adı:");

        txt_film_adi.setEnabled(false);
        txt_film_adi.setPreferredSize(new java.awt.Dimension(150, 25));

        txt_salon_adi.setEnabled(false);
        txt_salon_adi.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel5.setText("Seans dili:");

        lbl_seans_tarihi.setText("Seans Tarihi:");

        jLabel2.setText("Görüntü tipi:");

        tbl_seanslar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Seans id", "Salon id", "Film id", "Film adı", "Salon adı", "Seans dili", "Görüntü tipi", "Seans tarihi", "Seans saati"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_seanslar.getTableHeader().setReorderingAllowed(false);
        tbl_seanslar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_seanslarMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_seanslar);
        if (tbl_seanslar.getColumnModel().getColumnCount() > 0) {
            tbl_seanslar.getColumnModel().getColumn(0).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_seanslar.getColumnModel().getColumn(1).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(1).setPreferredWidth(5);
            tbl_seanslar.getColumnModel().getColumn(2).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(2).setPreferredWidth(5);
            tbl_seanslar.getColumnModel().getColumn(3).setPreferredWidth(130);
            tbl_seanslar.getColumnModel().getColumn(5).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(5).setPreferredWidth(10);
            tbl_seanslar.getColumnModel().getColumn(6).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(6).setPreferredWidth(5);
            tbl_seanslar.getColumnModel().getColumn(7).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(7).setPreferredWidth(5);
            tbl_seanslar.getColumnModel().getColumn(8).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(8).setPreferredWidth(5);
        }

        tbl_filmler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Film id", "Film Adı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_filmler.getTableHeader().setReorderingAllowed(false);
        tbl_filmler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_filmlerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_filmler);
        if (tbl_filmler.getColumnModel().getColumnCount() > 0) {
            tbl_filmler.getColumnModel().getColumn(0).setResizable(false);
            tbl_filmler.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_filmler.getColumnModel().getColumn(1).setPreferredWidth(450);
        }

        txt_seans_tarih.setEnabled(false);
        txt_seans_tarih.setPreferredSize(new java.awt.Dimension(150, 25));

        txt_seans_saat.setEnabled(false);
        txt_seans_saat.setPreferredSize(new java.awt.Dimension(150, 25));

        lbl_koltuk_sayisi.setText("Koltuk sayısı:");

        txt_koltuk_sayisi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_koltuk_sayisi.setEnabled(false);
        txt_koltuk_sayisi.setPreferredSize(new java.awt.Dimension(150, 25));

        txt_seans_dili.setEnabled(false);
        txt_seans_dili.setPreferredSize(new java.awt.Dimension(150, 25));

        txt_goruntu_tipi.setEnabled(false);
        txt_goruntu_tipi.setPreferredSize(new java.awt.Dimension(150, 25));

        lbl_panel_salon_adi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_panel_salon_adi.setText("Salon adı");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("1");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("2");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("3");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("4");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("5");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("6");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("7");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("8");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("A");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("F");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("E");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("D");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("C");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("B");

        btn_seans_yazdir.setText("Seans Yazdır");
        btn_seans_yazdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seans_yazdirActionPerformed(evt);
            }
        });

        menu_bar.setBackground(new java.awt.Color(255, 255, 255));
        menu_bar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menu_film_ekle.setText("Film Ekle");
        menu_film_ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_film_ekleMouseClicked(evt);
            }
        });
        menu_bar.add(menu_film_ekle);

        menu_seans_ekle.setText("Seans Ekle");
        menu_seans_ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_seans_ekleMouseClicked(evt);
            }
        });
        menu_bar.add(menu_seans_ekle);

        menu_salon_ekle.setText("Salon Ekle");
        menu_salon_ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salon_ekleMouseClicked(evt);
            }
        });
        menu_bar.add(menu_salon_ekle);

        menu_bilet_fiyat.setText("Bilet Fiyat Düzenle");
        menu_bilet_fiyat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_bilet_fiyatMouseClicked(evt);
            }
        });
        menu_bar.add(menu_bilet_fiyat);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_bilet_kes, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_film_adi1)
                                            .addComponent(lbl_salon_adi)
                                            .addComponent(jLabel5)
                                            .addComponent(lbl_seans_tarihi)
                                            .addComponent(jLabel2)
                                            .addComponent(lbl_koltuk_sayisi)
                                            .addComponent(lbl_toplam_tutar)
                                            .addComponent(lbl_bilet_tipi)
                                            .addComponent(lbl_seans_saati, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_film_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_salon_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_seans_dili, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_goruntu_tipi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(lbl_tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_seans_tarih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_seans_saat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmb_bilet_tipi_sec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(txt_koltuk_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(btn_seans_yazdir)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel12)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel13)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addComponent(pnl_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_panel_salon_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel15)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel16)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel18)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel17)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel19)))
                                .addGap(124, 124, 124)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_film_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_film_adi1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_salon_adi)
                            .addComponent(txt_salon_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_seans_dili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_goruntu_tipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_seans_tarihi)
                            .addComponent(txt_seans_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_seans_saati)
                            .addComponent(txt_seans_saat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_bilet_tipi)
                            .addComponent(cmb_bilet_tipi_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_koltuk_sayisi)
                            .addComponent(txt_koltuk_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_toplam_tutar)
                            .addComponent(lbl_tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(btn_bilet_kes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_seans_yazdir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_panel_salon_adi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnl_salon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    baglanti bagla = new baglanti();
    float bilet_tutari;
    int koltuk_sayisi=0;
    int salon_kapasitesi=0;
    boolean koltuk_durumu;
    String secilenKoltuk[] = new String[48];
    
    
    
    //film tablosuna varolan filmleri getirir.
    private void filmVeriGoster(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            Statement st = con.createStatement();
            String query = "select * from tbl_film";
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel tm = (DefaultTableModel)tbl_filmler.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                String o[] = {rs.getString("film_id"),rs.getString("film_ad")};
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    //film tablosundan bir film seçildiğinde seçilen filmin id si döner
    private String filmSatirSec(){
        DefaultTableModel tm = (DefaultTableModel)tbl_filmler.getModel();
        int selectedRowIndex  = tbl_filmler.getSelectedRow();
        txt_film_adi.setText(tm.getValueAt(selectedRowIndex, 1).toString());
        return tm.getValueAt(selectedRowIndex, 0).toString();
    }
    
    
    //seans tablosuna seçilen filmin varolan seanslarını getirir.
    private void seansVeriGoster(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            Statement st = con.createStatement();
            String query = "select * from tbl_seans where film_id ="+filmSatirSec();
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel tm = (DefaultTableModel)tbl_seanslar.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                String o[] = {rs.getString("seans_id"),rs.getString("salon_id"),rs.getString("film_id"), rs.getString("film_ad"),rs.getString("salon_ad"),rs.getString("seans_dili"),
                    rs.getString("goruntu_tipi"),rs.getString("seans_tarihi"),rs.getString("seans_saati")};
                tm.addRow(o);
               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    //seans tablosundan bir seans seçildiğinde seçilen salon id si döner
    private String seansSatirSec(){
        DefaultTableModel tm = (DefaultTableModel)tbl_seanslar.getModel();
        int selectedRowIndex  = tbl_seanslar.getSelectedRow();
        txt_salon_adi.setText(tm.getValueAt(selectedRowIndex, 4).toString());
        txt_seans_dili.setText(tm.getValueAt(selectedRowIndex, 5).toString());
        txt_goruntu_tipi.setText(tm.getValueAt(selectedRowIndex, 6).toString());
        txt_seans_tarih.setText(tm.getValueAt(selectedRowIndex, 7).toString());
        txt_seans_saat.setText(tm.getValueAt(selectedRowIndex, 8).toString());
        //salon id döndürür
        return tm.getValueAt(selectedRowIndex, 1).toString();     
    }
    
    
    //seans tablosundan bir seans seçildiğinde seçilen seans id si döner
    private String seansidGetir(){
        DefaultTableModel tm = (DefaultTableModel)tbl_seanslar.getModel();
        int selectedRowIndex  = tbl_seanslar.getSelectedRow();
        //seans id döndürür
        return tm.getValueAt(selectedRowIndex, 0).toString();     
    }
    
    
    //seçilen bilet tipine göre bilet tablosundan fiyatını çeker
    private void biletFiyatCek(){

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            Statement st = con.createStatement();
            String query = "SELECT bilet_fiyat FROM tbl_bilet where bilet_id ="+(cmb_bilet_tipi_sec.getSelectedIndex()+1);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                bilet_tutari = rs.getFloat("bilet_fiyat") * Integer.parseInt(txt_koltuk_sayisi.getText());
                lbl_tutar.setText(Float.toString(bilet_tutari) +" TL");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //
    private void btn_bilet_kesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bilet_kesActionPerformed
        biletKes();
        pnl_salon.removeAll();
        pnl_salon.repaint();
        pnl_salon.setVisible(true);
        koltukOlustur();
        koltuk_sayisi = 0;
        txt_koltuk_sayisi.setText(Integer.toString(koltuk_sayisi));
        lbl_tutar.setText("0.0 TL");
        JOptionPane.showMessageDialog(null, "Bilet Kesildi");
    }//GEN-LAST:event_btn_bilet_kesActionPerformed

    
    //film ekle menüsüne tıklandığında ilgili pencereyi çağırır
    private void menu_film_ekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_film_ekleMouseClicked
        film_ekle flm = new film_ekle();
        flm.setVisible(true);
    }//GEN-LAST:event_menu_film_ekleMouseClicked

    
    //seans ekle menüsüne tıklandığında ilgili pencereyi çağırır
    private void menu_seans_ekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_seans_ekleMouseClicked
        seans_ekle sns = new seans_ekle();
        sns.setVisible(true);
    }//GEN-LAST:event_menu_seans_ekleMouseClicked
    
    
    //salon ekle menüsüne tıklandığında ilgili pencereyi çağırır
    private void menu_salon_ekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salon_ekleMouseClicked
        salon_ekle sln = new salon_ekle();
        sln.setVisible(true);
    }//GEN-LAST:event_menu_salon_ekleMouseClicked
    
    
    //seans tablosundan bir seans seçildiğinde koltuk seçimi işlemleri için
    //paneli temizler, görünürlüğünü true yapar, seçilen seansa ait salonun
    //kapasitesini bulan fonksiyon çağırılır daha sonra dinamik olarak istenilen
    //sayıda koltuk oluşturulur
    private void tbl_seanslarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_seanslarMouseClicked

        pnl_salon.removeAll();
        pnl_salon.repaint();
        pnl_salon.setVisible(true);
        
        salonKapasitesiCek();
        koltukOlustur();
        
    }//GEN-LAST:event_tbl_seanslarMouseClicked
    
    
    //seçilen filmin seanslarını göstermek için kullanılır
    private void tbl_filmlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_filmlerMouseClicked
        filmSatirSec();
        seansVeriGoster();
    }//GEN-LAST:event_tbl_filmlerMouseClicked
    
    
    //seçilen seansa ait salonun kaç koltuklu olduğunu getirir
    private void salonKapasitesiCek(){
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            Statement st = con.createStatement();
            String query = "SELECT salon_kapasite, salon_ad FROM tbl_salon where salon_id ="+(seansSatirSec());
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                salon_kapasitesi = rs.getInt("salon_kapasite");
                lbl_panel_salon_adi.setText(rs.getString("salon_ad"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //seçilen seansa ait salonun koltuklarını oluşturur ve önceden bilet kesilmiş koltukları seçmeyi engeller
    private void koltukOlustur(){
        
        int sayac =1;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < salon_kapasitesi/8  ; j++) {
                final  JButton btn_koltuk = new JButton(Integer.toString(j));
                pnl_salon.add(btn_koltuk);
                btn_koltuk.setBounds(i*60, j*35, 50, 30);  
                btn_koltuk.setName("btn_"+Integer.toString(sayac));
                
                sayac++;
                
                try{
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection con = DriverManager.getConnection(bagla.url);
                    String query = "insert into tbl_koltuk(seans_id, koltuk_ad)values(?,?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, seansidGetir());
                    pst.setString(2, btn_koltuk.getName());

                    pst.executeUpdate();
            
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                
                koltuk_durumu = koltukDurum(btn_koltuk.getName());
                if (koltuk_durumu == true) {
                    btn_koltuk.setBackground(Color.red);
                    btn_koltuk.setEnabled(false);
                }
                else{
                    btn_koltuk.setBackground(Color.green);
                    setEnabled(true);
                }
                
                btn_koltuk.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    
                    if (btn_koltuk.getBackground() == Color.yellow) {
                        btn_koltuk.setBackground(Color.green);
                        koltuk_sayisi--;
                        for (int k = 0; k < secilenKoltuk.length; k++) {
                            if (secilenKoltuk[k] == btn_koltuk.getName()) {
                                secilenKoltuk[k] = "";
                            }
                        }
                    }
                    else{
                        btn_koltuk.setBackground(Color.yellow);
                        koltuk_sayisi++;
                        secilenKoltuk[koltuk_sayisi-1] = btn_koltuk.getName();
                        
                    }
                    txt_koltuk_sayisi.setText(Integer.toString(koltuk_sayisi));
                    biletFiyatCek();
                }});
            }
        }
    }
    
    //bilet kesilmiş koltukların seçilememesi için koltuk durumunu döndürür
    private boolean koltukDurum(String koltuk_adi){
        boolean durum = true;
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            Statement st = con.createStatement();
            String query = "SELECT koltuk_durum FROM tbl_koltuk where seans_id ="+(seansidGetir())+" and koltuk_ad ='"+(koltuk_adi)+"'";
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            durum = rs.getBoolean("koltuk_durum");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return durum;
    }
    
    //seçilen koltukların tutulduğu dizi for döngüsüne alınarak koltuklar tekrar bilet kesilemez hale getirilir
    private void biletKes(){
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            for (int i = 0; i < secilenKoltuk.length; i++) {
                String query = "update tbl_koltuk set koltuk_durum = 1 WHERE seans_id = ? and koltuk_ad = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, seansidGetir());
                pst.setString(2, secilenKoltuk[i]);

                pst.executeUpdate();
            }

        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //form açıldığı gibi varolan filmlerin içe aktarılması sağlanır
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        filmVeriGoster();
    }//GEN-LAST:event_formWindowOpened

    private void menu_bilet_fiyatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_bilet_fiyatMouseClicked
        fiyat_duzenle fyt = new fiyat_duzenle();
        fyt.setVisible(true);
    }//GEN-LAST:event_menu_bilet_fiyatMouseClicked
    
    //bilet tipi değiştiğinde tutarın hesaplanabilmesi için bilet fiyatı çekilir
    private void cmb_bilet_tipi_secİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_bilet_tipi_secİtemStateChanged
        biletFiyatCek();
    }//GEN-LAST:event_cmb_bilet_tipi_secİtemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        filmVeriGoster();
    }//GEN-LAST:event_formWindowActivated

    private void btn_seans_yazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seans_yazdirActionPerformed
    try{
        raporOlustur excelbas = new raporOlustur(); // Class'în bir nesnesini oluşturduk
        excelbas.fillData(tbl_seanslar, new File("C:\\Users\\yavuz\\OneDrive\\Masaüstü\\seans_tablosu.xls")); // hangi tabloyu basacağımızı ve yolu belirledik.
        JOptionPane.showMessageDialog(null, "seans_tablosu.xls' başarıyla kaydedildi",//Başarılı Mesajı
        "Tablo Oluşturuldu", JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception ex){
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btn_seans_yazdirActionPerformed

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
            java.util.logging.Logger.getLogger(yonetim_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yonetim_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yonetim_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yonetim_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yonetim_ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bilet_kes;
    private javax.swing.JButton btn_seans_yazdir;
    private javax.swing.JComboBox<String> cmb_bilet_tipi_sec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_bilet_tipi;
    private javax.swing.JLabel lbl_film_adi1;
    private javax.swing.JLabel lbl_koltuk_sayisi;
    private javax.swing.JLabel lbl_panel_salon_adi;
    private javax.swing.JLabel lbl_salon_adi;
    private javax.swing.JLabel lbl_seans_saati;
    private javax.swing.JLabel lbl_seans_tarihi;
    private javax.swing.JLabel lbl_toplam_tutar;
    private javax.swing.JLabel lbl_tutar;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenu menu_bilet_fiyat;
    private javax.swing.JMenu menu_film_ekle;
    private javax.swing.JMenu menu_salon_ekle;
    private javax.swing.JMenu menu_seans_ekle;
    public javax.swing.JPanel pnl_salon;
    private javax.swing.JTable tbl_filmler;
    private javax.swing.JTable tbl_seanslar;
    private javax.swing.JTextField txt_film_adi;
    private javax.swing.JTextField txt_goruntu_tipi;
    private javax.swing.JTextField txt_koltuk_sayisi;
    private javax.swing.JTextField txt_salon_adi;
    private javax.swing.JTextField txt_seans_dili;
    private javax.swing.JTextField txt_seans_saat;
    private javax.swing.JTextField txt_seans_tarih;
    // End of variables declaration//GEN-END:variables
}
