package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.DTOS.BarberQuoteDTO;
import co.edu.cue.finalprojectbarber.DTOS.ClientQuoteDTO;
import co.edu.cue.finalprojectbarber.Service.impl.Barbergod;
import co.edu.cue.finalprojectbarber.controller.BarberMyQuotesController;
import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import co.edu.cue.finalprojectbarber.model.Quote;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;

public class TransObservList {
    private Barbergod barbergod;
    public TransObservList(Barbergod barbergod){this.barbergod=barbergod;}
    private DateTimeFormatter formatGeneral = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public ObservableList<Barberq> BarberqObservableList(HashSet<Barberq> listPeople){
        ObservableList<Barberq> observableListPeople= FXCollections.observableArrayList(listPeople);
        return observableListPeople;
    }

    public ObservableList<Client> clientObservableList(HashSet<Client> listClient){
        ObservableList<Client> observableListClient= FXCollections.observableArrayList(listClient);
        return observableListClient;
    }

    public ObservableList<BarberQuoteDTO> barberQuoteDTOS(ObservableList<BarberQuoteDTO> quoteDTOS , LocalDate date, ArrayList<Quote> listQoutes){
        ArrayList<Quote> filterqoutes=barbergod.getFilterTime().limitToDay(listQoutes,date.format(formatGeneral));
        if (filterqoutes!=null){
            for (int x=0;x<filterqoutes.size();x++){
                if (Integer.parseInt(barbergod.getTimeConverter().localDateTimeToHour(LocalDateTime.now()).split(":")[0])>=Integer.parseInt(barbergod.getTimeConverter().localDateTimeToHour(filterqoutes.get(x).getStartTime()).split(":")[0]) && date.isEqual(LocalDate.now())){
                    continue;
                }else {
                    quoteDTOS.add(new BarberQuoteDTO(barbergod.getTimeConverter().localDateTimeToHour(filterqoutes.get(x).getStartTime()),barbergod.getTimeConverter().localDateTimeToHour(filterqoutes.get(x).getEndTime()),filterqoutes.get(x).getCutService().getName(),filterqoutes.get(x).getClient().getName()));
                }
            }
        }
        return quoteDTOS;
    }
    public ObservableList<ClientQuoteDTO> ClientQuoteDTOS(ObservableList<ClientQuoteDTO>quoteDTOS,LocalDate date, ArrayList<Quote>listQuotes){
        ArrayList<Quote>filterquotes=barbergod.getFilterTime().limitToDay(listQuotes, date.format(formatGeneral));
        if (filterquotes!=null){
            for (int x=0;x<filterquotes.size();x++){
                if (Integer.parseInt(barbergod.getTimeConverter().localDateTimeToHour(LocalDateTime.now()).split(":")[0])>=Integer.parseInt(barbergod.getTimeConverter().localDateTimeToHour(filterquotes.get(x).getStartTime()).split(":")[0])&& date.isEqual(LocalDate.now())){
                    continue;
                }else {
                    quoteDTOS.add(new ClientQuoteDTO(barbergod.getTimeConverter().localDateTimeToHour(filterquotes.get(x).getStartTime()),barbergod.getTimeConverter().localDateTimeToHour(filterquotes.get(x).getEndTime()),filterquotes.get(x).getCutService().getName(),filterquotes.get(x).getClient().getName()));
                }
            }
        }return quoteDTOS;
    }


}
