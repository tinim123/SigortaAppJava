package view;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import controller.veri;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class User{
private String kullanici_adi;
private String parola;
private String ad;
private String soyad;
private String email;

    public User(String kullanici_adi, String parola, String ad, String soyad, String email) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    


}
public class GirisEkrani extends javax.swing.JFrame {
    private static ArrayList<User> user_list=new ArrayList<User>();

    public static ArrayList<User> getUser_list() {
        return user_list;
    }

    public static void setUser_list(ArrayList<User> user_list) {
        GirisEkrani.user_list = user_list;
    }
    

    /**
     * Creates new form GirisEkrani
     */
    public GirisEkrani() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        giris_butonu = new javax.swing.JButton();
        kullanici_adi_alani = new javax.swing.JTextField();
        cikis_butonu = new javax.swing.JButton();
        kayit_ol = new javax.swing.JButton();
        parola_alani = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GİRİŞ EKRANI");
        setBounds(new java.awt.Rectangle(700, 250, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hoşgeldiniz Lütfen Giriş Yapmak İçin Kullanıcı Adı ve Şifre Giriniz");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kullanıcı Adı : ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Parola : ");

        giris_butonu.setBackground(new java.awt.Color(51, 51, 51));
        giris_butonu.setForeground(new java.awt.Color(255, 255, 255));
        giris_butonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconfinder_Login_73221.png"))); // NOI18N
        giris_butonu.setText("Giriş");
        giris_butonu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        giris_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonuActionPerformed(evt);
            }
        });

        kullanici_adi_alani.setBackground(new java.awt.Color(255, 255, 255));

        cikis_butonu.setBackground(new java.awt.Color(51, 51, 51));
        cikis_butonu.setForeground(new java.awt.Color(255, 255, 255));
        cikis_butonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconfinder_Cancel_close_delete_exit_remove_x_1886551.png"))); // NOI18N
        cikis_butonu.setText("Çıkış");
        cikis_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_butonuActionPerformed(evt);
            }
        });

        kayit_ol.setBackground(new java.awt.Color(51, 51, 51));
        kayit_ol.setForeground(new java.awt.Color(255, 255, 255));
        kayit_ol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconfinder_list-add-user_9381.png"))); // NOI18N
        kayit_ol.setText("Kayıt Ol");
        kayit_ol.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        kayit_ol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_olActionPerformed(evt);
            }
        });

        parola_alani.setBackground(new java.awt.Color(255, 255, 255));
        parola_alani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                parola_alaniKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BİGGANG SİGORTA A.Ş");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(kullanici_adi_alani)
                                            .addComponent(parola_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(giris_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(kayit_ol, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cikis_butonu)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cikis_butonu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayit_ol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giris_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giris_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonuActionPerformed
        try {
            JOptionPane.showMessageDialog(this, "GİRİŞ BAŞARILI DEVAM ETMEK İÇİN OK TUŞUNA BASINIZ...");
            new veri().deneme(this.kullanici_adi_alani.getText(),this.parola_alani.getText(),this);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "HATALI KULLANICI ADI VEYA ŞİFRE");
        }
    }//GEN-LAST:event_giris_butonuActionPerformed

    private void cikis_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_butonuActionPerformed
       JOptionPane.showMessageDialog(this, "Çıkış Yapılıyor, İyi Günler");
       System.exit(0);
    }//GEN-LAST:event_cikis_butonuActionPerformed

    private void kayit_olActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_olActionPerformed
       KayitAlani kayit_alani=new KayitAlani();
       kayit_alani.setVisible(true);
    }//GEN-LAST:event_kayit_olActionPerformed

    private void parola_alaniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parola_alaniKeyPressed
            System.err.println("ok");        // TODO add your handling code here:
    }//GEN-LAST:event_parola_alaniKeyPressed

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis_butonu;
    private javax.swing.JButton giris_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kayit_ol;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables
}
