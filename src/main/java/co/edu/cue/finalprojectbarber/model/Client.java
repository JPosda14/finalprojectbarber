package co.edu.cue.finalprojectbarber.model;

public class Client extends Person {
    public Client() {
        super();
    }
    private String number;

    public Client(String name, String password, String email, String number) {
        super(name, password, email);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
