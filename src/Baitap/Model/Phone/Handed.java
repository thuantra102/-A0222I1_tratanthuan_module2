package Baitap.Model.Phone;

public class Handed extends Phone {
    private String country;
    private Status status;

    public Handed(String country, Status status) {
        this.country = country;
        this.status = status;
    }

    public Handed(int id, String name, float price, String producer, String country, Status status) {
        super(id, name, price, producer);
        this.country = country;
        this.status = status;
    }
    public Handed( String name, float price, String producer, String country, Status status) {
        super( name, price, producer);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + " Handed{" +
                "country='" + country + '\'' +
                ", status=" + status ;
    }
}
