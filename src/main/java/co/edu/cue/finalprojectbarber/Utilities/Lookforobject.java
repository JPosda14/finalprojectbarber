package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.model.CutService;
import co.edu.cue.finalprojectbarber.model.Person;
import co.edu.cue.finalprojectbarber.model.Client;
import co.edu.cue.finalprojectbarber.model.Barberq;


import java.util.HashSet;
import java.util.Objects;

public class Lookforobject {
    public Person getPerson(String username, String password, HashSet<? extends Person>listPeople){
        for (Person person:listPeople){
            if (person.getPassword().equals(password)&& person.getName().equals(username)){
                return person;
            }
        }
        return null;
    }
    public Client getClient(String username, String password, HashSet<Client> listPeople) {
        for (Client client : listPeople) {
            if(client.getPassword().equals(password) && client.getName().equals(username)){return client;}
        }
        return null;
    }
    public CutService getCuts(String name, HashSet<CutService> listCuts){
        for (CutService cutService:listCuts){
            if (cutService.getName().equals(name)){
                return cutService;
            }
        }
        return null;
}
public Barberq getBarber(String username,Double earning, HashSet<Barberq>listPeople){
        for (Barberq barberq: listPeople){
            if (barberq.getName().equals(username)&& Objects.equals(barberq.getEarning(), earning)){return barberq;
        }
}return null;
}
}
