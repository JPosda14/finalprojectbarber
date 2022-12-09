package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.DTOS.ClientQuoteDTO;
import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import co.edu.cue.finalprojectbarber.model.CutService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ClientQuoteModalController implements Initializable {
    public ModelFactoryController getMfc(){return mfc;}
    public void setMfc(ModelFactoryController mfc){this.mfc=mfc;}
    private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private ClientQuoteDTO clientQuoteDTOSelected;
    private Client myClient;
    private CutService selectedCutservice;
    private LocalDate dateSelected;
    private Barberq barberqSelected;
    private ObservableList<Barberq> barberqObservableList= FXCollections.observableArrayList();

    public Barberq getBarberqSelected() {
        return barberqSelected;
    }

    public void setBarberqSelected(Barberq barberqSelected) {
        this.barberqSelected = barberqSelected;
    }

    public LocalDate getDateSelected() {
        return dateSelected;
    }

    public void setDateSelected(LocalDate dateSelected) {
        this.dateSelected = dateSelected;
    }

    public CutService getSelectedCutservice() {
        return selectedCutservice;
    }

    public void setSelectedCutservice(CutService selectedCutservice) {
        this.selectedCutservice = selectedCutservice;
    }


    private ObservableList<ClientQuoteDTO> ObservableQuoteDTO= FXCollections.observableArrayList();

    public ClientQuoteDTO getClientQuoteDTOSelected() {
        return clientQuoteDTOSelected;
    }

    public void setClientQuoteDTOSelected(ClientQuoteDTO clientQuoteDTOSelected) {
        this.clientQuoteDTOSelected = clientQuoteDTOSelected;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML().loadata();
        selectedCutservice=mfc.getBarbergod().getClientQuoteModalController().getSelectedCutservice();
        dateSelected=mfc.getBarbergod().getClientQuoteModalController().getDateSelected();
        mfc.getBarbergod().getTransObservList().ClientQuoteDTOS(ObservableQuoteDTO,dateSelected,mfc.getBarbergod().getQuoteServiceimpl().getQuotes());
        mfc.getBarbergod().getPrepareColumn().prepareTableClientQouteDTO(StartColumn,EndColumn,ServiceColumn,BarberColumn);
        QuoteTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) ->{
            clientQuoteDTOSelected=newSelection;
        });
        QuoteTable.setItems(ObservableQuoteDTO);
        TableBarber.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) ->{
            barberqSelected=newSelection;
            TableBarber.setItems(barberqObservableList);
        });
    }
    @FXML
    private TableColumn<Barberq, String> BarberColumn;

    @FXML
    private TableColumn<ClientQuoteDTO, String> EndColumn;

    @FXML
    private TableView<ClientQuoteDTO> QuoteTable;

    @FXML
    private TableColumn<ClientQuoteDTO, String> ServiceColumn;

    @FXML
    private TableColumn<ClientQuoteDTO, String> StartColumn;

    @FXML
    private TableView<Barberq> TableBarber;
    @FXML
    private Button AgreeBtn;

    @FXML
    void AgreeButton(ActionEvent event) {
        if (mfc.getBarbergod().getSelectValidator().validateQuoteDTO(clientQuoteDTOSelected)){
            mfc.getBarbergod().getClientQuoteController().setClientQuoteDTOSelected(clientQuoteDTOSelected);
            mfc.getBarbergod().getClientQuoteController().setSelectedCutservice(selectedCutservice);
            mfc.getBarbergod().getAlerts().alertInformation("Your Quote was selected","The Quote was selected");
            mfc.getBarbergod().getLoadScenes().closeModal(AgreeBtn);
        }

    }


}
