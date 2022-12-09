package co.edu.cue.finalprojectbarber.Validations;

import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import co.edu.cue.finalprojectbarber.exeptions.InputException;

public class VoidValidator {
    public Boolean voidspacevali(ModelFactoryController mfc,String name, String email, String password){
        if (!(name == ""|| email == "" || password == "")){
            return true;
        }else {try{
            throw new InputException("Some information is missing");
            }catch (InputException ie){
            mfc.getBarbergod().getAlerts().errorAlert(ie.getMessage(), "Please complete the field");
            return false;
            }
        }
    }
}
