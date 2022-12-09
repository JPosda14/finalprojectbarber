package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.model.Barberq;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminBarberController implements Initializable {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private ObservableList<Barberq> barberqObservableList= FXCollections.observableArrayList();
    private Barberq barberqSelected;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML().loadata();
        barberqObservableList=mfc.getBarbergod().getTransObservList().BarberqObservableList(mfc.getBarbergod().getBarberpService().getListBarberq());
        mfc.getBarbergod().getPrepareColumn().prepareTableBarber(BarberNameColumn,BarberEmailColumn,BarberPasswordColumn,BarberEarningColumn);
        BarberTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            barberqSelected =newSelection;
            mfc.getBarbergod().getShowInputs().showBarberInformation(barberqSelected,BarbernameModify,BarberEmailmodify,BarberPasswordfield,BarberEarningmodify);
        });
        BarberTable.setItems(barberqObservableList);
    }
    @FXML
    private TableView<Barberq> BarberTable;
    @FXML
    private TableColumn<Barberq, Double> BarberEarningColumn;


    @FXML
    private TableColumn<Barberq, String> BarberEmailColumn;
    @FXML
    private TextField BarberEarningmodify;

    @FXML
    private TextField BarberEmailmodify;

    @FXML
    private TableColumn<Barberq, String> BarberNameColumn;

    @FXML
    private TableColumn<Barberq, String> BarberPasswordColumn;

    @FXML
    private TextField BarberPasswordfield;

    @FXML
    private TextField BarbernameModify;

    @FXML
    void BackButton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");

    }

    @FXML
    void BarbersviewButton(ActionEvent event) {

    }

    @FXML
    void ClearButton(ActionEvent event) {
        barberqSelected=null;
        mfc.getBarbergod().getEliminateInputs().eliminatebarberinfo(BarbernameModify,BarberPasswordfield,BarberEmailmodify,BarberEarningmodify);
    }

    @FXML
    void ClientsViewButton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/AdminHomeClient.fxml");

    }

    @FXML
    void CreateButton(ActionEvent event) throws IOException {
        if(mfc.getBarbergod().getDoubleValidator().yesAdm(mfc,BarbernameModify.getText())&& mfc.getBarbergod().getVoidValidator().voidspacevali(mfc,BarbernameModify.getText(),BarberEmailmodify.getText(),BarberPasswordfield.getText()) && mfc.getBarbergod().getEmailValidator().trueEmail(BarberEmailmodify.getText(),mfc)) {
            mfc.makeBarber(BarbernameModify.getText(),BarberEmailmodify.getText(),BarberPasswordfield.getText(), Double.valueOf(BarberEarningmodify.getText()));
            mfc.getBarbergod().getAdjustData().AdjustBarber(barberqObservableList,BarbernameModify,BarberEmailmodify,BarberPasswordfield,BarberEarningmodify,BarberTable);
        }
    }

    @FXML
    void DeleteButton(ActionEvent event) throws IOException {
        if (mfc.getBarbergod().getSelectValidator().truePerson(barberqSelected,mfc)) {
            mfc.eliminateBarber(BarbernameModify.getText(), BarberPasswordfield.getText(), mfc);
            mfc.getBarbergod().getAdjustData().AdjustBarber(barberqObservableList, BarbernameModify, BarberEmailmodify, BarberPasswordfield, BarberEarningmodify, BarberTable);
        }}

}
