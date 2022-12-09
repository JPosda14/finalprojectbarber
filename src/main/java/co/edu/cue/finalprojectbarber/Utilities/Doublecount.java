package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import co.edu.cue.finalprojectbarber.model.Person;

import java.util.HashSet;

public class Doublecount {
    public Boolean yesNameUser(String name, HashSet<? extends Person> people){
        Boolean result=false;
        for (Person person: people){
            result=(name.equals(person.getName())) ? false: true;
            if (!result)break;
        }
        return result;
    }

    public Boolean adminAdmitName(String name, String adminName){
        return  (name.equals(adminName))?false:true;
    }

    public Boolean yesName(String name, String adminName, HashSet<Client> clients, HashSet<Barberq>barberqs){
        return (yesNameUser(name, clients)&&yesNameUser(name,barberqs)&& adminAdmitName(name, adminName));
    }

    public Boolean yesEmail(String email, HashSet<? extends Person>people){
        Boolean result=true;
        for (Person person:people){
            result=(email.equals(person.getEmail()))? false: true;
            if (!result)break;
        }
        return result;
    }
}
