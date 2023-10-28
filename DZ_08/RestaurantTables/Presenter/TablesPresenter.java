package RestaurantTables.Presenter;

import RestaurantTables.Model.TablesModel;
import RestaurantTables.Model.interfaces.ITablesModel;
import RestaurantTables.Presenter.interfaces.ITablePresenter;
import RestaurantTables.View.interfaces.ITablesView;

public class TablesPresenter implements ITablePresenter {
    private final ITablesView view;
    private final ITablesModel model;

    public TablesPresenter(ITablesView view) {
        this.view = view;
        this.model = new TablesModel();
    }

    @Override
    public boolean onTableSelected(int hallNumber, int tableNumber) {
        boolean success = model.bookTable(hallNumber, tableNumber);
        if (success) {
            view.showSuccessMessage("Стол успешно забронирован!");
            updateTablesStatus();
        } else {
            view.showErrorMessage("Столик уже забронирован!");
        }
        return success;
    }

    @Override
    public boolean onTableReleased(int hallNumber, int tableNumber) {
        boolean success = model.releaseTable(hallNumber, tableNumber);
        if (success) {
            view.showSuccessMessage("Стол успешно освободился!");
            updateTablesStatus();
        } else {
            view.showErrorMessage("Столик уже свободен!");
        }
        return success;
    }

    @Override
    public void updateTablesStatus() {
        String[][] tablesStatus = model.getTablesStatus();
        view.showTablesStatus(tablesStatus);
    }

}