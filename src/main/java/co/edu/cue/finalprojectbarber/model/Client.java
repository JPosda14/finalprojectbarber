package model;

public class client extends person {
    public client(String name) {
        super(name);
    }
    private String Count;

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public client(String name, String count) {
        super(name);
        Count = count;
    }
}
