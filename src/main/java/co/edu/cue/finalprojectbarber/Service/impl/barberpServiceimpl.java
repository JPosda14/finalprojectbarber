package co.edu.cue.finalprojectbarber.Service.impl;

import co.edu.cue.finalprojectbarber.Service.personService;
import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;

import java.util.HashSet;

public class barberpServiceimpl implements personService {
    private HashSet<Barberq> listBarberq;
    private final Barbergod barbergod;

    public barberpServiceimpl(Barbergod barbergod) {this.barbergod = barbergod;}

    public HashSet<Barberq> getListBarberq() {
        return listBarberq;
    }

    public void setListBarberq(HashSet<Barberq> listBarberq) {this.listBarberq = listBarberq;}

    @Override
    public void makeclient(String name, String email, String password, String number) {

    }

    @Override
    public void makebarber(String name, String email, String password, Double earning) {
        listBarberq.add(new Barberq(name,email,password,earning));

    }

    @Override
    public void eliminateperson(String name, String password, ModelFactoryController mfc) {
        Barberq barberq=(Barberq) mfc.getBarbergod().getLookforobject().getPerson(name,password,listBarberq);
        if (mfc.getBarbergod().getSelectValidator().truePerson(barberq,mfc)){
            listBarberq.remove(barberq);
        }


    }
}
