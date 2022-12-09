package co.edu.cue.finalprojectbarber.Validations;

import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import co.edu.cue.finalprojectbarber.exeptions.DoubleException;
import co.edu.cue.finalprojectbarber.model.Person;

public class DoubleValidator {
    public Boolean doublecount(ModelFactoryController mfc, String name, Person myPerson) {
        if (mfc.getBarbergod().getDoublecount().yesName(name, mfc.getBarbergod().getAdminService().getAdmin().getName(), mfc.getBarbergod().getClientService().getListClients(), mfc.getBarbergod().getBarberpService().getListBarberq())) {
            return true;
        } else if (name.equals(myPerson.getName())) {
            return true;
        } else {
            try {
                throw new DoubleException("This name is not able");
            } catch (DoubleException de) {
                mfc.getBarbergod().getAlerts().errorAlert(de.getMessage(), "Please put other name");
                return false;
            }
        }
    }
    public Boolean yesAdm(ModelFactoryController mfc, String name){
        if (mfc.getBarbergod().getDoublecount().yesName(name,mfc.getBarbergod().getAdminService().getAdmin().getName(),mfc.getBarbergod().getClientService().getListClients(),mfc.getBarbergod().getBarberpService().getListBarberq())){
            return true;
        }else {
            try{
                throw new DoubleException("This name is not able");
            }catch (DoubleException de){
                mfc.getBarbergod().getAlerts().errorAlert(de.getMessage(), "Please put other name");
                return false;
            }
        }
    }
}