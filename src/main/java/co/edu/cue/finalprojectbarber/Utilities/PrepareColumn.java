package co.edu.cue.finalprojectbarber.Utilities;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrepareColumn {
    public void prepareTableBarber(TableColumn tableName,TableColumn tableEmail,TableColumn tablePassword, TableColumn tableEarning){
        tableName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tablePassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        tableEarning.setCellValueFactory(new PropertyValueFactory<>("earning"));
    }

    public void prepareTableClient(TableColumn tableName,TableColumn tableEmail,TableColumn tablePassword,TableColumn tableNumber){
        tableName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tablePassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        tableNumber.setCellValueFactory(new PropertyValueFactory<>("number"));
    }

    public void prepareTableClientQouteDTO(TableColumn startTime,TableColumn endTime, TableColumn nameCut, TableColumn nameBarber) {
        startTime.setCellValueFactory(new PropertyValueFactory<>("beginHour"));
        endTime.setCellValueFactory(new PropertyValueFactory<>("endHour"));
        nameCut.setCellValueFactory(new PropertyValueFactory<>("nameCut"));
        nameBarber.setCellValueFactory(new PropertyValueFactory<>("nameBarber"));

    }
    public void prepareTableBarberQouteDTO(TableColumn startTime,TableColumn endTime, TableColumn nameCut, TableColumn nameClient) {
        startTime.setCellValueFactory(new PropertyValueFactory<>("beginHour"));
        endTime.setCellValueFactory(new PropertyValueFactory<>("endHour"));
        nameCut.setCellValueFactory(new PropertyValueFactory<>("nameCut"));
        nameClient.setCellValueFactory(new PropertyValueFactory<>("nameClient"));

    }
    public void freshtable(ObservableList observableList, TableView tableView){
        tableView.setItems(observableList);
        tableView.refresh();
    }
}
