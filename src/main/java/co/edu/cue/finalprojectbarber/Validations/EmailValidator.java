package co.edu.cue.finalprojectbarber.Validations;

import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import co.edu.cue.finalprojectbarber.exeptions.DoubleEmailException;
import co.edu.cue.finalprojectbarber.exeptions.EmailRuteException;
import co.edu.cue.finalprojectbarber.model.RuteEmail;

public class EmailValidator {
    public Boolean verifyRute(String email, ModelFactoryController mfc){
        try {
            if(email.split("@")[1].equals(RuteEmail.GOOGLE.getRuteEmail())|| email.split("@")[1].equals(RuteEmail.OUTLOOK.getRuteEmail())|| email.split("@")[1].equals(RuteEmail.HOTMAIL.getRuteEmail())){
                return true;
            }else {
                throw new EmailRuteException("This email isn't able");
            }
        }catch (ArrayIndexOutOfBoundsException aiobe){
            mfc.getBarbergod().getAlerts().errorAlert("This email isn't able", "Please put another email rute");
            return false;
        }catch (EmailRuteException ere){
            mfc.getBarbergod().getAlerts().errorAlert(ere.getMessage(), "Please put another email");
            return false;
        }
    }

    public Boolean doubleEmail(ModelFactoryController mfc, String email){
        if(mfc.getBarbergod().getDoublecount().yesEmail(email,mfc.getBarbergod().getClientService().getListClients())&& mfc.getBarbergod().getDoublecount().yesEmail(email,mfc.getBarbergod().getBarberpService().getListBarberq())&& !email.equals(mfc.getBarbergod().getAdminService().getAdmin().getEmail())){
            return true;
        }else {
            try {
                throw new DoubleEmailException("This email is in use");
            }catch (DoubleEmailException dee){
                mfc.getBarbergod().getAlerts().errorAlert(dee.getMessage(), "Please put other email");
                return false;
            }
        }
    }
    public Boolean trueEmail(String email, ModelFactoryController mfc){
        return verifyRute(email, mfc) && doubleEmail(mfc, email);
    }
}
