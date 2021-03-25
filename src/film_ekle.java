import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class film_ekle extends javax.swing.JFrame {

    public film_ekle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_film_adi = new javax.swing.JLabel();
        txt_film_adi = new javax.swing.JTextField();
        btn_film_ekle = new javax.swing.JButton();
        btn_film_sil = new javax.swing.JButton();
        btn_film_guncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_filmler = new javax.swing.JTable();
        date_vizyon_giris = new com.toedter.calendar.JDateChooser();
        lbl_vizyon_giris = new javax.swing.JLabel();
        lbl_vizyon_bitis = new javax.swing.JLabel();
        date_vizyon_bitis = new com.toedter.calendar.JDateChooser();

        setTitle("Film Ekle");
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_film_adi.setText("Film adı:");

        btn_film_ekle.setText("Ekle");
        btn_film_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_film_ekleActionPerformed(evt);
            }
        });

        btn_film_sil.setText("Sil");
        btn_film_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_film_silActionPerformed(evt);
            }
        });

        btn_film_guncelle.setText("Güncelle");
        btn_film_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_film_guncelleActionPerformed(evt);
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
        if (tbl_filmler.getColumnModel().getColumnCount() > 0) {
            tbl_filmler.getColumnModel().getColumn(0).setResizable(false);
            tbl_filmler.getColumnModel().getColumn(0).setPreferredWidth(15);
            tbl_filmler.getColumnModel().getColumn(1).setPreferredWidth(170);
            tbl_filmler.getColumnModel().getColumn(2).setResizable(false);
            tbl_filmler.getColumnModel().getColumn(3).setResizable(false);
        }

        date_vizyon_giris.setDateFormatString("y-M-d");

        lbl_vizyon_giris.setText("Vizyon Tarihi:");

        lbl_vizyon_bitis.setText("Kapanış Tarihi:");

        date_vizyon_bitis.setDateFormatString("y-M-d");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_vizyon_giris)
                            .addComponent(lbl_vizyon_bitis)
                            .addComponent(lbl_film_adi))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_film_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_film_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_film_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_film_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(date_vizyon_giris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_vizyon_bitis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_film_adi)
                    .addComponent(txt_film_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_vizyon_giris)
                    .addComponent(date_vizyon_giris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_vizyon_bitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_vizyon_bitis))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_film_ekle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_film_sil)
                        .addComponent(btn_film_guncelle)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //veritabanı bağlantısı için nesne oluşturulur
    baglanti bagla = new baglanti();
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        filmVeriGoster();
    }//GEN-LAST:event_formWindowOpened
    
    //Veritabanıyla bağlantı kurularak textboxdaki veriler veritabanına eklenir
    private void filmEkle(){
            try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "insert into tbl_film(film_ad, film_vizyon_giris, film_vizyon_bitis)values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txt_film_adi.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date_giris = sdf.format(date_vizyon_giris.getDate());
            pst.setString(2,date_giris);
            String date_bitis = sdf.format(date_vizyon_bitis.getDate());
            pst.setString(3,date_bitis);

            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Film Eklendi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    //veritabanındaki veriler tabloya çekilir
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
    
    //tabloda seçilen satırı silmeyi sağlar
    private void filmSil(){
            try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "delete from tbl_film where film_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, satirSec());
            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Film Silindi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    //tabloda seçilen satırın bilgilerini günceller
    private void filmGuncelle(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            String query = "update tbl_film set film_ad = ?, film_vizyon_giris = ?, film_vizyon_bitis = ? WHERE film_id = ?";
             
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txt_film_adi.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date_giris = sdf.format(date_vizyon_giris.getDate());
            pst.setString(2,date_giris);
            String date_bitis = sdf.format(date_vizyon_bitis.getDate());
            pst.setString(3,date_bitis);
            pst.setString(4, satirSec());

            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Film Güncellendi!");
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //textboxa filmin adını yazar ve film id yi döndürür
    private String satirSec(){
        DefaultTableModel tm = (DefaultTableModel)tbl_filmler.getModel();
        int selectedRowIndex  = tbl_filmler.getSelectedRow();
        txt_film_adi.setText(tm.getValueAt(selectedRowIndex, 1).toString());
        return tm.getValueAt(selectedRowIndex, 0).toString();
    }    
        
    private void btn_film_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_film_ekleActionPerformed
        filmEkle();
        filmVeriGoster();
    }//GEN-LAST:event_btn_film_ekleActionPerformed

    private void tbl_filmlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_filmlerMouseClicked
        satirSec();
    }//GEN-LAST:event_tbl_filmlerMouseClicked

    private void btn_film_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_film_silActionPerformed
        filmSil();
        filmVeriGoster();
        txt_film_adi.setText("");
    }//GEN-LAST:event_btn_film_silActionPerformed

    private void btn_film_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_film_guncelleActionPerformed
        filmGuncelle();
        filmVeriGoster();
    }//GEN-LAST:event_btn_film_guncelleActionPerformed

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
            java.util.logging.Logger.getLogger(film_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(film_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(film_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(film_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new film_ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_film_ekle;
    private javax.swing.JButton btn_film_guncelle;
    private javax.swing.JButton btn_film_sil;
    private com.toedter.calendar.JDateChooser date_vizyon_bitis;
    private com.toedter.calendar.JDateChooser date_vizyon_giris;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_film_adi;
    private javax.swing.JLabel lbl_vizyon_bitis;
    private javax.swing.JLabel lbl_vizyon_giris;
    private javax.swing.JTable tbl_filmler;
    private javax.swing.JTextField txt_film_adi;
    // End of variables declaration//GEN-END:variables
}
