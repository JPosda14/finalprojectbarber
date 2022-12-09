package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.model.Barberq;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BarberProfileController implements Initializable {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private ObservableList<Barberq> barberqObservableList= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML().loadata();
        barberqObservableList=mfc.getBarbergod().getTransObservList().BarberqObservableList(mfc.getBarbergod().getBarberpService().getListBarberq());
        mfc.getBarbergod().getPrepareColumn().prepareTableBarber(BarberNameColumn,BarberEmailColumn,BarberPasswordColumn,BarberEarningsColumn);
        BarberProfileTable.setItems(barberqObservableList);
    }


    @FXML
    private TableColumn<Barberq, String> BarberPasswordColumn;

    @FXML
    private TableColumn<Barberq, String> BarberEarningsColumn;

    @FXML
    private TableColumn<Barberq, String> BarberEmailColumn;

    @FXML
    private TableColumn<Barberq, String> BarberNameColumn;

    @FXML
    private TableView<Barberq> BarberProfileTable;

    @FXML
    void Backbutton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");

    }


    @FXML
    void MyQuotesbarber(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/BarbersMyQuotes.fxml");

    }
    @FXML
    void MyProfilebarber(ActionEvent event) {

    }



}
