/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor3;

/**
 *
 * @author Lenovo AMD3020E
 */
public class BingoBeraksi {
    public static void main(String[] args){
        Bingo versi1 = new Bingo("B","I","N","G","O");
            versi1.display();
        Bingo versi2 = new Bingo ("(clap)","I","N","G","O");
            versi2.display();
        Bingo versi3 = new Bingo ("(clap)","(clap)","N","G","O");
            versi3.display();
        Bingo versi4 = new Bingo ("(clap)","(clap)","(clap)","G","O");
            versi4.display();
        Bingo versi5 = new Bingo ("(clap)","(clap)","(clap)","(clap)","O");
            versi5.display();
        Bingo versi6 = new Bingo ("(clap)","(clap)","(clap)","(clap)","(clap)");
            versi6.display();
    }
}
