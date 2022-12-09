package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.Service.impl.Barbergod;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AdjustData {
    private Barbergod barberGod;
    public AdjustData(Barbergod barbergod){this.barberGod=barbergod;}

    public void AdjustBarber(ObservableList barberObservablelist, TextField BarbernameModify, TextField BarberEmailmodify, TextField BarberPasswordfield, TextField BarberEarningmodify, TableView BarberTable) throws IOException{
        barberGod.getBarberqPersistence().saveBarberq(barberGod.getBarberpService().getListBarberq());
        barberObservablelist=barberGod.getTransObservList().BarberqObservableList(barberGod.getBarberpService().getListBarberq());
        barberGod.getPrepareColumn().freshtable(barberObservablelist,BarberTable);
        barberGod.getEliminateInputs().eliminatebarberinfo(BarbernameModify,BarberEmailmodify,BarberPasswordfield,BarberEarningmodify);
    }
    public  void quoteAdjust()throws IOException{
        barberGod.getQuotePersistence().savebarber(barberGod.getQuoteServiceimpl().getQuotes());
    }


}
