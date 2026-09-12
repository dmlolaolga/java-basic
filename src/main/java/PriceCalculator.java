import java.util.List;

public class PriceCalculator {
    public static void main(String[] args) {
        List<Double> prices = ProductData.createPrices();
        double budget = 1000;
        double total = 0;
        for (double price : prices) {
            System.out.println("Всего " + total);
            System.out.println("Прибавляем " + price);
            total += price;
        }
        System.out.println("Общая сумма всех товаров " + total);
        System.out.println("Бюджет: " + budget);
        if (budget >= total) {
            System.out.println("Бюджета хватает! Остаток: " + (budget - total));
        } else {
            System.out.println("Бюджета не хватает! Недостаток: " + (total - budget));
        }
    }
}
