package RestaurantTables.View;

import RestaurantTables.View.interfaces.ITablesView;

import java.util.Scanner;

public class ConsoleTablesView implements ITablesView {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void showTablesStatus(String[][] tablesStatus) {
        System.out.println("\nСтатус заказа столов:");
        System.out.println("-----------------------");
        System.out.println("Зал 1:");
        System.out.println("Стол 1: " + tablesStatus[0][0]);
        System.out.println("Стол 2: " + tablesStatus[0][1]);
        System.out.println("Стол 3: " + tablesStatus[0][2]);
        System.out.println("Зал 2:");
        System.out.println("Стол 1: " + tablesStatus[1][0]);
        System.out.println("Стол 2: " + tablesStatus[1][1]);
        System.out.println("Стол 3: " + tablesStatus[1][2]);
    }

    @Override
    public void showSuccessMessage(String message) {
        System.out.println("\nУСПЕШНО: " + message);
    }

    @Override
    public void showErrorMessage(String message) {
        System.out.println("\nОШИБКА: " + message);
    }

    @Override
    public int selectHall() {
        System.out.println("\nВыберите зал (1 - для курящих, 2 - для некурящих):");
        int hallNumber = scanner.nextInt();
        while (hallNumber != 1 && hallNumber != 2) {
            System.out.println("Неверный номер зала. Попробуйте еще раз:");
            hallNumber = scanner.nextInt();
        }
        return hallNumber;
    }

    @Override
    public int selectTable() {
        System.out.println("\nВыберите номер столика (1 - 3):");
        int tableNumber = scanner.nextInt();
        while (tableNumber < 1 || tableNumber > 3) {
            System.out.println("Неверный номер столика. Попробуйте еще раз:");
            tableNumber = scanner.nextInt();
        }
        return tableNumber;
    }

    @Override
    public int selectOption() {
        System.out.println("\nВыберите вариант:");
        System.out.println("1. Забронировать столик");
        System.out.println("2. Освободить столик");
        System.out.println("0. Выход");
        int option = scanner.nextInt();
        while (option < 0 || option > 2) {
            System.out.println("Неверный вариант. Попробуйте еще раз:");
            option = scanner.nextInt();
        }
        return option;
    }
}
