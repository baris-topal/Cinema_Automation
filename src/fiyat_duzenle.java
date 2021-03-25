import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fiyat_duzenle extends javax.swing.JFrame {

    public fiyat_duzenle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_bilet_fiyat = new javax.swing.JTextField();
        lbl_bilet_tipi = new javax.swing.JLabel();
        cmb_bilet_tipi_sec = new javax.swing.JComboBox<>();
        btn_bilet_guncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_biletler = new javax.swing.JTable();

        setTitle("Bilet Fiyat");
        setPreferredSize(new java.awt.Dimension(500, 220));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Bilet fiyat:");

        lbl_bilet_tipi.setText("Bilet Tipi:");

        cmb_bilet_tipi_sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tam", "Öğrenci", "Konuk" }));

        btn_bilet_guncelle.setText("Güncelle");
        btn_bilet_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bilet_guncelleActionPerformed(evt);
            }
        });

        tbl_biletler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bilet id", "Bilet tip", "Bilet fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_biletler.getTableHeader().setReorderingAllowed(false);
        tbl_biletler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_biletlerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_biletler);
        if (tbl_biletler.getColumnModel().getColumnCount() > 0) {
            tbl_biletler.getColumnModel().getColumn(0).setResizable(false);
            tbl_biletler.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_biletler.getColumnModel().getColumn(1).setResizable(false);
            tbl_biletler.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbl_biletler.getColumnModel().getColumn(2).setResizable(false);
            tbl_biletler.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lbl_bilet_tipi))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_bilet_tipi_sec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_bilet_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_bilet_guncelle)
                        .addGap(54, 54, 54)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_bilet_tipi)
                            .addComponent(cmb_bilet_tipi_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_bilet_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_bilet_guncelle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    baglanti bagla = new baglanti();
    
    private void biletVeriGoster(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(bagla.url);
            Statement st = con.createStatement();
            String query = "SELECT * FROM tbl_bilet";
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel tm = (DefaultTableModel)tbl_biletler.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
               //System.out.println(rs.getString(1));
                String o[] = {rs.getString("bilet_id"),rs.getString("bilet_tip"),rs.getString("bilet_fiyat")};
                tm.addRow(o);
               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private String biletsatirSec(){
        DefaultTableModel tm = (DefaultTableModel)tbl_biletler.getModel();
        int selectedRowIndex  = tbl_biletler.getSelectedRow();
        cmb_bilet_tipi_sec.setSelectedItem(tm.getValueAt(selectedRowIndex, 1).toString());
        txt_bilet_fiyat.setText(tm.getValueAt(selectedRowIndex, 2).toString());
        return tm.getValueAt(selectedRowIndex, 0).toString();
    }
    
// tabloya textboxdaki verileri çekerek veritabanına ekler
//    private void biletEkle(){
//            try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            Connection con = DriverManager.getConnection(bagla.url);
//            String query = "insert into tbl_bilet(bilet_tip, bilet_fiyat)values(?,?)";
//            PreparedStatement pst = con.prepareStatement(query);
//            pst.setString(1, cmb_bilet_tipi_sec.getSelectedItem().toString());
//            pst.setString(2, String.valueOf(blt.getFiyat()));
//
//            pst.executeUpdate();
//         
//            JOptionPane.showMessageDialog(null, "Salon Eklendi!");
//        }
//         catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }   
//    }
    
    private void biletGuncelle(){
        String tmp_bilet_tip = cmb_bilet_tipi_sec.getSelectedItem().toString();
        
        if (tmp_bilet_tip == "Konuk") {
            bilet_konuk blt = new bilet_konuk();
            blt.setFiyat(Float.valueOf(txt_bilet_fiyat.getText()));
            
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(bagla.url);
                String query = "update tbl_bilet set bilet_tip = ?, bilet_fiyat = ? WHERE bilet_id = ?";
             
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, cmb_bilet_tipi_sec.getSelectedItem().toString());
                pst.setString(2, String.valueOf(blt.getFiyat()));  
                pst.setString(3, biletsatirSec());

                pst.executeUpdate();
         
                JOptionPane.showMessageDialog(null, "Bilet Güncellendi!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        else{
            bilet_musteri blt = new bilet_musteri();
            blt.setFiyat(Float.valueOf(txt_bilet_fiyat.getText()));
                        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(bagla.url);
                String query = "update tbl_bilet set bilet_tip = ?, bilet_fiyat = ? WHERE bilet_id = ?";
             
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, cmb_bilet_tipi_sec.getSelectedItem().toString());
                pst.setString(2, String.valueOf(blt.getFiyat()));  
                pst.setString(3, biletsatirSec());

                pst.executeUpdate();
         
                JOptionPane.showMessageDialog(null, "Bilet Güncellendi!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        

    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        biletVeriGoster();
    }//GEN-LAST:event_formWindowOpened

    private void tbl_biletlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_biletlerMouseClicked
        biletsatirSec();
    }//GEN-LAST:event_tbl_biletlerMouseClicked

    private void btn_bilet_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bilet_guncelleActionPerformed
        biletGuncelle();
        biletVeriGoster();
    }//GEN-LAST:event_btn_bilet_guncelleActionPerformed


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
            java.util.logging.Logger.getLogger(fiyat_duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fiyat_duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fiyat_duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fiyat_duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fiyat_duzenle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bilet_guncelle;
    private javax.swing.JComboBox<String> cmb_bilet_tipi_sec;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_bilet_tipi;
    private javax.swing.JTable tbl_biletler;
    private javax.swing.JTextField txt_bilet_fiyat;
    // End of variables declaration//GEN-END:variables
}
