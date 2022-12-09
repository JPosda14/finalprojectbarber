package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BarberHomeController implements Initializable {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();

    private Barberq mybarber;
    public Barberq getMybarber(){return mybarber;}

    public void setMybarber(Barberq mybarber) {this.mybarber = mybarber;}


    @FXML
    void Backbutton(ActionEvent event)  throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");
    }

    @FXML
    void MyProfilebarber(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/BarbersMyprofile.fxml");

    }

    @FXML
    void MyQuotesbarber(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/BarbersMyQuotes.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML().loadata();
        mybarber=mfc.getBarbergod().getBarberHomeController().getMybarber();
    }
}
