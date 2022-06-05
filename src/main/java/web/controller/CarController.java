package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.models.Car;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(defaultValue = "0") int count, ModelMap model) {
        List<Car> cars = carService.getCars(count);

        model.addAttribute("cars", cars);
        return "cars";
    }
}
