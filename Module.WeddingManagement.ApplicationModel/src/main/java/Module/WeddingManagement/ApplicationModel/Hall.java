package Module.WeddingManagement.ApplicationModel;

public class Hall extends AbstractModel {
    private int hallId;
    private String name;
    private double price;
    private HallType type;
    private String note;

    public Hall(String name, double price, HallType type, String note) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.note = note;
    }

    public int getHallId() {
        return hallId;
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

    public HallType getType() {
        return type;
    }

    public void setType(HallType type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public enum HallType
    {
        A,
        B,
        C,
        D,
        E
    }

}
