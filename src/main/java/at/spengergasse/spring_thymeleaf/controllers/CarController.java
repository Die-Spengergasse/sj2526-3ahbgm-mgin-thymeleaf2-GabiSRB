package at.spengergasse.spring_thymeleaf.controllers;


import at.spengergasse.spring_thymeleaf.entities.Car;
import at.spengergasse.spring_thymeleaf.entities.Patient;
import at.spengergasse.spring_thymeleaf.services.CarService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "carlist";
    }


    @GetMapping("/add")
    public String addCar(Model model) {
        model.addAttribute("car", new Car());
        return "add_car";
    }

    @PostMapping("/add")
    public String addCar(@ModelAttribute("car") Car car) {
        carService.addCar(car);
        return "redirect:/cars/list";
    }



}
