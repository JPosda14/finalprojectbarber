package co.edu.cue.finalprojectbarber.Utilities;

import javafx.scene.control.TextField;

public class EliminateInputs {
    public void eliminateinfo(TextField textField1,TextField textField2, TextField textField3){
        textField1.setEditable(true);
        textField1.setText("");
        textField2.setEditable(true);
        textField2.setText("");
        textField3.setEditable(true);
        textField3.setText("");
    }
    public void eliminatebarberinfo(TextField textField1,TextField textField2, TextField textField3,TextField textField4){
        textField1.setEditable(true);
        textField1.setText("");
        textField2.setEditable(true);
        textField2.setText("");
        textField3.setEditable(true);
        textField3.setText("");
        textField4.setEditable(true);
        textField4.setText("");
    }

}
