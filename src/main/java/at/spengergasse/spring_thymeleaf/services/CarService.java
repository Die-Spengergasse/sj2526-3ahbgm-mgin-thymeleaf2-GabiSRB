package at.spengergasse.spring_thymeleaf.services;


import at.spengergasse.spring_thymeleaf.entities.Car;
import at.spengergasse.spring_thymeleaf.repositories.CarRepository;import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
   private final CarRepository carRepository;

    public void remove(){

    }

    public void addCar(Car car) {
        carRepository.save(car);
    }

    public @Nullable Object getAllCars() {
        return carRepository.findAll();
    }
}
