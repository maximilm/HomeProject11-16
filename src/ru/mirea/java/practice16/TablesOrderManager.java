package ru.mirea.java.practice16;

public class TablesOrderManager {
    private Order[] orders = new Order[20];
    public void add(Order order,int tableNumber) {
        orders[tableNumber] = order;
    }

    public Order getOrders(int tableNumber) {
        return orders[tableNumber];
    }
    public void addDish(Dish dish, int tableNumber){

    }
    public void removeOrder(int tableNumber) {
        orders[tableNumber] = null;
    }
    public int freeTableNumber(){
        for (int i = 0; i < 20;i++){
            if (orders[i] == null)
                return i;
        }
    }
    public int[] freeTabelNumbers(){
        int[] a = new int[20];
        int j = 0;
        for (int i = 0; i < 20;i++)
            if (orders[i] == null) {
                a[j] = i;
                j++;
            }
        return a;
    }

    public Order[] getOrders() {
        return orders;
    }
    public double ordersCostSummary() {
        int count = 0;
        for (int i = 0; i < 20; i++)
            count += orders[i].costTotal();
        return count;
    }
    public int dishQuantity(String dishName){
        int count = 0 ;
        for (int i = 0; i < 20; i++)
            count += orders[i].dishQuantity(dishName);
        return count;
    }
}
