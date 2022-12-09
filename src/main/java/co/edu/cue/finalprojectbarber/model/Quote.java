package co.edu.cue.finalprojectbarber.model;

import java.time.LocalDateTime;

public class Quote {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Barberq barberq;
    private CutService cutService;
    private Client client;

    public Quote(){super();}

    public Quote(LocalDateTime startTime, LocalDateTime endTime, Barberq barberq, CutService cutService, Client client) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.barberq = barberq;
        this.cutService = cutService;
        this.client = client;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Barberq getBarberq() {
        return barberq;
    }

    public void setBarberq(Barberq barberq) {
        this.barberq = barberq;
    }

    public CutService getCutService() {
        return cutService;
    }

    public void setCutService(CutService cutService) {
        this.cutService = cutService;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
