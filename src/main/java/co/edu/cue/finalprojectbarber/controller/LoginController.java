package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    private ModelFactoryController mfc= ModelFactoryController.getInstance();

    @FXML
    private TextField Userfield;

    @FXML
    private PasswordField passwordfield;


    @FXML
    void Login(ActionEvent event) throws IOException {
        if(!mfc.getBarbergod().getLoginbutton().adminLogin(Userfield.getText(),passwordfield.getText(),mfc)){
            switch (mfc.getBarbergod().getLoginbutton().DefaultL(Userfield.getText(),passwordfield.getText(),mfc)){
                case "client":
                    mfc.getBarbergod().getClientHomeController().setMyclient((Client) mfc.getBarbergod().getLookforobject().getPerson(Userfield.getText(),passwordfield.getText(),mfc.getBarbergod().getClientService().getListClients()));
                    mfc.getBarbergod().getClientMyQuotesController().setMeClient((Client) mfc.getBarbergod().getLookforobject().getPerson(Userfield.getText(),passwordfield.getText(),mfc.getBarbergod().getClientService().getListClients()));
                    mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/ClientHome.fxml");
                    break;
                case "barber":
                    mfc.getBarbergod().getBarberHomeController().setMybarber((Barberq)mfc.getBarbergod().getLookforobject().getPerson(Userfield.getText(),passwordfield.getText(),mfc.getBarbergod().getBarberpService().getListBarberq()));
                    mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/BarbersHome.fxml");
                    break;
                case "":mfc.getBarbergod().getAlerts().errorAlert("Try again or create an acount","This count doesn't exist");break;
            }
        }else{
            mfc.getBarbergod().getAdminHomeController().setIoAdmin(mfc.getBarbergod().getAdminService().getAdmin());
            mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/AdminHome.fxml");

        }

    }

    @FXML
    void Signup(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/SignUp.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML().loadata();
    }
}
