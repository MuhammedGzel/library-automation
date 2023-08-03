
package Formlar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class kitapGeriVer extends javax.swing.JFrame {

  
    public kitapGeriVer() {
        initComponents();
    }
    public void ara(){
        DbHelper Db=new DbHelper();  Connection connect=null; Statement st=null;
         try{
            connect=Db.getConnection();
            st=connect.createStatement();
            ResultSet rs=st.executeQuery("select *from kitapodunc where Kitap_Kimligi='"+Kitap_Kimligi.getText()+"'and TC_No='"+TC.getText()+"'");
            if(rs.next()){
                Alis_Tarihi.setText(rs.getString(3));
                Verilecek_Tarih.setText(rs.getString(4));
                Kitap_Kimligi.setEditable(false);
                TC.setEditable(false);}
            else{
                JOptionPane.showMessageDialog(null,"Bu öğrenci tarafından ödünç alınan kitap yok.");
                setVisible(false);  new kitapGeriVer().setVisible(true); }}
         catch(Exception e){  JOptionPane.showMessageDialog(null,"Bağlantı hatası");}}
    
    public void kitapGeriVer(){
     DbHelper Db=new DbHelper();
     Connection connect=null;
     PreparedStatement st=null;
     try{
         connect=Db.getConnection();
         String sql="delete  from kitapodunc where Kitap_Kimligi = ?";
         st=connect.prepareStatement(sql);
         ResultSet rs=st.executeQuery("select *from kitapodunc where Kitap_Kimligi='"+Kitap_Kimligi.getText()+"'");
         if(rs.next()){
         st.setString(1,Kitap_Kimligi.getText());
         st.executeUpdate();
         JOptionPane.showMessageDialog(null,"Kitap başarıyla geri verildi.");}
         else{JOptionPane.showMessageDialog(null,"Bu Kitap Kimliğine sahip bir kitap ödünç alınmamış.");}}
        
    catch(Exception e){ JOptionPane.showMessageDialog(null,"Bağlantı hatası"); }  }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kaydet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Kitap_Kimligi = new javax.swing.JTextField();
        TC = new javax.swing.JTextField();
        Ara = new javax.swing.JButton();
        Alis_Tarihi = new javax.swing.JTextField();
        Verilecek_Tarih = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Kaydet.setBackground(new java.awt.Color(255, 255, 255));
        Kaydet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Kaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/icons8-save-30.png"))); // NOI18N
        Kaydet.setText("Kaydet");
        Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaydetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kitap Kimliği");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/icons8-macos-close-30.png"))); // NOI18N
        jButton2.setText("Kapat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Öğrenci TC Kimlik No");

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("  Kitap Geri Verme");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Alış Tarihi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Verilecek Tarih");

        Ara.setBackground(new java.awt.Color(255, 255, 255));
        Ara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/icons8-search-24.png"))); // NOI18N
        Ara.setText("Ara");
        Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
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
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Verilecek_Tarih, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Alis_Tarihi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kitap_Kimligi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ara)))
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
                            .addComponent(TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ara))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Alis_Tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Verilecek_Tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kaydet)
                    .addComponent(jButton2))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaydetActionPerformed
        if(Kitap_Kimligi.getText().length()!=10||TC.getText().length()!=11){
            Kitap_Kimligi.setText("");
            TC.setText("");
            JOptionPane.showMessageDialog(null,"Lütfen Kitap Kimliğini ve Öğrenci TC Kimlik numarasını, doğru şekilde girin.");}
        else{
          try{ DbHelper Db=new DbHelper();
               Connection connect=null;
               PreparedStatement st=null;
               try{ connect=Db.getConnection();
                    String sql="delete  from kitapodunc where Kitap_Kimligi = ?";
                    st=connect.prepareStatement(sql);
                    ResultSet rs=st.executeQuery("select *from kitapodunc where Kitap_Kimligi='"+Kitap_Kimligi.getText()+"'");
                    if(rs.next()){st.setString(1,Kitap_Kimligi.getText());
                                  st.executeUpdate();
                                  JOptionPane.showMessageDialog(null,"Kitap başarıyla geri verildi.");}
                    else{JOptionPane.showMessageDialog(null,"Bu Kitap Kimliğine sahip bir kitap ödünç alınmamış.");}}
               catch(Exception e){ JOptionPane.showMessageDialog(null,"Bağlantı hatası"); } }
         catch(Exception e){} }
    }//GEN-LAST:event_KaydetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Anasayfa().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AraActionPerformed
        if(Kitap_Kimligi.getText().length()!=10||TC.getText().length()!=11){
          Kitap_Kimligi.setText("");
          TC.setText("");
           JOptionPane.showMessageDialog(null,"Lütfen Kitap Kimliğini ve Öğrenci TC Kimlik numarasını, doğru şekilde girin.");}
        else{
            DbHelper Db=new DbHelper();  Connection connect=null; Statement st=null;
         try{
            connect=Db.getConnection();
            st=connect.createStatement();
            ResultSet rs=st.executeQuery("select *from kitapodunc where Kitap_Kimligi='"+Kitap_Kimligi.getText()+"'and TC_No='"+TC.getText()+"'");
            if(rs.next()){
                Alis_Tarihi.setText(rs.getString(3));
                Verilecek_Tarih.setText(rs.getString(4));
                Kitap_Kimligi.setEditable(false);
                TC.setEditable(false);}
            else{
                JOptionPane.showMessageDialog(null,"Bu öğrenci tarafından ödünç alınan kitap yok.");
                setVisible(false);  new kitapGeriVer().setVisible(true); }}
         catch(Exception e){  JOptionPane.showMessageDialog(null,"Bağlantı hatası");}}
        
    }//GEN-LAST:event_AraActionPerformed

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
            java.util.logging.Logger.getLogger(kitapGeriVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kitapGeriVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kitapGeriVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kitapGeriVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitapGeriVer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alis_Tarihi;
    private javax.swing.JButton Ara;
    private javax.swing.JButton Kaydet;
    private javax.swing.JTextField Kitap_Kimligi;
    private javax.swing.JTextField TC;
    private javax.swing.JTextField Verilecek_Tarih;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
