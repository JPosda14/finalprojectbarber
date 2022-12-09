package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.HelloApplication;
import com.almasb.fxgl.entity.action.Action;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class LoadScenes {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void changeScene(ActionEvent event, String rute)throws IOException{
        root= FXMLLoader.load(HelloApplication.class.getResource(rute));
        System.out.println();
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void closeModal(Button button){
        Stage stage=(Stage) button.getScene().getWindow();
        stage.close();}



}
