package co.edu.cue.finalprojectbarber.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminClientController implements Initializable {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private ObservableList<Client> clients= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getBarbergod().getLoadDataFXML().loadata();
        clients=mfc.getBarbergod().getTransObservList().clientObservableList(mfc.getBarbergod().getClientService().getListClients());
        mfc.getBarbergod().getPrepareColumn().prepareTableClient(ClientNameColumb,ClientEmailColumn,ClientPasswordColumn,ClientNumberColumn);
        AdminTableClient.setItems(clients);
    }

    @FXML
    private TableView<Client> AdminTableClient;



    @FXML
    private TableColumn<?, ?> ClientEmailColumn;

    @FXML
    private TableColumn<?, ?> ClientNameColumb;

    @FXML
    private TableColumn<?, ?> ClientNumberColumn;

    @FXML
    private TableColumn<?, ?> ClientPasswordColumn;

    @FXML
    void BackButton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/Login.fxml");

    }

    @FXML
    void BarbersviewButton(ActionEvent event) throws IOException{
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/AdminHomeBarber.fxml");

    }

    @FXML
    void ClientsViewButton(ActionEvent event) throws IOException {
        mfc.getBarbergod().getLoadScenes().changeScene(event,"FXML/AdminHomeClient.fxml");

    }

}
