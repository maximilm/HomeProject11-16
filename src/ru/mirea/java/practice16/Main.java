package ru.mirea.java.practice16;

import ru.mirea.java.practice16.Item.Dish;
import ru.mirea.java.practice16.Item.Drink;
import ru.mirea.java.practice16.order.InternetOrder;
import ru.mirea.java.practice16.order.OrderManager;
import ru.mirea.java.practice16.order.RestaurantOrder;

public class Main {
    public static void main(String[] args) {
        OrderManager k = new OrderManager();
        Dish[] d1 = new Dish[] {new Dish("pervoe", "Вкусная"),
                                new Dish(56,"lecho", "Вкусная"),
                                new Dish(78,"sup", "Вкусная"),
                                new Dish(89,"kartoshka", "Вкусная"),
        };
        RestaurantOrder od1 = new RestaurantOrder(d1);
        k.add(od1,1);
        k.add("1 стол",od1);
        String[] result = k.getOrders(1).dishesNames();
        for (String it: result)
            if (it != null)
            System.out.println(it);
        System.out.println(k.ordersCostSummary());
        System.out.println("-------------HashMap-------------------");
        String[] result2 = k.getOrders("1 стол").dishesNames();
        for (String it: result2)
            if (it != null)
                System.out.println(it);
        System.out.println(k.ordersCostSummary());
        System.out.println("-------------Drink-------------------");
        Drink[] d2 = new Drink[] {new Drink("Cola", "Вкусная"),
                new Drink(50,"Pepsi", "Вкусная"),
                new Drink(50,"Fanta", "Вкусная"),
                new Drink(50,"Shveps", "Вкусная"),
        };
        InternetOrder od2 = new InternetOrder(d2);
        String[] result3 = od2.dishesNames();
        for (String it: result3)
            if (it != null)
                System.out.println(it);
        System.out.println(od2.costTotal());
    }
}
