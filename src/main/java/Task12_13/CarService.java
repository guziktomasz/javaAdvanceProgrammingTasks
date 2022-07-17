package Task12_13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    List<Car> carList = new ArrayList<>();

    public void addCar (Car newCar) {
        carList.add(newCar);
    }

    public void removeCar (Car remCar) {
        carList.remove(remCar);
    }

    public void printCarList (){
        System.out.println(carList);
    }

    public List<Car> engineV12(){
        return carList.stream()
                .filter(elem -> elem.getEngineModel().equals(EngineEnum.V12))
                .collect(Collectors.toList());
    }

    public List<Car> producedBefore1999(){
        return carList.stream()
                .filter(elem -> elem.getYearOfProduction() < 1999)
                .collect(Collectors.toList());
    }


    public Car mostExpensiveCar (){
        return carList.stream()
                .max((car1, car2) -> (car1.getPrice() - car2.getPrice()))
                .orElse(null);
                }

    public Car mostCheeperCar (){
        return carList.stream()
                .min((car1, car2) -> (car1.getPrice() - car2.getPrice()))
                .orElse(null);
    }


    @Override
    public String toString() {
        return "CarService{" +
                "carList=" + carList +
                '}';
    }
}
