package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Car;
import at.spengergasse.spring_thymeleaf.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/cars")
@RequiredArgsConstructor
public class PageController {

    private final CarService carService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "carlist";
    }

    @GetMapping("/remove")
    public String remove(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "remove_car";
    }

    @GetMapping("/add")
    public String addCar(Model model) {
        model.addAttribute("car", new Car());
        return "add_car";
    }

    @GetMapping("/update")
    public String updateCar(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        model.addAttribute("car", new Car());
        return "update_car";
    }
}
