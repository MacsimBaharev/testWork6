package org.example;

public class Basovi extends Absolut{
    private String model;

    private int god;

    Basovi(String model, int god){
        this.model = model;
        this.god = god;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) throws WrongYearException {
        if (god > 2024 || god < 1885) {
            this.god = god;
        }
        else {
            throw new WrongYearException("Wrong year");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws WrongModelException {
        if (model != null || model.equals("")) {
            this.model = model;
        }
        else {
            throw new WrongModelException("Wrong model");
        }
    }


    /**
     * Метод toString()
     *
     * @return возвращает строку вида "Модель: ####, #### года"
     */
    @Override
    public String toString(){
        return "Модель: " + model + ", " + god + " года";
    }
}

/**
 * класс WrongYearException
 */
class WrongYearException extends Exception{
    public WrongYearException(String message){
        super(message);
    }
}

/**
 * класс WrongModelException
 */
class WrongModelException extends Exception{
    public WrongModelException(String massage) {super(massage);}
}