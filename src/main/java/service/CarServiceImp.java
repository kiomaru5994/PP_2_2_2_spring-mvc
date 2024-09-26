package service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private final List<Car> cars = new ArrayList<>();

    @Override
    public void addCarsToList() {
        Car mazdaCar = new Car("Mazda", "6", 2007);
        Car vazCar = new Car("VAZ", "2107", 1998);
        Car shitCar = new Car("Lada", "Granta", 2022);
        Car toyotaCar = new Car("Toyota", "Mark II", 2005);
        Car nissanCar = new Car("Nissan", "Premier", 1997);
        cars.add(mazdaCar);
        cars.add(vazCar);
        cars.add(shitCar);
        cars.add(toyotaCar);
        cars.add(nissanCar);
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (cars.isEmpty()) addCarsToList();
        if (count == null || count < 0 || count > cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
