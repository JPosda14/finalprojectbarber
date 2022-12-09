package co.edu.cue.finalprojectbarber.Service;

import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import co.edu.cue.finalprojectbarber.model.CutService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ModelFactoryService{
    void makeClient(String name, String email, String password,String number);

    void makeadmin(String name, String email, String password);

    void makeBarber(String name, String email, String password,Double earning);

    void eliminateBarber(String name, String password, ModelFactoryController mfc);
    void createQuote(LocalDateTime starTime, LocalDateTime EndTime, Barberq barberq, Client client, CutService cutService);
}
