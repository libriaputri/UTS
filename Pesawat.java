/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author WINDOWS 10
 */
public class Pesawat extends Transportasi{
    private String jalur, penggerak;
    
    public Pesawat (String nama, String kapasitas, String jalur, String penggerak){
        super(nama, kapasitas);
        this.jalur = jalur;
        this.penggerak = penggerak;
    }
    
    public Pesawat (String jalur, String penggerak){
        this.jalur = jalur;
        this.penggerak = penggerak;
    }
    
    @Override
    public void tampilTransportasi(){
        super.tampilTransportasi();
        System.out.println("Jalur Transportasi = " + jalur);
        System.out.println("Alat Penggerak     = " + penggerak);
    }
}
