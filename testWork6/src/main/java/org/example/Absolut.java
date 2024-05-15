package org.example;

public abstract class Absolut {

    /**
     * Метод find нужен для поиска автомобиля по году. Он возвращает первый найденный автомобиль.
     *
     * @param t массив в котором ищем значение
     * @param n длинна массива
     * @param year нужный год
     * @return если такой год есть возвращается строка, иначе null
     */
    static String find(Object[] t, int n, int year){
        for (int i = 0; i < n; i++){
            if ( ((Basovi)t[i]).getGod() == year){
                return ((Basovi)t[i]).toString();
            }
        }
        return null;
    };
}
