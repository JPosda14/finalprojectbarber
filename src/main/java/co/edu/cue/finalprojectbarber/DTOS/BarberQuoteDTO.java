package co.edu.cue.finalprojectbarber.DTOS;

public class BarberQuoteDTO {
    private String beginHour;
    private String startHour;
    private String nameCut;
    private String nameClient;

    public String getBeginHour() {
        return beginHour;
    }

    public void setBeginHour(String beginHour) {
        this.beginHour = beginHour;
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

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public BarberQuoteDTO(String beginHour, String startHour, String nameCut, String nameClient) {
        this.beginHour = beginHour;
        this.startHour = startHour;
        this.nameCut = nameCut;
        this.nameClient = nameClient;
    }
}
