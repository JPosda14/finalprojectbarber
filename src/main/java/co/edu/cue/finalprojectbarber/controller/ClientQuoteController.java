package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.DTOS.ClientQuoteDTO;
import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import co.edu.cue.finalprojectbarber.model.CutService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientQuoteController {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private ClientQuoteDTO clientQuoteDTOSelected;
    private CutService selectedCutservice;
    private Client myclient;
    private Barberq mybarber;

    public Client getMyclient() {
        return myclient;
    }

    public void setMyclient(Client myclient) {
        this.myclient = myclient;
    }

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public CutService getSelectedCutservice() {
        return selectedCutservice;
    }

    public void setSelectedCutservice(CutService selectedCutservice) {
        this.selectedCutservice = selectedCutservice;
    }

    public ClientQuoteDTO getClientQuoteDTOSelected() {
        return clientQuoteDTOSelected;
    }

    public void setClientQuoteDTOSelected(ClientQuoteDTO clientQuoteDTOSelected) {
        this.clientQuoteDTOSelected = clientQuoteDTOSelected;
    }

    @FXML
    private Button ConfirmButton;
    @FXML
    void ConfirmBtn(ActionEvent event)throws IOException {
        selectedCutservice=mfc.getBarbergod().getClientQuoteController().getSelectedCutservice();
        myclient=mfc.getBarbergod().getClientHomeController().getMyclient();
        clientQuoteDTOSelected=mfc.getBarbergod().getClientQuoteController().getClientQuoteDTOSelected();
        if((mfc.getBarbergod().getSelectValidator().validateQuoteDTO(clientQuoteDTOSelected)&& mfc.getBarbergod().getSelectValidator().validateCutservice(selectedCutservice)&& mfc.getBarbergod().getSelectValidator().truePerson(myclient,mfc))){
            mfc.createQuote(LocalDateTime.parse(DateSelector.getValue().toString()+"T"+clientQuoteDTOSelected.getStartHour()),LocalDateTime.parse(DateSelector.getValue().toString()+"T"+clientQuoteDTOSelected.getEndHour()),mybarber,myclient,selectedCutservice);
            mfc.getBarbergod().getAdjustData().quoteAdjust();
        }

    }

    @FXML
    private DatePicker DateSelector;

    @FXML
    void Backbutton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");

    }

    @FXML
    void HourBarbercut(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientQuoteModal.fxml");
    }

    @FXML
    void HourBeautyCare(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientQuoteModal.fxml");
    }

    @FXML
    void HourEyebrowCut(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientQuoteModal.fxml");
    }

    @FXML
    void HourFullClean(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientQuoteModal.fxml");
    }

    @FXML
    void HourHairColor(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientQuoteModal.fxml");
    }

    @FXML
    void HourHairCut(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientQuoteModal.fxml");
    }

    @FXML
    void Myprofilebutton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientHome.fxml");

    }

    @FXML
    void Myquotesbutton(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientMyQuotes.fxml");

    }
    @FXML
    void Quotebutton(ActionEvent event) {

    }


}
