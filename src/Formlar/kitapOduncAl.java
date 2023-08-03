
package Formlar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class kitapOduncAl extends javax.swing.JFrame {

 
    public kitapOduncAl() {
        initComponents();
    }
        public void oduncKitapEkle() throws SQLException{
        SimpleDateFormat df=new  SimpleDateFormat("dd-MM-yyyy");
        DbHelper Db=new DbHelper();
        Connection connect=null;
        PreparedStatement st=null;
        try{
          connect=Db.getConnection();
          st=connect.prepareStatement("insert into kutuphane.kitapodunc values(?,?,?,?)");
          ResultSet rsKitapVarmi=st.executeQuery("select *from kitaplar where Kitap_Kimligi='"+Kitap_Kimligi.getText()+"'"); 
          if(rsKitapVarmi.next()){
             ResultSet rsOgrenciVarmı=st.executeQuery("select *from ogrenciler where TC='"+TC.getText()+"'"); 
             if(rsOgrenciVarmı.next()){
             st.setString(1,Kitap_Kimligi.getText()); 
             st.setString(2,TC.getText()); //TC
             st.setString(3,df.format(Alis_Tarihi.getDate()));
             st.setString(4,df.format(Verilecek_Tarih.getDate()));
             st.execute();
             JOptionPane.showMessageDialog(null,"Kitap ödünç verme işlemi başarıyla gerçekleşti.");
             Kitap_Kimligi.setText("");
             TC.setText("");}
            else {JOptionPane.showMessageDialog(null,"Bu bilgilere sahip bir öğrenci bulunamadı. ");}}
            else{
                  JOptionPane.showMessageDialog(null,"Bu bilgilere sahip bir kitap bulunamadı. ");}
            connect.close();}
        catch(SQLException ex){
          Db.ShowError(ex);
          JOptionPane.showMessageDialog(null,"Bir hata oluştu");
          new kitapOduncAl().setVisible(true); }}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Kitap_Kimligi = new javax.swing.JTextField();
        TC = new javax.swing.JTextField();
        Alis_Tarihi = new com.toedter.calendar.JDateChooser();
        Verilecek_Tarih = new com.toedter.calendar.JDateChooser();
        Kaydet = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kitap Kimliği");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Öğrenci TC Kimlik No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Alış Tarihi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Verilecek Tarih");

        Kaydet.setBackground(new java.awt.Color(255, 255, 255));
        Kaydet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Kaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/icons8-save-30.png"))); // NOI18N
        Kaydet.setText("Kaydet");
        Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaydetActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/icons8-macos-close-30.png"))); // NOI18N
        jButton2.setText("Kapat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Kitap Ödünç Verme");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Kitap_Kimligi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TC, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Alis_Tarihi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Verilecek_Tarih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kitap_Kimligi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(Alis_Tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Verilecek_Tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kaydet)
                    .addComponent(jButton2))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Anasayfa().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaydetActionPerformed
      if(Kitap_Kimligi.getText().length()!=10||TC.getText().length()!=11){
          Kitap_Kimligi.setText("");
          TC.setText("");
          JOptionPane.showMessageDialog(null,"Lütfen Kitap Kimliğini ve Öğrenci TC Kimlik numarasını, doğru şekilde girin.");}
      else{
        SimpleDateFormat df=new  SimpleDateFormat("dd-MM-yyyy");
        DbHelper Db=new DbHelper();
        Connection connect=null;
        PreparedStatement st=null;
        try{
          connect=Db.getConnection();
          st=connect.prepareStatement("insert into kutuphane.kitapodunc values(?,?,?,?)");
          ResultSet rsKitapVarmi=st.executeQuery("select *from kitaplar where Kitap_Kimligi='"+Kitap_Kimligi.getText()+"'"); 
          if(rsKitapVarmi.next()){
             ResultSet rsOgrenciVarmı=st.executeQuery("select *from ogrenciler where TC='"+TC.getText()+"'"); 
             if(rsOgrenciVarmı.next()){
             st.setString(1,Kitap_Kimligi.getText()); 
             st.setString(2,TC.getText()); //TC
             st.setString(3,df.format(Alis_Tarihi.getDate()));
             st.setString(4,df.format(Verilecek_Tarih.getDate()));
             st.execute();
             JOptionPane.showMessageDialog(null,"Kitap ödünç verme işlemi başarıyla gerçekleşti.");
             Kitap_Kimligi.setText("");
             TC.setText("");}
          else {JOptionPane.showMessageDialog(null,"Bu bilgilere sahip bir öğrenci bulunamadı. ");}
          }
          else{JOptionPane.showMessageDialog(null,"Bu bilgilere sahip bir kitap bulunamadı. ");}
            connect.close();}
       catch(SQLException ex){
          Db.ShowError(ex);
          JOptionPane.showMessageDialog(null,"Bir hata oluştu");
          new kitapOduncAl().setVisible(true); } }
    }//GEN-LAST:event_KaydetActionPerformed

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
            java.util.logging.Logger.getLogger(kitapOduncAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kitapOduncAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kitapOduncAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kitapOduncAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitapOduncAl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Alis_Tarihi;
    private javax.swing.JButton Kaydet;
    private javax.swing.JTextField Kitap_Kimligi;
    private javax.swing.JTextField TC;
    private com.toedter.calendar.JDateChooser Verilecek_Tarih;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
