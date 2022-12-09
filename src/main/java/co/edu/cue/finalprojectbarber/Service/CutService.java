package co.edu.cue.finalprojectbarber.Service;

import co.edu.cue.finalprojectbarber.model.Cut;

public interface CutService {
    void createCut(String name, String image, Double price, Cut cut);
}
