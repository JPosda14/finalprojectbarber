package co.edu.cue.finalprojectbarber.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();



    @FXML
    private TextField SignUpEmail;

    @FXML
    private PasswordField SignUpPassword;

    @FXML
    private TextField SignUpUser;
    @FXML
    private TextField SignUpNumber;

    @FXML
    void Emailfield(ActionEvent event) {

    }

    @FXML
    void Passwordfield(ActionEvent event) {

    }

    @FXML
    void SignUpbutton(ActionEvent event) throws IOException{
        if (mfc.getBarbergod().getDoubleValidator().yesAdm(mfc,SignUpUser.getText())&& mfc.getBarbergod().getVoidValidator().voidspacevali(mfc,SignUpUser.getText(),SignUpEmail.getText(),SignUpPassword.getText())&& mfc.getBarbergod().getEmailValidator().trueEmail(SignUpEmail.getText(),mfc)){
            mfc.makeClient(SignUpUser.getText(), SignUpEmail.getText(),SignUpPassword.getText(),SignUpNumber.getText());
            mfc.getBarbergod().getClientPersistence().saveclient(mfc.getBarbergod().getClientService().getListClients());
            mfc.getBarbergod().getAlerts().alertInformation("Your count has been creted", "Welcome");
            mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");
        }

    }
    @FXML
    void backButton(ActionEvent event)  throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");

    }

    @FXML
    void UserTextfield(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {mfc.getBarbergod().getLoadDataFXML().loadata();}
}





