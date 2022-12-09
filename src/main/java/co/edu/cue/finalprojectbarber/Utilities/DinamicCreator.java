package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import co.edu.cue.finalprojectbarber.model.Cut;
import co.edu.cue.finalprojectbarber.model.CutService;
import javafx.geometry.Pos;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.HashSet;

public class DinamicCreator {
    public VBox createVbox(){
        VBox vBox=new VBox();
        vBox.setPrefHeight(80);
        vBox.setPrefWidth(70);
        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }

    public HBox createHbox(){
        HBox hbox=new HBox();
        hbox.setPrefHeight(80);
        hbox.setPrefWidth(70);
        hbox.setSpacing(60);
        return hbox;
    }
    public Text createText(CutService cutService){
        Text text=new Text(cutService.getName());
        text.setFill(Paint.valueOf("white"));
        return text;
    }
    public Text createTextPrice(CutService cutService){
        Text text=new Text("$"+Double.valueOf(cutService.getPrice()));
        text.setFill(Paint.valueOf("white"));
        return text;
    }
    public void joinCutData(HashSet<CutService> cutServiceHash, VBox pricipalVBox, DatePicker datePicker, ModelFactoryController mfc){
        ArrayList<CutService> cutServices=new ArrayList<CutService>(cutServiceHash);
        int y=0;
        while (y<cutServices.size()){
            HBox hBox=createHbox();
            individual: for (int x=0;x<5;x++){
                VBox vBox=createVbox();
                vBox.getChildren().add(createTextPrice(cutServices.get(y)));
                vBox.getChildren().add(createTextPrice(cutServices.get(y)));
                hBox.getChildren().add(vBox);
                y++;
                if (y==cutServices.size()){
                    break individual;
                }
            }
            pricipalVBox.getChildren().add(hBox);
        }
    }

}
