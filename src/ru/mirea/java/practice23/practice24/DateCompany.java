package ru.mirea.java.practice23.practice24;

import java.util.HashMap;
import java.util.Map;

public class DateCompany {
    private double expenses = 0; // общее количество расходов
    private double income = 0; // общее количество доходов
    private Map<String, Double> expensesAllComp = new HashMap<String, Double>(); // y каждой компании свои расходы

    public void newDateCompany(String str) {

        String[] stroka = str.split(",", 8);
        double dohod = Double.parseDouble(stroka[6].replaceAll("\\\"", "").replace(',', '.'));
        double rashod = Double.parseDouble(stroka[7].replaceAll("\\\"", "").replace(',', '.')); // некоторые данные имеют вид "129,56", нужно избавиться от ковычек и , превратить в .
        this.expenses += rashod;
        this.income += dohod;

        String[] s = stroka[5].trim().split(" {3,}")[1].split("/"); //выделение основной части, разделение елси больше 3 или больше 3 пробелов, так же 1 делит по / и кладет в s
        String[] strokaCompany = s[s.length - 1].split("\\\\"); // основная часть всегда последняя, с проверкой на \
        String company = strokaCompany[strokaCompany.length - 1]; //достаем название компании

        if (!expensesAllComp.containsKey(company)) { // если компании до этого не было, добавляем
            expensesAllComp.put(company, rashod);

        } else {
            double sum = expensesAllComp.get(company);
            sum += rashod;
            expensesAllComp.put(company, sum);
        }

    }

    public void outResult() {
        System.out.println("Сумма доходов:" + this.income + " rub");
        System.out.println("Сумма расходов " + this.expenses + " rub");
        System.out.println("Расходы по компаниям: ");

        for (String company : this.expensesAllComp.keySet()) {

            System.out.println(company + ": " + this.expensesAllComp.get(company) + "руб");

        }


    }
}
