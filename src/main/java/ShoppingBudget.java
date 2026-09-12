import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ShoppingBudget {
    public static void main(String[] args) {
        List<Double> prices = ProductData.createPrices();

        double budget = 1300;
        double total = 0;
        int bought = 0;


        while (bought < prices.size() && total + prices.get(bought) <= budget) {
            total += prices.get(bought);
            bought++;
        }
        System.out.println("Куплено: " + bought + " товаров на сумму " + total);
        System.out.printf(Locale.US, "Остаток бюджета: %.2f%n", budget - total);
        System.out.println("Не куплено: " + (prices.size() - bought) + " товара");
    }
}
