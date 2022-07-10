package ss16_io.bai_tap.ReadFileCsv;

import java.io.Serializable;

public class Country implements Serializable {
    private String number;
    private String code;
    private String name;

    public Country() {
    }

    public Country(String number, String code, String name) {
        this.number = number;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "number=" + number +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
