/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectquiz1_3070;

/**
 *
 * @TOlkhah Muzaqqi Arrasyi_21103070
 */
public class Penduduk_3070 {
    protected String nik;
    protected String nama;
    protected int umur;
    protected String alamat;
    
    public Penduduk_3070(){
        this.nik = nik;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public double totalPendapatan(){
        return 0;
    }
    
    public void tampilDataPenduduk(){
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Umur : "+ umur);
        System.out.println("Alamat : "+ alamat);
    }
}