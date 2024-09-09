/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor1dannomor2;

/**
 *
 * @author Lenovo AMD3020E
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
    Matematika mtk = new Matematika();
    
    int pertambahan = mtk.pertambahan(20, 10);
        System.out.println("Pertambahan : 20 + 10 = " +pertambahan);
    int pengurangan = mtk.pengurangan(10, 5);
        System.out.println("Pengurangan : 10 - 5 = " +pengurangan);
    int perkalian = mtk.perkalian(10, 3);
        System.out.println("Perkalian   : 10 * 3 = " +perkalian);
    int pembagian = mtk.pembagian(21, 2);
        System.out.println("Pembagian   : 21 / 2 = " +pembagian);
    }
}
    
