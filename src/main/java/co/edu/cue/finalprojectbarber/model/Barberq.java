package co.edu.cue.finalprojectbarber.model;

public class barberp extends person {

    public barberp(String name) {
        super(name);
    }
    private double earning;

    public double getEarning() {
        return earning;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    public barberp(String name, double earning) {
        super(name);
        this.earning = earning;
    }
}
