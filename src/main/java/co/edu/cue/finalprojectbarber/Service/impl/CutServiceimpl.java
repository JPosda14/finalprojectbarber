package co.edu.cue.finalprojectbarber.Service.impl;

import co.edu.cue.finalprojectbarber.model.Cut;
import co.edu.cue.finalprojectbarber.model.CutService;

import java.util.HashSet;

public class CutServiceimpl implements co.edu.cue.finalprojectbarber.Service.CutService {
    private HashSet<CutService>cutServices;
    private Barbergod barbergod;
    public CutServiceimpl(Barbergod barbergod){this.barbergod=barbergod;}
    public Barbergod getBarbergod(){return barbergod;}
    public HashSet<CutService>getCutServices(){return cutServices;}
    public void setCutServices(HashSet<CutService>cutServices){this.cutServices=cutServices;}

    @Override
    public void createCut(String name, String image, Double price, Cut cut) {

    }
}
