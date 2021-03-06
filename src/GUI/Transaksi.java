/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.Config;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author
 */
public class Transaksi extends javax.swing.JFrame {
    public boolean tambah_data;
    public Statement st;
    public ResultSet rs;
    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();
        setLocationRelativeTo(this);
        getData();
        tampil_combo();
    }
    
    public void Transaksi(){
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul_brg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_id_transaksi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_jumlah_beli = new javax.swing.JTextField();
        txt_jumlah_bayar = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtb_transaksi = new javax.swing.JTable();
        cb_idBarang = new javax.swing.JComboBox<>();
        jTgl_transaksi = new com.toedter.calendar.JDateChooser();
        btn_back = new javax.swing.JButton();
        txt_nama_barang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judul_brg.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        judul_brg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul_brg.setText("Data Transaksi");
        judul_brg.setToolTipText("");
        judul_brg.setDoubleBuffered(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        txt_id_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_transaksiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Transaksi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jumlah Beli");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id Barang");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Transaksi");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jumlah Bayar");

        txt_jumlah_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlah_beliActionPerformed(evt);
            }
        });

        txt_jumlah_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlah_bayarActionPerformed(evt);
            }
        });

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jtb_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtb_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_transaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtb_transaksi);

        cb_idBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        cb_idBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_idBarangActionPerformed(evt);
            }
        });

        btn_back.setText("< Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        txt_nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_barangActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Barang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_idBarang, javax.swing.GroupLayout.Alignment.TRAILING, 0, 240, Short.MAX_VALUE)
                                    .addComponent(txt_id_transaksi, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_jumlah_beli)
                                    .addComponent(txt_jumlah_bayar)
                                    .addComponent(jTgl_transaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txt_nama_barang, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(225, 225, 225))
                    .addComponent(jScrollPane2)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_idBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTgl_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_jumlah_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_jumlah_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        txt_id_transaksi.getAccessibleContext().setAccessibleParent(txt_id_transaksi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(judul_brg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judul_brg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_jumlah_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlah_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlah_bayarActionPerformed

    private void txt_jumlah_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlah_beliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlah_beliActionPerformed

    private void txt_id_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_transaksiActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String formattgl = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(formattgl);
        String tgl = String.valueOf(fm.format(jTgl_transaksi.getDate()));
        
        try{
            Connection conn = Config.getKoneksi();
            PreparedStatement stmt = conn.prepareStatement("insert into tb_transaksi(id_transaksi, id_barang, nama_barang, tgl_transaksi, jumlah_beli, jumlah_bayar) values(?,?,?,?,?,?)");
            stmt.setString(1, txt_id_transaksi.getText());
            stmt.setString(2, (String) cb_idBarang.getSelectedItem());
            stmt.setString(3, txt_nama_barang.getText());
            stmt.setString(4, tgl);
            stmt.setString(5, txt_jumlah_beli.getText());
            stmt.setString(6, txt_jumlah_bayar.getText());
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            stmt.execute();
            getData();
            
                // mengosongkan textbox
                tambah_data=true;
                txt_id_transaksi.setText("");
                txt_jumlah_bayar.setText("");
                txt_nama_barang.setText("");
                jTgl_transaksi.setDateFormatString(tgl);
                txt_jumlah_beli.setText("");
                cb_idBarang.setSelectedItem("--Pilih--");
        } catch (SQLException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void txt_nama_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_barangActionPerformed

    private void jtb_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_transaksiMouseClicked
           
        int baris = jtb_transaksi.getSelectedRow();
        
        txt_id_transaksi.setText(jtb_transaksi.getValueAt(baris, 0).toString());
        cb_idBarang.setSelectedItem(jtb_transaksi.getValueAt(baris, 1).toString());
        txt_nama_barang.setText(jtb_transaksi.getValueAt(baris, 2).toString());
        jTgl_transaksi.setDateFormatString(jtb_transaksi.getValueAt(baris, 3).toString());
        txt_jumlah_beli.setText(jtb_transaksi.getValueAt(baris, 4).toString());
        txt_jumlah_bayar.setText(jtb_transaksi.getValueAt(baris, 5).toString());
    }//GEN-LAST:event_jtb_transaksiMouseClicked

    private void cb_idBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_idBarangActionPerformed
        // TODO add your handling code here:
        
        tampil();
    }//GEN-LAST:event_cb_idBarangActionPerformed
     
    
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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cb_idBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jTgl_transaksi;
    private javax.swing.JTable jtb_transaksi;
    private javax.swing.JLabel judul_brg;
    private javax.swing.JTextField txt_id_transaksi;
    private javax.swing.JTextField txt_jumlah_bayar;
    private javax.swing.JTextField txt_jumlah_beli;
    private javax.swing.JTextField txt_nama_barang;
    // End of variables declaration//GEN-END:variables

    private void tgl(String toString) {
        String formattgl = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(formattgl);
        String tgl = String.valueOf(fm.format(jTgl_transaksi.getDate()));
    }
    
    private void getData() {
    // TODO add your handling code here:
        DefaultTableModel Dftb_transaksi = new DefaultTableModel();
        Dftb_transaksi.addColumn("Id Transaksi");
        Dftb_transaksi.addColumn("Id Barang");
        Dftb_transaksi.addColumn("Nama Barang");
        Dftb_transaksi.addColumn("Tanggal Transaksi");
        Dftb_transaksi.addColumn("Jumlah Beli");
        Dftb_transaksi.addColumn("Jumlah Bayar");
        
        jtb_transaksi.setModel(Dftb_transaksi);
        Connection conn = Config.getKoneksi();
        try {
            java.sql.Statement stmt = conn.createStatement();
            String SQL = "select * from tb_transaksi";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                Dftb_transaksi.addRow(new Object[]{
                    res.getString("id_transaksi"),
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("tgl_transaksi"),
                    res.getString("jumlah_beli"),
                    res.getString("jumlah_bayar")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void tampil_combo(){
        try {
        Connection conn = Database.Config.getKoneksi();
        Statement stmt = conn.createStatement();
        String sql = "select * from tb_barang";  
        ResultSet res = stmt.executeQuery(sql);
        
        while(res.next()){
            cb_idBarang.addItem(res.getString("id_barang"));
            Object[] ob = new Object[3];
            ob[0] = res.getString(1);
        }
            res.last();
            int jumlahdata = res.getRow();
            res.first();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }
    
     public void tampil()
    {
        try {
        Connection conn = Database.Config.getKoneksi();
        Statement stmt = conn.createStatement();
        String sql = "select nama_barang from tb_barang where id_barang='"+cb_idBarang.getSelectedItem()+"'";  
        ResultSet res = stmt.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[1];
            ob[0]=  res.getString(1);
            
            txt_nama_barang.setText((String) ob[0]);
        }
        res.close(); stmt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }
}
