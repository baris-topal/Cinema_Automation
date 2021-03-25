import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class salon_ekle extends javax.swing.JFrame {

    public salon_ekle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_salon_ad = new javax.swing.JLabel();
        lbl_salon_kapasite = new javax.swing.JLabel();
        txt_salon_adi = new javax.swing.JTextField();
        btn_salon_ekle = new javax.swing.JButton();
        cmb_salon_kapasitesi = new javax.swing.JComboBox<>();
        btn_salon_guncelle = new javax.swing.JButton();
        btn_salon_sil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_salonlar = new javax.swing.JTable();

        setTitle("Salon Ekle");
        setPreferredSize(new java.awt.Dimension(775, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_salon_ad.setText("Salon adı:");

        lbl_salon_kapasite.setText("Salon Kapasitesi:");

        txt_salon_adi.setPreferredSize(new java.awt.Dimension(60, 25));

        btn_salon_ekle.setText("Ekle");
        btn_salon_ekle.setPreferredSize(new java.awt.Dimension(60, 25));
        btn_salon_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salon_ekleActionPerformed(evt);
            }
        });

        cmb_salon_kapasitesi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16", "24", "32", "40", "48" }));
        cmb_salon_kapasitesi.setPreferredSize(new java.awt.Dimension(60, 25));

        btn_salon_guncelle.setText("Güncelle");
        btn_salon_guncelle.setPreferredSize(new java.awt.Dimension(60, 25));
        btn_salon_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salon_guncelleActionPerformed(evt);
            }
        });

        btn_salon_sil.setText("Sil");
        btn_salon_sil.setPreferredSize(new java.awt.Dimension(60, 25));
        btn_salon_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salon_silActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tbl_salonlar);
        if (tbl_salonlar.getColumnModel().getColumnCount() > 0) {
            tbl_salonlar.getColumnModel().getColumn(0).setResizable(false);
            tbl_salonlar.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_salonlar.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_salonlar.getColumnModel().getColumn(2).setResizable(false);
            tbl_salonlar.getColumnModel().getColumn(2).setPreferredWidth(5);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_salon_ad)
                            .addComponent(lbl_salon_kapasite, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_salon_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_salon_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salon_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmb_salon_kapasitesi, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_salon_adi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_salon_adi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_salon_ad))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_salon_kapasite)
                            .addComponent(cmb_salon_kapasitesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salon_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salon_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salon_sil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //veritabanı bağlantısı için nesne oluşturulur
    baglanti bagla = new baglanti();
    
    //bağlantı kurularak varolan salonlar tabloya getirilir
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
    
    //salon tablosunda tıklanan satırın salon ad bilgisini textboxa yazdırır ve geriye salon id döndürür 
    private String satirSec(){
        DefaultTableModel tm = (DefaultTableModel)tbl_salonlar.getModel();
        int selectedRowIndex  = tbl_salonlar.getSelectedRow();
        txt_salon_adi.setText(tm.getValueAt(selectedRowIndex, 1).toString());
        return tm.getValueAt(selectedRowIndex, 0).toString();
    }
    
    //tabloda seçilen satırın bilgilerini günceller
    private void salonGuncelle(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "update tbl_salon set salon_ad = ?, salon_kapasite = ? WHERE salon_id = ?";
             
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txt_salon_adi.getText());
            pst.setString(2, cmb_salon_kapasitesi.getSelectedItem().toString());
            pst.setString(3, satirSec());

            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Salon Güncellendi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    //tabloya textboxdaki verileri çekerek veritabanına ekler
    private void salonEkle(){
            try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "insert into tbl_salon(salon_ad, salon_kapasite)values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txt_salon_adi.getText());
            pst.setString(2, cmb_salon_kapasitesi.getSelectedItem().toString());

            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Salon Eklendi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    //tabloda seçilen satırı silmeyi sağlar
    private void salonSil(){
            try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "delete from tbl_salon where salon_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, satirSec());
            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Salon Silindi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    private void btn_salon_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salon_ekleActionPerformed
        salonEkle();
        salonVeriGoster();
    }//GEN-LAST:event_btn_salon_ekleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        salonVeriGoster();
    }//GEN-LAST:event_formWindowOpened

    private void tbl_salonlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_salonlarMouseClicked
        satirSec();
    }//GEN-LAST:event_tbl_salonlarMouseClicked

    private void btn_salon_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salon_guncelleActionPerformed
        salonGuncelle();
        salonVeriGoster();
    }//GEN-LAST:event_btn_salon_guncelleActionPerformed

    private void btn_salon_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salon_silActionPerformed
        salonSil();
        salonVeriGoster();
    }//GEN-LAST:event_btn_salon_silActionPerformed

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
            java.util.logging.Logger.getLogger(salon_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salon_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salon_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salon_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salon_ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salon_ekle;
    private javax.swing.JButton btn_salon_guncelle;
    private javax.swing.JButton btn_salon_sil;
    private javax.swing.JComboBox<String> cmb_salon_kapasitesi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_salon_ad;
    private javax.swing.JLabel lbl_salon_kapasite;
    private javax.swing.JTable tbl_salonlar;
    private javax.swing.JTextField txt_salon_adi;
    // End of variables declaration//GEN-END:variables
}
