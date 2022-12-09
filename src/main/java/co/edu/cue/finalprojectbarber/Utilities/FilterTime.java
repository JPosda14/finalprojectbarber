package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.Service.impl.Barbergod;
import co.edu.cue.finalprojectbarber.model.CutService;
import co.edu.cue.finalprojectbarber.model.Quote;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterTime {
    private Barbergod barbergod;
    public FilterTime(Barbergod barbergod){this.barbergod=barbergod;}

    public ArrayList<Quote> limitToDay(ArrayList<Quote> qoutes, String generalDate){
        if (qoutes!=null){
            ArrayList<Quote> listQouteFilter;
            listQouteFilter=(ArrayList<Quote>) qoutes.stream().filter(x->generalDate.equals(barbergod.getTimeConverter().localDateTimeToGeneral(x.getStartTime()))).collect(Collectors.toList());
            return listQouteFilter;
        }else {
            return null;
        }

    }

    public ArrayList<Quote> limitToCut(ArrayList<Quote> quotes, CutService cutService){
        if (quotes!=null){
            ArrayList<Quote> listQouteFilter;
            listQouteFilter=(ArrayList<Quote>) quotes.stream().filter(x->cutService.getName().equals(x.getCutService().getName())).collect(Collectors.toList());
            return listQouteFilter;
        }else{
            return null;
        }
    }

    public ArrayList<Quote> limitAll(ArrayList<Quote> quotes, CutService cutService,String generalDate){
        ArrayList<Quote> listQouteFilter;
        listQouteFilter=limitToDay(quotes,generalDate);
        System.out.println(listQouteFilter);
        listQouteFilter=limitToCut(listQouteFilter,cutService);
        System.out.println(listQouteFilter);
        return listQouteFilter;
    }
}
