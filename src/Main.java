/**
 * Клас для демонстрації роботи шаблону Singleton і реляційних таблиць.
 */
public class Main {

    /**
     * Основний метод для демонстрації створення бази даних, таблиць і завантаження даних.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        // Отримуємо єдиний екземпляр схеми бази даних
        DatabaseSchema dbSchema = DatabaseSchema.getInstance();

        // Створення таблиць
        dbSchema.createTable("Users");
        dbSchema.createTable("Products");

        // Створення об'єкта таблиці для "Users"
        Table usersTable = new Table("Users");
        // Створення об'єкта таблиці для "Products"
        Table productsTable = new Table("Products");

        // Завантаження даних
        DataLoader dataLoader = new DataLoader();
        dataLoader.loadData(usersTable, "User1, User2, User3");
        dataLoader.loadData(productsTable, "Product1, Product2, Product3");
    }
}