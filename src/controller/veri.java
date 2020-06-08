/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.GirisEkrani;

/**
 *
 * @author Hasan
 */
public class veri {
    
public void deneme(String kadi, String sifre, JFrame form) throws SQLException{

    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sigorta", "root", "hasan1994");
        PreparedStatement Statement = con.prepareStatement("Select * from kullanici where kadi='" + kadi + "' and sifre='" + sifre + "'");
        ResultSet res = Statement.executeQuery();
        res.last();
        int kayitSayisi=res.getRow();
        if(kayitSayisi==0){System.out.println("kayıt bulunamadi...");}
        else{
        new view.HesapAlani(res.getObject("kadi").toString(),res.getObject("adi").toString(),res.getObject("soyadi").toString(),res.getObject("email").toString()).setVisible(true);
         form.dispose();
         System.gc();
        }
        while (res.next()) {
            System.out.println(res.getObject("kadi").toString() + " " + res.getObject("sifre").toString());
        }
    } catch (Exception e) {
        System.out.println("hata");
    }
}


public void kaydet(String kadi, String sifre, String adi, String soyadi, String email, JFrame kayitForm ) throws SQLException{

    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sigorta", "root", "hasan1994");
        PreparedStatement Statement = con.prepareStatement("Select * from kullanici where kadi='" + kadi + "' and sifre='" + sifre + "'");
        ResultSet res = Statement.executeQuery();
        res.last();
        int kayitSayisi=res.getRow();
        if(kayitSayisi==0){
            String q="insert into kullanici(kadi,sifre,adi,soyadi,email) values('"+kadi+"','"+sifre+"','"+adi+"','"+soyadi+"','"+email+"')";
        PreparedStatement Statement1 = con.prepareStatement(q);
        Statement1.execute();
        JOptionPane.showMessageDialog(null, "KAYIT BAŞARILI");
        kayitForm.dispose();
        }else{
          JOptionPane.showMessageDialog(null, "BÖYLE BİR KAYIT MEVCUT");

        }

    } catch (Exception e) {
        System.out.println("hataaa");
    }
}


}
