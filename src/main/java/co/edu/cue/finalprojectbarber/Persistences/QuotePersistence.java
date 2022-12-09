package co.edu.cue.finalprojectbarber.Persistences;

import co.edu.cue.finalprojectbarber.Service.impl.Barbergod;
import co.edu.cue.finalprojectbarber.model.CutService;
import co.edu.cue.finalprojectbarber.model.Quote;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class QuotePersistence {
    private Barbergod barbergod;
    public QuotePersistence(Barbergod barbergod){this.barbergod=barbergod;}

    public static final String RUTE_ARCHIVE_QUOTE= "src/main/java/co/edu/cue/finalprojectbarber/Data/Quote.txt";
    public void savebarber(ArrayList<Quote>listquote)throws IOException{
        String content = "";
        for (Quote quote:listquote){
            content+= quote.getStartTime()+"/"+quote.getEndTime()+"/"+quote.getBarberq().getName()+"/"+quote.getCutService().getCut()+"\n";
        }
        ArchiveUtil.saveArchive(RUTE_ARCHIVE_QUOTE,content,false);
    }

    public ArrayList<Quote> chargeCut() throws FileNotFoundException, IOException{
        ArrayList<Quote>quotes=new ArrayList<Quote>();
        ArrayList<String> content= ArchiveUtil.readArchive(RUTE_ARCHIVE_QUOTE);
        String line="";
        for(int i=0; i<content.size(); i++){
            line= content.get(i);
            Quote myquote=new Quote();
            myquote.setStartTime(LocalDateTime.parse(line.split("/")[0]));
            myquote.setEndTime(LocalDateTime.parse(line.split("/")[1]));
            myquote.setClient(barbergod.getLookforobject().getClient(line.split("/")[2],line.split("/")[3],barbergod.getClientService().getListClients()));
            myquote.setCutService(barbergod.getLookforobject().getCuts(line.split("/")[4],barbergod.getCutServiceimpl().getCutServices()));
            quotes.add(myquote);
        }
        return quotes;
    }
}
