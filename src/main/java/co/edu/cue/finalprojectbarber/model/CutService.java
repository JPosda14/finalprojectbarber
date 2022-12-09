package co.edu.cue.finalprojectbarber.model;

public class CutService {
    private String name;
    private String price;
    private String image;
    private Cut cut;


    public CutService(String name, String price, String image, Cut cut) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.cut = cut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Cut getCut() {
        return cut;
    }

    public void setCut(Cut cut) {
        this.cut = cut;
    }
}
