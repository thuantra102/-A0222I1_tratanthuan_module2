package Baitap.Model.Phone;

import Baitap.Model.Phone.Phone;

public class Genuine extends Phone {
    private String timeGenuine;
    private int codeGenuine;

    public Genuine(String timeGenuine, int codeGenuine) {
        this.timeGenuine = timeGenuine;
        this.codeGenuine = codeGenuine;
    }

    public Genuine(int id, String name, float price, String producer, String timeGenuine, int codeGenuine) {
        super(id, name, price, producer);
        this.timeGenuine = timeGenuine;
        this.codeGenuine = codeGenuine;
    }

    public Genuine( String name, float price, String producer, String timeGenuine, int codeGenuine) {
        super( name, price, producer);
        this.timeGenuine = timeGenuine;
        this.codeGenuine = codeGenuine;
    }



    public String getTimeGenuine() {
        return timeGenuine;
    }

    public void setTimeGenuine(String timeGenuine) {
        this.timeGenuine = timeGenuine;
    }

    public int getCodeGenuine() {
        return codeGenuine;
    }

    public void setCodeGenuine(int codeGenuine) {
        this.codeGenuine = codeGenuine;
    }

    @Override
    public String toString() {

        return super.toString() +  "Genuine{" +
                "timeGenuine=" + timeGenuine +
                ", codeGenuine=" + codeGenuine +
                '}'  ;
    }

}
