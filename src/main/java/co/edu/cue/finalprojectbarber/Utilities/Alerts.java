package co.edu.cue.finalprojectbarber.Utilities;

import javafx.scene.control.Alert;

public class Alerts {
    public void errorAlert(String message,String header){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setTitle("Error");
        alert.setContentText(message);
        alert.showAndWait();
    }
    public void alertInformation(String message, String header){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(header);
        alert.setTitle("Error");
        alert.setTitle(message);
        alert.showAndWait();
    }

}
