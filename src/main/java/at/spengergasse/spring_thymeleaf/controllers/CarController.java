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


    @PostMapping("/add")
    public String addCar(@ModelAttribute("car") Car car) {
        carService.addCar(car);
        return "redirect:/cars/list";
    }

    @PostMapping("/update")
    public String updateCar(@ModelAttribute("car") Car car) {
        carService.update(car);
        return "redirect:/cars/list";
    }

    @PostMapping("/remove")
    public String removeCar(@RequestParam("id") Integer id) {
        carService.remove(id);
        return "redirect:/cars/list";
    }



}
