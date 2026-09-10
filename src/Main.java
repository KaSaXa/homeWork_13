import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРУЕМ ТОВАРЫ ===");

        // Создаём товары
        Product p1 = new Product(1, "Смартфон", 50000, "Электроника");
        Product p2 = new Product(2, "Наушники", 3000, "Аксессуары");
        Product p3 = new Product(1, "Планшет", 70000, "Электроника");
        Product p4 = new Product(3, "Смартфон", 55000, "Электроника");
        Product p5 = new Product(1, "Смартфон", 50000, "Бытовая техника");

        // Выводим товары
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println("p5: " + p5);

        // Сравниваем товары попарно
        System.out.println("--- Сравнение товаров ---");
        System.out.println("p1.equals(p2) -> " + p1.equals(p2));
        System.out.println("p1.equals(p3) -> " + p1.equals(p3));
        System.out.println("p1.equals(p4) -> " + p1.equals(p4));
        System.out.println("p1.equals(p5) -> " + p1.equals(p5));

        System.out.println("========== ТЕСТИРУЕМ ЗАКАЗЫ ==========");

        // Создаём корзины товаров
        Product[] basket1 = {p1, p2};
        Product[] basket2 = {p1, p2};
        Product[] basket3 = {p2, p1};
        Product[] basket6 = {p1, null};

        // Создаём заказы
        Order order1 = new Order("Александр Хмельницкий", basket1);
        Order order2 = new Order("Александр Хмельницкий", basket2);
        Order order3 = new Order("Антон Клинский", basket3);
        Order order4 = new Order("Евдокия Хрущёва", basket1);
        Order order5 = new Order("Александр Хмельницкий", basket6);

        // Выводим заказы
        System.out.println("order1: " + order1);
        System.out.println("order2: " + order2);
        System.out.println("order3: " + order3);
        System.out.println("order4: " + order4);
        System.out.println("order5: " + order5);

        // Сравниваем заказы попарно
        System.out.println("--- Сравнение заказов ---");
        System.out.println("order1.equals(order2) -> " + order1.equals(order2));
        System.out.println("order1.equals(order3) -> " + order1.equals(order3));
        System.out.println("order1.equals(order4) -> " + order1.equals(order4));
        System.out.println("order1.equals(order5) -> " + order1.equals(order5));
    }

    }