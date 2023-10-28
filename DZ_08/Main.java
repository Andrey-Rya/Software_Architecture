import RestaurantTables.Presenter.TablesPresenter;
import RestaurantTables.Presenter.interfaces.ITablePresenter;
import RestaurantTables.View.ConsoleTablesView;
import RestaurantTables.View.interfaces.ITablesView;

public class Main {
    public static void main(String[] args) {
        ITablesView view = new ConsoleTablesView();
        ITablePresenter presenter = new TablesPresenter(view);

        boolean exit = false;
        while (!exit) {
            presenter.updateTablesStatus();
            int option = view.selectOption();

            switch (option) {
                case 1 -> {
                    int hallNumber = view.selectHall();
                    int tableNumber = view.selectTable();
                    boolean success = presenter.onTableSelected(hallNumber, tableNumber);
                    if (success) {
                        System.out.println("Стол успешно забронирован!");
                    } else {
                        System.out.println("Столик уже забронирован!");
                    }
                }
                // освобождения столика
                case 2 -> {
                    int hallNumber = view.selectHall();
                    int tableNumber = view.selectTable();
                    boolean success = presenter.onTableReleased(hallNumber, tableNumber);
                    if (success) {
                        System.out.println("Столик успешно освобожден!");
                    } else {
                        System.out.println("Столик уже свободен!");
                    }
                }
                case 0 -> {
                    exit = true;
                    System.out.println("Выход из программы.");
                }
                default -> System.out.println("Неверный вариант. Попробуйте еще раз.");
            }
        }
    }

}
