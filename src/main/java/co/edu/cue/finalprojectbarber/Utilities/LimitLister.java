package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.Service.impl.Barbergod;
import co.edu.cue.finalprojectbarber.model.CutService;
import co.edu.cue.finalprojectbarber.model.Quote;
import java.util.stream.Collectors;

import java.util.ArrayList;

public class LimitLister {
    private Barbergod barbergod;

    public LimitLister(Barbergod barbergod) {
        this.barbergod = barbergod;
    }
    public ArrayList<Quote> limitAll(ArrayList<Quote> quotes, CutService cutservices, String generalDate){
        ArrayList<Quote> listLoanFilter;
        listLoanFilter=limitToDay(quotes,generalDate);
        System.out.println(listLoanFilter);
        listLoanFilter=limitToAttraction(listLoanFilter,cutservices);
        System.out.println(listLoanFilter);
        return listLoanFilter;}


        public ArrayList<Quote> limitToDay(ArrayList<Quote> quotes, String generalDate){
            if (quotes!=null){
                ArrayList<Quote> listQuoteFilter;
                listQuoteFilter=(ArrayList<Quote>) quotes.stream().filter(x->generalDate.equals(barbergod.getTimeConverter().localDateTimeToGeneral(x.getStartTime()))).collect(Collectors.toList());
                return listQuoteFilter;
            }else {
                return null;
            }

        }

    public ArrayList<Quote> limitToAttraction(ArrayList<Quote> quotes, CutService attraction){
        if (quotes!=null){
            ArrayList<Quote> listQuoteFilter;
            listQuoteFilter=(ArrayList<Quote>) quotes.stream().filter(x->attraction.equals(x.getCutService())).collect(Collectors.toList());
            return listQuoteFilter;
        }else{
            return null;
        }
    }
}

