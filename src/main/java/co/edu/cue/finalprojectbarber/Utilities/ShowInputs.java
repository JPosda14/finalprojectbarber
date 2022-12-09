package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.DTOS.ClientQuoteDTO;
import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Person;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ShowInputs {
    public void showprofile(TextField textFieldName, TextField textFieldEmail, TextField textFieldPassword, Person person){
        textFieldEmail.setText(person.getEmail());
        textFieldName.setText(person.getName());
        textFieldPassword.setText(person.getPassword());
    }

    public void showBarberInformation(Barberq barberqSelection, TextField txtName, TextField txtEmail, TextField txtPassword, TextField txtEarning){
        if(barberqSelection != null){
            txtEmail.setText(barberqSelection.getEmail());
            txtEmail.setEditable(false);
            txtName.setText(barberqSelection.getName());
            txtName.setEditable(false);
            txtPassword.setText(barberqSelection.getPassword());
            txtPassword.setEditable(false);
            txtEarning.setText(String.valueOf(barberqSelection.getEarning()));
            txtEarning.setEditable(false);
        }
    }
    public void ShowQuoteModal(Text textNameBarber, Text textStart, Text textEnd, ClientQuoteDTO clientQuoteDTO){
        textStart.setText(clientQuoteDTO.getStartHour());
        textEnd.setText(clientQuoteDTO.getEndHour());
        textNameBarber.setText(clientQuoteDTO.getNameBarber());
    }
}
