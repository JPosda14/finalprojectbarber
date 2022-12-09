package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.DTOS.BarberQuoteDTO;
import co.edu.cue.finalprojectbarber.DTOS.ClientQuoteDTO;
import co.edu.cue.finalprojectbarber.model.Client;
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
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class ClientMyQuotesController implements Initializable {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private Client meClient;

    public Client getMeClient() {
        return meClient;
    }

    public void setMeClient(Client meClient) {
        this.meClient = meClient;
    }

    private ObservableList<ClientQuoteDTO> quoteDTOS=FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML();
        meClient=mfc.getBarbergod().getClientHomeController().getMyclient();
        //falta limitar conventir observable
        mfc.getBarbergod().getPrepareColumn().prepareTableClientQouteDTO(StarttimeColumn,DeparTimeColumn,ServiceColumn,BarberColumn);
        QuotesTable.setItems(quoteDTOS);
    }

    @FXML
    private TableColumn<ClientQuoteDTO,String> BarberColumn;

    @FXML
    private TableColumn<ClientQuoteDTO, String> DeparTimeColumn;

    @FXML
    private TableView<ClientQuoteDTO> QuotesTable;

    @FXML
    private TableColumn<ClientQuoteDTO, String> ServiceColumn;

    @FXML
    private TableColumn<ClientQuoteDTO, String> StarttimeColumn;

    @FXML
    void Backbutton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");

    }

    @FXML
    void Myprofilebutton(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientHome.fxml");

    }


    @FXML
    void Quotebutton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientQuotes.fxml");

    }
    @FXML
    void Myquotesbutton(ActionEvent event) {

    }


}
