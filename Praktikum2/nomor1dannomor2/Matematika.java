/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor1dannomor2;

/**
 *
 * @author Lenovo AMD3020E
 */
public class Matematika implements InterfaceMatematika{
    public int pertambahan (int a, int b){
        int hasil = a + b;
        return hasil;
    }
    
    public int pengurangan (int a, int b){
        int hasil = a - b;
        return hasil;
    }
    
    public int perkalian (int a, int b){
        int hasil = a * b;
        return hasil;
    }
    
    public int pembagian (int a, int b){
        int hasil = a / b;
        return hasil;
    }
}
