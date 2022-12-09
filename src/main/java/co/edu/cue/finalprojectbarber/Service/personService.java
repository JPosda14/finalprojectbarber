package co.edu.cue.finalprojectbarber.Service;

import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;

public interface personService {
    void makeclient(String name, String email, String password, String number);
    void makebarber(String name, String email, String password, Double earning);
    void eliminateperson(String name, String password, ModelFactoryController mfc);
}
