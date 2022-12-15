
package Komposisi;

public class Main {
    public static void main(String[] args){
        
        // Membuat Objek Manusia
        Human RiskyRingo = new Human ("Beat", 2022);
        
        /* Memanggil atribut dan nilai */
        RiskyRingo.brand = "Beat";
        RiskyRingo.powerON();
        RiskyRingo.run();
        RiskyRingo.powerOFF(); 
    } 
}