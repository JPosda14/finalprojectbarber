package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.model.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.controlsfx.control.PropertySheet;

import java.io.IOException;

public class AdminHomeController {
   private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private Admin ioAdmin;
    public Admin getIoAdmin(){return ioAdmin;}

    public void setIoAdmin(Admin ioAdmin) {this.ioAdmin = ioAdmin;}

    @FXML
    void BackButton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");
    }


    @FXML
    void BarbersviewButton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/AdminHomeBarber.fxml");

    }

    @FXML
    void ClientsViewButton(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/AdminHomeClient.fxml");

    }

}
