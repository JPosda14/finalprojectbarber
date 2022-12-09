package co.edu.cue.finalprojectbarber.Service.impl;

import co.edu.cue.finalprojectbarber.Service.personService;
import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import co.edu.cue.finalprojectbarber.model.Admin;

public class adminServiceimpl implements personService {
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public void makeperson(String name, String email, String password){
        admin.setName(name);
        admin.setEmail(email);
        admin.setPassword(password);
    }

    @Override
    public void makeclient(String name, String email, String password, String number) {

    }

    @Override
    public void makebarber(String name, String email, String password, Double earning) {

    }

    @Override
    public void eliminateperson(String name, String password, ModelFactoryController mfc){}
}
