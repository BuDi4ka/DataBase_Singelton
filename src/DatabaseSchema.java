/**
 * Клас для представлення схеми бази даних.
 * Реалізує шаблон Singleton, щоб забезпечити створення лише одного екземпляра схеми.
 */
public class DatabaseSchema {
    // Статичне поле для зберігання єдиного екземпляра
    private static DatabaseSchema instance;

    /**
     * Приватний конструктор, щоб запобігти створенню екземпляра поза класом.
     */
    private DatabaseSchema() {}

    /**
     * Статичний метод для отримання єдиного екземпляра схеми бази даних.
     * Якщо екземпляр не існує, він створюється.
     *
     * @return екземпляр класу DatabaseSchema
     */
    public static DatabaseSchema getInstance() {
        if (instance == null) {
            instance = new DatabaseSchema();
        }
        return instance;
    }

    /**
     * Метод для створення таблиці в базі даних.
     *
     * @param tableName ім'я таблиці, яку потрібно створити
     */
    public void createTable(String tableName) {
        System.out.println("Створення таблиці: " + tableName);
        // Логіка створення таблиці
    }
}