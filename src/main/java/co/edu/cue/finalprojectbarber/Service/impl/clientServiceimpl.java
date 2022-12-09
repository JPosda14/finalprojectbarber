package co.edu.cue.finalprojectbarber.Service.impl;

import co.edu.cue.finalprojectbarber.Service.personService;
import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import co.edu.cue.finalprojectbarber.model.Client;

import java.util.HashSet;

public class clientServiceimpl implements personService {
    private HashSet<Client> listClients;

    public HashSet<Client> getListClients() {return listClients;}
    public void setListClients(HashSet<Client>listClients){this.listClients=listClients;}


    @Override
    public void makeclient(String name, String email, String password, String number) {
        listClients.add(new Client(name,email,password,number));
    }

    @Override
    public void makebarber(String name, String email, String password, Double earning) {

    }

    @Override
    public void eliminateperson(String name, String password, ModelFactoryController mfc) {


    }
}
