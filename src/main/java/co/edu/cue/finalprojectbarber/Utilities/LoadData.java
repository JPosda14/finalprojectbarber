package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.Service.impl.Barbergod;
import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoadData {
    private final Barbergod barbergod;
    public LoadData(Barbergod barbergod){this.barbergod=barbergod;}
    public void loadata() {
        ExecutorService service= Executors.newFixedThreadPool(5);
        loadAdmin(service);
        loadBarbers(service);
        loadCient(service);
        chargeQuotes(service);
        service.shutdown();
    }


    public void loadAdmin(ExecutorService service){
        service.submit(()->{
            try {
                barbergod.getAdminService().setAdmin(barbergod.getAdminPersistence().sendadmin());
                System.out.println(Thread.currentThread().getName());
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        });
    }

    public void loadCient(ExecutorService service){
        service.submit(()->{
            try {
                barbergod.getClientService().setListClients(barbergod.getClientPersistence().chargeClient());
                System.out.println(Thread.currentThread().getName());
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        });
    }

    public void loadBarbers(ExecutorService service){
        service.submit(()->{
            try {
                barbergod.getBarberpService().setListBarberq(barbergod.getBarberqPersistence().chargeEmployee());
                System.out.println(Thread.currentThread().getName());
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        });
    }
    public void chargeQuotes(ExecutorService service){
        service.submit(()-> {
            try {
                barbergod.getQuoteServiceimpl().setQuotes(barbergod.getQuotePersistence().chargeCut());
                System.out.println(Thread.currentThread().getName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }



}
