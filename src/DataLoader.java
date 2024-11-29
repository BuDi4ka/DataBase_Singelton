/**
 * Клас для завантаження даних у таблицю.
 * Використовується для додавання даних до реляційних таблиць.
 */
public class DataLoader {

    /**
     * Метод для завантаження даних у таблицю.
     *
     * @param table таблиця, в яку потрібно завантажити дані
     * @param data дані, які потрібно завантажити в таблицю
     */
    public void loadData(Table table, String data) {
        System.out.println("Завантаження даних у таблицю: " + table.getTableName());
        table.insertData(data);
    }
}