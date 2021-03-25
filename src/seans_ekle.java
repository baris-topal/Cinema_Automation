import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class seans_ekle extends javax.swing.JFrame {


    public seans_ekle() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_filmler = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_salonlar = new javax.swing.JTable();
        lbl_film_adi = new javax.swing.JLabel();
        lbl_salon_adi = new javax.swing.JLabel();
        txt_film_adi = new javax.swing.JTextField();
        txt_salon_adi = new javax.swing.JTextField();
        lbl_seans_tarihi = new javax.swing.JLabel();
        date_seans_tarihi = new com.toedter.calendar.JDateChooser();
        lbl_seans_saati = new javax.swing.JLabel();
        cmb_seans_saat = new javax.swing.JComboBox<>();
        cmb_seans_dakika = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_seanslar = new javax.swing.JTable();
        btn_seans_ekle = new javax.swing.JButton();
        btn_seans_sil = new javax.swing.JButton();
        btn_seans_guncelle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_seans_dili = new javax.swing.JComboBox<>();
        cmb_goruntu_tipi = new javax.swing.JComboBox<>();

        setTitle("Seans Ekle");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbl_filmler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Film id", "Film Adı", "Vizyon Tarihi", "Bitiş Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        tbl_salonlar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salon id", "Salon ad", "Salon kapasite"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_salonlar.getTableHeader().setReorderingAllowed(false);
        tbl_salonlar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_salonlarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_salonlar);
        if (tbl_salonlar.getColumnModel().getColumnCount() > 0) {
            tbl_salonlar.getColumnModel().getColumn(0).setResizable(false);
            tbl_salonlar.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_salonlar.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_salonlar.getColumnModel().getColumn(2).setResizable(false);
            tbl_salonlar.getColumnModel().getColumn(2).setPreferredWidth(5);
        }

        lbl_film_adi.setText("Film adı:");

        lbl_salon_adi.setText("Salon adı:");

        txt_film_adi.setEnabled(false);

        txt_salon_adi.setEnabled(false);

        lbl_seans_tarihi.setText("Seans Tarihi:");

        date_seans_tarihi.setDateFormatString("d-M-y");

        lbl_seans_saati.setText("Seans Saati:");

        cmb_seans_saat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        cmb_seans_dakika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));

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
            tbl_seanslar.getColumnModel().getColumn(3).setMinWidth(100);
            tbl_seanslar.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbl_seanslar.getColumnModel().getColumn(4).setPreferredWidth(10);
            tbl_seanslar.getColumnModel().getColumn(5).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(6).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(7).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(7).setPreferredWidth(5);
            tbl_seanslar.getColumnModel().getColumn(8).setResizable(false);
            tbl_seanslar.getColumnModel().getColumn(8).setPreferredWidth(5);
        }

        btn_seans_ekle.setText("Ekle");
        btn_seans_ekle.setPreferredSize(new java.awt.Dimension(75, 25));
        btn_seans_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seans_ekleActionPerformed(evt);
            }
        });

        btn_seans_sil.setText("Sil");
        btn_seans_sil.setPreferredSize(new java.awt.Dimension(75, 25));
        btn_seans_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seans_silActionPerformed(evt);
            }
        });

        btn_seans_guncelle.setText("Güncelle");
        btn_seans_guncelle.setPreferredSize(new java.awt.Dimension(75, 25));
        btn_seans_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seans_guncelleActionPerformed(evt);
            }
        });

        jLabel1.setText("Seans dili:");

        jLabel2.setText("Görüntü tipi:");

        cmb_seans_dili.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Türkçe Dublaj", "İngilizce Altyazı" }));

        cmb_goruntu_tipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2D", "3D" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_film_adi)
                                        .addComponent(lbl_salon_adi))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_film_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_salon_adi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(lbl_seans_tarihi))
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmb_seans_dili, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmb_goruntu_tipi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(date_seans_tarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btn_seans_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_seans_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_seans_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_seans_saati, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(cmb_seans_saat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_seans_dakika, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_film_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_film_adi))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_salon_adi)
                            .addComponent(txt_salon_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmb_seans_dili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmb_goruntu_tipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date_seans_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_seans_tarihi))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_seans_saati)
                            .addComponent(cmb_seans_saat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_seans_dakika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_seans_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_seans_sil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_seans_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //bağlantı için nesne oluşturuyoruz
    baglanti bagla = new baglanti();
    
    
    //veritabanından verileri çekilir ve tabloya dökülür
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
               //System.out.println(rs.getString(1));
                String o[] = {rs.getString("film_id"),rs.getString("film_ad"),rs.getString("film_vizyon_giris"),rs.getString("film_vizyon_bitis")};
                tm.addRow(o);
               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //seçilen satırın verileri textboxa yazılır ve film id döndürülür
    private String filmSatirSec(){
        DefaultTableModel tm = (DefaultTableModel)tbl_filmler.getModel();
        int selectedRowIndex  = tbl_filmler.getSelectedRow();
        txt_film_adi.setText(tm.getValueAt(selectedRowIndex, 1).toString());
        //System.out.println(tm.getValueAt(selectedRowIndex, 0).toString());
        return tm.getValueAt(selectedRowIndex, 0).toString();
    }   
    
    //veritabanında varolan salonları getirir
    private void salonVeriGoster(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            Statement st = con.createStatement();
            String query = "SELECT * FROM tbl_salon";
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel tm = (DefaultTableModel)tbl_salonlar.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
               //System.out.println(rs.getString(1));
                String o[] = {rs.getString("salon_id"),rs.getString("salon_ad"),rs.getString("salon_kapasite")};
                tm.addRow(o);
               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //seçilen satırın adini textboxa yazdırır ve salon id döndürür
    private String salonSatirSec(){
        DefaultTableModel tm = (DefaultTableModel)tbl_salonlar.getModel();
        int selectedRowIndex  = tbl_salonlar.getSelectedRow();
        txt_salon_adi.setText(tm.getValueAt(selectedRowIndex, 1).toString());
        return tm.getValueAt(selectedRowIndex, 0).toString();
    }
    
    //film tablosunda seçilen satırın varolan seanslarını gösterir
    private void seansVeriGoster(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            Statement st = con.createStatement();
            String query = "select * from tbl_seans where film_id= "+filmSatirSec();
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel tm = (DefaultTableModel)tbl_seanslar.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
               //System.out.println(rs.getString(1));
                String o[] = {rs.getString("seans_id"),rs.getString("salon_id"),rs.getString("film_id"), rs.getString("film_ad"),rs.getString("salon_ad"),rs.getString("seans_dili"),
                    rs.getString("goruntu_tipi"),rs.getString("seans_tarihi"),rs.getString("seans_saati")};
                tm.addRow(o);
               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
    //textboxa girilen verileri çekerek veritabanına ekler
    private void seansEkle(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "insert into tbl_seans(film_id, film_ad, salon_ad, seans_dili, goruntu_tipi, seans_tarihi, seans_saati, salon_id)values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, filmSatirSec());
            pst.setString(2, txt_film_adi.getText());
            pst.setString(3, txt_salon_adi.getText());
            pst.setString(4, cmb_seans_dili.getSelectedItem().toString());
            pst.setString(5, cmb_goruntu_tipi.getSelectedItem().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date_giris = sdf.format(date_seans_tarihi.getDate());
            pst.setString(6,date_giris);
            pst.setString(7, (cmb_seans_saat.getSelectedItem().toString() + ":" + cmb_seans_dakika.getSelectedItem().toString()));
            pst.setString(8, salonSatirSec());
            
            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Seans Eklendi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    //seans tablosunda seçilen satırın verilerini textboxa yazar ve seans id döndürür 
    private String seansSatirSec(){
        DefaultTableModel tm = (DefaultTableModel)tbl_seanslar.getModel();
        int selectedRowIndex  = tbl_seanslar.getSelectedRow();
        txt_film_adi.setText(tm.getValueAt(selectedRowIndex, 3).toString());
        txt_salon_adi.setText(tm.getValueAt(selectedRowIndex, 4).toString());
        cmb_seans_dili.setSelectedItem(tm.getValueAt(selectedRowIndex, 5).toString());
        cmb_goruntu_tipi.setSelectedItem(tm.getValueAt(selectedRowIndex, 6).toString());
        return tm.getValueAt(selectedRowIndex, 0).toString();
        
    }
    
    //seçilen seansı siler
    private void seansSil(){
            try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "delete from tbl_seans where seans_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, seansSatirSec());
            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Seans Silindi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }
        
    //textboxdan verileri çekerek seansı günceller  
    private void seansGuncelle(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "update tbl_seans set film_ad = ?, salon_ad = ?, seans_dili = ?,"
                    + "goruntu_tipi = ?, seans_tarihi = ?, seans_saati = ?, salon_id = ? where seans_id = ?";
             
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txt_film_adi.getText());
            pst.setString(2, txt_salon_adi.getText());
            pst.setString(3, cmb_seans_dili.getSelectedItem().toString());
            pst.setString(4, cmb_goruntu_tipi.getSelectedItem().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date_giris = sdf.format(date_seans_tarihi.getDate());
            pst.setString(5,date_giris);
            pst.setString(6, (cmb_seans_saat.getSelectedItem().toString() + ":" + cmb_seans_dakika.getSelectedItem().toString()));
            pst.setString(7, salonSatirSec());
            pst.setString(8, seansSatirSec());

            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Seans Güncellendi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
      
    private void tbl_filmlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_filmlerMouseClicked
        filmSatirSec();
        seansVeriGoster();
    }//GEN-LAST:event_tbl_filmlerMouseClicked

    private void tbl_salonlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_salonlarMouseClicked
        salonSatirSec();
    }//GEN-LAST:event_tbl_salonlarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        salonVeriGoster();
        filmVeriGoster();
    }//GEN-LAST:event_formWindowOpened

    private void btn_seans_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seans_ekleActionPerformed
        seansEkle();
        seansVeriGoster();
    }//GEN-LAST:event_btn_seans_ekleActionPerformed

    private void tbl_seanslarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_seanslarMouseClicked
        seansSatirSec();
    }//GEN-LAST:event_tbl_seanslarMouseClicked

    private void btn_seans_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seans_silActionPerformed
        seansSil();
        seansVeriGoster();
    }//GEN-LAST:event_btn_seans_silActionPerformed

    private void btn_seans_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seans_guncelleActionPerformed
        seansGuncelle();
        seansVeriGoster();
    }//GEN-LAST:event_btn_seans_guncelleActionPerformed

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
            java.util.logging.Logger.getLogger(seans_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seans_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seans_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seans_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seans_ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_seans_ekle;
    private javax.swing.JButton btn_seans_guncelle;
    private javax.swing.JButton btn_seans_sil;
    private javax.swing.JComboBox<String> cmb_goruntu_tipi;
    private javax.swing.JComboBox<String> cmb_seans_dakika;
    private javax.swing.JComboBox<String> cmb_seans_dili;
    private javax.swing.JComboBox<String> cmb_seans_saat;
    private com.toedter.calendar.JDateChooser date_seans_tarihi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_film_adi;
    private javax.swing.JLabel lbl_salon_adi;
    private javax.swing.JLabel lbl_seans_saati;
    private javax.swing.JLabel lbl_seans_tarihi;
    private javax.swing.JTable tbl_filmler;
    private javax.swing.JTable tbl_salonlar;
    private javax.swing.JTable tbl_seanslar;
    private javax.swing.JTextField txt_film_adi;
    private javax.swing.JTextField txt_salon_adi;
    // End of variables declaration//GEN-END:variables
}
