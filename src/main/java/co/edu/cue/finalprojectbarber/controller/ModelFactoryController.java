package co.edu.cue.finalprojectbarber.controller;

import co.edu.cue.finalprojectbarber.Service.ModelFactoryService;
import co.edu.cue.finalprojectbarber.Service.impl.Barbergod;
import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import co.edu.cue.finalprojectbarber.model.CutService;

import java.time.LocalDateTime;

public class ModelFactoryController implements ModelFactoryService {
    private Barbergod barbergod;

    private static class SingletonHolder{
        private final static ModelFactoryController eINSTANCE= new ModelFactoryController();
    }

    public static ModelFactoryController getInstance(){
        return SingletonHolder.eINSTANCE;
    }

    public Barbergod getBarbergod() {
        return barbergod;
    }

    public void setBarbergod(Barbergod barbergod) {
        this.barbergod = barbergod;
    }

    public ModelFactoryController(){barbergod= new Barbergod();}

    @Override
    public void makeClient(String name, String email, String password, String number){
        barbergod.getClientService().makeclient(name, email, password, number);
    }

    @Override
    public void makeadmin(String name, String email, String password) {
        barbergod.getAdminService().makeperson(name,email,password);
    }

    @Override
    public void makeBarber(String name, String email, String password, Double earning) {
        barbergod.getBarberpService().makebarber(name, email, password, earning);


    }


    @Override
    public void eliminateBarber(String name, String password, ModelFactoryController mfc){
        barbergod.getBarberpService().eliminateperson(name, password,mfc);
    }

    @Override
    public void createQuote(LocalDateTime starTime, LocalDateTime EndTime, Barberq barberq, Client client, CutService cutService) {
        barbergod.getQuoteServiceimpl().createQuote(starTime,EndTime,client,barberq,cutService);
    }


}


