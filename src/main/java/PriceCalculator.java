import java.util.List;
import java.util.Locale;

public class PriceCalculator {
    public static void main(String[] args) {
        List<Double> prices = ProductData.createPrices();
        double budget = 1200;
        double total = 0;
        for (double price : prices) {
            System.out.println("Всего " + total);
            System.out.println("Прибавляем " + price);
            total += price;
        }
        System.out.printf(Locale.US, "Общая сумма всех товаров %.2f%n", total);
        System.out.println("Бюджет: " + budget);
        if (budget >= total) {
            System.out.println("Бюджета хватает! Остаток:" + (budget - total));
        } else {
            System.out.printf(Locale.US, "Бюджета не хватает! Недостаток: %.2f%n", total - budget);
        }
    }
}
