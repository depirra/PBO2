/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor3;

/**
 *
 * @author Lenovo AMD3020E
 */
public class Bingo {
    String bingo1;
    String bingo2;
    String bingo3;
    String bingo4;
    String bingo5;
    
    public Bingo(String huruf1, String huruf2, String huruf3, String huruf4, String huruf5){
        this.bingo1 = huruf1;
        this.bingo2 = huruf2;
        this.bingo3 = huruf3;
        this.bingo4 = huruf4;
        this.bingo5 = huruf5;  
    }   
        
    public void display(){ 
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(bingo1+ "-" +bingo2+ "-" +bingo3+ "-" +bingo4+ "-" +bingo5);
        System.out.println(bingo1+ "-" +bingo2+ "-" +bingo3+ "-" +bingo4+ "-" +bingo5);
        System.out.println(bingo1+ "-" +bingo2+ "-" +bingo3+ "-" +bingo4+ "-" +bingo5);
        System.out.println("And Bingo was his name-o.");
        System.out.println(" ");
    }
}
