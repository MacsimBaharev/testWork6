package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Avto extends Basovi implements Intface{

    private String parking;

    Avto(String model, int yaer, String parking){
        super(model, yaer);
        this.parking = parking;
    }

    @Override
    public String toString(){
        return super.toString() + " на парковке: " + parking;
    }

    /**
     * метод rdAvto() сохраняет автомобиль в файл
     */
    @Override
    public void rdAvto() {
        try(FileWriter writer = new FileWriter("Avto.txt", true))
        {
            writer.write(this.toString());
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}