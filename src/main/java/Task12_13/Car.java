package Task12_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private int price;
    private int yearOfProduction;
    private List<Manufacturer> manufacturerList;

    private EngineEnum engineModel;

    public Car(String name, String model, int price, int yearOfProduction, List<Manufacturer> manufacturerList, EngineEnum engineModel) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.manufacturerList = manufacturerList;
        this.engineModel = engineModel;
    }

    public Car addManufacturer (Manufacturer manufacturer) {
        if (manufacturerList == null) {
            manufacturerList = new ArrayList<>();
        }

        manufacturerList.add(manufacturer);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public EngineEnum getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(EngineEnum engineModel) {
        this.engineModel = engineModel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && yearOfProduction == car.yearOfProduction && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturerList, car.manufacturerList) && engineModel == car.engineModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfProduction, manufacturerList, engineModel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", manufacturerList=" + manufacturerList +
                ", engineModel=" + engineModel +
                '}';
    }
}
