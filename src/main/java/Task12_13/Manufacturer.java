package Task12_13;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private int yearOfestablishment;
    private String country;

    public Manufacturer(String name, int yearOfestablishment, String country) {
        this.name = name;
        this.yearOfestablishment = yearOfestablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfestablishment() {
        return yearOfestablishment;
    }

    public void setYearOfestablishment(int yearOfestablishment) {
        this.yearOfestablishment = yearOfestablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfestablishment == that.yearOfestablishment && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfestablishment, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfestablishment=" + yearOfestablishment +
                ", country='" + country + '\'' +
                '}';
    }
}
