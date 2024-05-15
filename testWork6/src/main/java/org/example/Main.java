package org.example;

public class Main {
    public static void main(String[] args){
        Avto[] avtos = new Avto[9];
        avtos[0] = new Avto("Audi", 2010, "parking1");
        avtos[1] = new Avto("BMW", 2020, "parking1");
        avtos[2] = new Avto("Lada", 2021, "parking3");
        avtos[3] = new Avto("Lexus", 2014, "parking2");
        avtos[4] = new Avto("Lamborgini", 2010, "parking4");
        avtos[5] = new Avto("Fiat", 2023, "parking2");
        avtos[6] = new Avto("Ford", 2022, "parking3");
        avtos[7] = new Avto("Kia", 2018, "parking4");
        avtos[8] = new Avto("Toyota", 2016, "parking3");
        System.out.println(Absolut.find(avtos, 9, 2023));
        System.out.println(Absolut.find(avtos, 9, 2025));
        for (int i = 0; i < 9; i++){
            avtos[i].rdAvto();
        }
    }
}