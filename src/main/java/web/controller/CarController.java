package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false)Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
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
        if (count != null && count < 5) {
            model.addAttribute("cars", cars.subList(0, count));
        } else {
            model.addAttribute("cars", cars);
        }
        return "cars";
    }
}
