/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package UTS;

/**
 *
 * @author WINDOWS 10
 */
public class Transportasi {

    private String nama;
    private String kapasitas;
    
    public Transportasi (String nama, String kapasitas){
        this.nama = nama;
        this.kapasitas = kapasitas;
    
    }
    
    public Transportasi(){
        
    }
    
    public void tampilTransportasi(){
        System.out.println("Alat Transpotasi   = " + nama);
        System.out.println("Kapasitas          = " + kapasitas);
    }
}
