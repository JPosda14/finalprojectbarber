package co.edu.cue.finalprojectbarber.DTOS;

public class ClientQuoteDTO {
    private String EndHour;
    private String startHour;
    private String nameCut;
    private String nameBarber;

    public String getEndHour() {
        return EndHour;
    }

    public void setEndHour(String endHour) {
        this.EndHour = endHour;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getNameCut() {
        return nameCut;
    }

    public void setNameCut(String nameCut) {
        this.nameCut = nameCut;
    }

    public String getNameBarber() {
        return nameBarber;
    }

    public void setNameBarber(String nameBarber) {
        this.nameBarber = nameBarber;
    }

    public ClientQuoteDTO(String EndHour, String startHour, String nameCut, String nameBarber) {
        this.EndHour = EndHour;
        this.startHour = startHour;
        this.nameCut = nameCut;
        this.nameBarber = nameBarber;
    }
}
