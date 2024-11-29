/**
 * Клас для представлення таблиці в базі даних.
 * Містить методи для додавання даних до таблиці.
 */
public class Table {
    private String tableName;

    /**
     * Конструктор для ініціалізації таблиці з заданим ім'ям.
     *
     * @param tableName ім'я таблиці
     */
    public Table(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Метод для додавання запису в таблицю.
     *
     * @param data дані, які потрібно додати до таблиці
     */
    public void insertData(String data) {
        System.out.println("Додавання даних у таблицю " + tableName + ": " + data);
    }

    /**
     * Отримання імені таблиці.
     *
     * @return ім'я таблиці
     */
    public String getTableName() {
        return tableName;
    }
}