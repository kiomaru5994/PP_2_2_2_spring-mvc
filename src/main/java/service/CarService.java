package service;

import web.model.Car;
import java.util.List;

public interface CarService {
    void addCarsToList();
    List<Car> getCars(Integer count);
}
