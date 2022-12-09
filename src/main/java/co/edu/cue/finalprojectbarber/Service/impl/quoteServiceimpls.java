package co.edu.cue.finalprojectbarber.Service.impl;

import co.edu.cue.finalprojectbarber.model.Barberq;
import co.edu.cue.finalprojectbarber.model.Client;
import co.edu.cue.finalprojectbarber.model.CutService;

import java.time.LocalDateTime;

public interface quoteServiceimpls {
    void createQuote(LocalDateTime starttime, LocalDateTime endtime, Client client, Barberq barberq, CutService cutService);
}
