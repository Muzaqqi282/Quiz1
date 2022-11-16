/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectquiz1_3070;

/**
 *
 * @author ASUS
 */
public class Dokter_3070 extends Penduduk_3070 {
    int jmlPasien;
    int jmlObat;
    double totalPendapatanDokter;
    
    public Dokter_3070(){
        this.jmlPasien = jmlPasien;
        this.jmlObat = jmlObat;
    }
    
    public double totalPendapatan(){
        totalPendapatanDokter = (jmlPasien * 50000) + (jmlObat * 10000);  
        return totalPendapatanDokter;  
    }
    
    public void DataDokter(){
        super.tampilDataPenduduk();
        System.out.println("Jumlah Pasien : " + jmlPasien);
        System.out.println("Jumlah Obat : " + jmlObat);
        System.out.println("Total pendapatan dokter : Rp " + totalPendapatan());
    }
    
     
}

