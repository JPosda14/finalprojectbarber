package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.DTOS.BarberQuoteDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class BarberMyQuotesController implements Initializable {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private ObservableList<BarberQuoteDTO> quoteDTOS= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML();
        mfc.getBarbergod().getTransObservList().barberQuoteDTOS(quoteDTOS,LocalDate.now(),mfc.getBarbergod().getQuoteServiceimpl().getQuotes());
        mfc.getBarbergod().getPrepareColumn().prepareTableBarberQouteDTO(BarberStartColumn,BarberDepaColumn,BarberServiceColumn,BaberClientColumn);
        BarberMyQuotesTable.setItems(quoteDTOS);
    }

    @FXML
    private TableColumn<BarberQuoteDTO, String> BaberClientColumn;

    @FXML
    private TableColumn<BarberQuoteDTO, String> BarberDepaColumn;

    @FXML
    private TableView<BarberQuoteDTO> BarberMyQuotesTable;

    @FXML
    private TableColumn<BarberQuoteDTO, String> BarberServiceColumn;

    @FXML
    private TableColumn<BarberQuoteDTO, String> BarberStartColumn;

    @FXML
    void Backbutton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");


    }

    @FXML
    void MyProfilebarber(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/BarbersMyprofile.fxml");

    }
    @FXML
    void MyQuotesbarber(ActionEvent event) {

    }


}
