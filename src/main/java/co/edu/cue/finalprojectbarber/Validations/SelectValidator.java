package co.edu.cue.finalprojectbarber.Validations;

import co.edu.cue.finalprojectbarber.DTOS.ClientQuoteDTO;
import co.edu.cue.finalprojectbarber.Service.impl.Barbergod;
import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import co.edu.cue.finalprojectbarber.model.CutService;
import co.edu.cue.finalprojectbarber.model.Person;

public class SelectValidator {
    private final Barbergod barbergod;
    public SelectValidator(Barbergod barbergod){this.barbergod=barbergod;}
    public Boolean truePerson(Person personSelected, ModelFactoryController mfc){
        if (personSelected==null){
            mfc.getBarbergod().getAlerts().errorAlert("You don't select the person yet","Don't selected");
            return false;
        }else return true;
    }
    public Boolean validateQuoteDTO(ClientQuoteDTO QuoteDTOSelected){
        if (QuoteDTOSelected==null){
            barbergod.getAlerts().errorAlert("The Quote is not selected","Please select a quote");
            return false;
        }else return true;
    }
    public Boolean validateCutservice(CutService cutService){
        if (cutService==null){
            barbergod.getAlerts().errorAlert("You didn't select a service yet","Please select a service");
        return false;
        }else return true;
    }

}
