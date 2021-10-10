package ru.mirea.java.practice16;

import java.util.Comparator;

public class Order {
    private final int sizeD = 10;
    private int size = 0;
    private Dish[] dishes = new Dish[sizeD];
    public boolean add(Dish dish) {
        if (size < sizeD) {
            dishes[size-1] = dish;
            size++;
            return true;
        } else return false;

    }
    public boolean remove(String dishName){
        int i = 0;
        while (i < size) {
            if (dishes[i].getName().equals(dishName)) {
                    for (int j = i; j < size-1;j++)
                        dishes[j] = dishes[j+1];
                    dishes[size-1] = null;
                    return true;
            }
            i++;
        }
        return false;
    }
    public int removeAAll(String dishName){
        int i = 0;
        int count = 0;
        while (i < size) {
            if (dishes[i].getName().equals(dishName)) {
                for (int j = i; j < size-1;j++)
                    dishes[j] = dishes[j+1];
                dishes[size-1] = null;
                count++;
            }
            i++;
        }
        return count;
    }
    public int dishQuantity(){
        return size;
    }
    public int dishQuantity(String dishName) {
        int count = 0;
        for (int i = 0;i < size; i++)
            if (dishes[i].getName().equals(dishName))
                count++;
        return count;
    }
    public Dish[] getDishes(){
        return dishes;
    }
    public double costTotal() {
        double count = 0;
        for (int i = 0; i < size; i++)
            count += dishes[i].getPrice();
        return count;
    }
    public String[] dishesNames(){
        String[] ret = new String[10];
        for (int i = 0; i < size;i++)
            ret[i] = dishes[i].getName();
        return ret;
    }
    public Dish[] sortedDishesByCostDesc(){
            for (int out = size - 1; out >= 1; out--)  //Внешний цикл
                for (int in = 0; in < out; in++)    //Внутренний цикл
                    if(dishes[in].getPrice() > dishes[in + 1].getPrice()) {
                        Dish k = dishes[in];
                        dishes[in] = dishes[in+1];
                        dishes[in+1] = k;
                    }
            return dishes;
    }
}
