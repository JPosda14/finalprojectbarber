package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.model.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientHomeController implements Initializable {
    ModelFactoryController mfc=ModelFactoryController.getInstance();
    private Client myclient;
    public Client getMyclient(){return myclient;}

    public void setMyclient(Client myclient) {this.myclient = myclient;}

    @FXML
    void Myquotesbutton(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/BarbersMyQuotes.fxml");

    }

    @FXML
    void Quotebutton(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientQuotes.fxml");

    }
    @FXML
    void Backbutton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML().loadata();
        myclient=mfc.getBarbergod().getClientHomeController().getMyclient();

    }
    @FXML
    void Myprofilebutton(ActionEvent event) {

    }
}
