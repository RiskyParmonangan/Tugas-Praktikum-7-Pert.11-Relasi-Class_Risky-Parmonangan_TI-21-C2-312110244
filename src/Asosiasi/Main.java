
package Asosiasi;

public class Main {
    public static void main(String[]args){
        
        Motor Kendaraan = new Motor();
        
        Kendaraan.brand = "Beat";
        Kendaraan.Tahun = 2022;
        
        Human RiskyRingo = new Human();
        
        RiskyRingo.brand = "Beat";
        RiskyRingo.Kendaraan = Kendaraan;
        RiskyRingo.powerON();
        RiskyRingo.run();
        RiskyRingo.powerOFF();
    } 
}