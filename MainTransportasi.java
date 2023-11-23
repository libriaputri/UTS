/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author WINDOWS 10
 */
public class MainTransportasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        
        Scanner masuk = new Scanner(System.in);
        System.out.println("=======ALAT TRANSPORTASI=======");
        System.out.println("1. Kereta Api");
        System.out.println("2. Kapal ");
        System.out.println("3. Pesawat");
        System.out.println("4. Keluar Dari Program");
        System.out.println("===============================");
        System.out.print("pilih transportasi : ");
        pilih = masuk.nextInt();
        System.out.println("\n");
        
        KeretaApi KA = new KeretaApi("Kereta Api", "150 Penumpang", "Jalur Darat", "Tenaga Batu Bara");
        Kapal KL = new Kapal("Kapal", "200 Penumpang", "Jalur Laut", "Tenaga Turbin Uap");
        Pesawat PS = new Pesawat("Pesawat", "500 Penumpang", "Jalur udara", "tenaga Avtur");
        
        switch (pilih){
            case 1 :
                System.out.println("KERETA API");
                KA.tampilTransportasi();
                System.out.println("Kereta Api adalah transportasi darat paling nyaman");
                
                break;
            case 2 :
                System.out.println("KAPAL");
                KL.tampilTransportasi();
                System.out.println("Kapal adalah transportasi laut paling nyaman");
                
                break;
            case 3 :
                System.out.println("PESAWAT");
                PS.tampilTransportasi();
                System.out.println("Pesawat adalah transportasi udara tyang paling nyaman");
                
                break;
            case 4 :
                JOptionPane.showMessageDialog(null, "ANDA TELAH KELUAR DARI PROGRAM",
                        "Keluar Program", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                
                break;
                
            default:
                System.out.println("MAAF PILIHAN ANDA TIDAK TERCANTUM");
        }
    }
    
}
