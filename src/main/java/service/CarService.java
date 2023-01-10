package service;

import entity.Car;
import org.springframework.stereotype.Service;
import repository.CarRepository;

@Service
public class CarService {

    private final CarRepository carRepository;


    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar()
    {
        Car car = new Car();
        car.setBrand("BMW");
        car.setAge(7);
        carRepository.save(car);
    }

    public void findCar(String brand)
    {
        carRepository.findByBrand(brand);
    }
}
