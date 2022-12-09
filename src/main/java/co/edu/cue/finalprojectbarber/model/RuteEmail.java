package co.edu.cue.finalprojectbarber.model;

public enum RuteEmail {
    OUTLOOK("outlook.com"),GOOGLE("gmail.com"),HOTMAIL("hotmial.com");
    private String ruteEmail;
    public String getRuteEmail(){return ruteEmail;}
    RuteEmail(String ruteEmail){this.ruteEmail=ruteEmail;}

}
