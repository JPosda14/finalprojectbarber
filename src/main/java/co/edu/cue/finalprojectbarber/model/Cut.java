package co.edu.cue.finalprojectbarber.model;

public enum Cut {
    BASICHAIRCUT("BasicCut",15000,"src/main/resources/co/edu/cue/finalprojectbarber/images/beard.png"),BASICBARBERCUT("Barbercut",15000,"src/main/resources/co/edu/cue/finalprojectbarber/images/haircut.png"),CHANGEHAIRCOLOR("Changecolor",30000,"src/main/resources/co/edu/cue/finalprojectbarber/images/moustage.png"),EYEBROWCUT("Eyebrow",10000,"src/main/resources/co/edu/cue/finalprojectbarber/images/beard.png"),FULLCLEAN("Fulllclean",30000,"src/main/resources/co/edu/cue/finalprojectbarber/images/haircut.png"),BEAUTYCARE("Care",20000,"src/main/resources/co/edu/cue/finalprojectbarber/images/moustage.png");

    private String name;
    private double price;
    private String image;

    Cut(String name, double price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
