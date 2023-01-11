package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.AddressService;
import service.CarService;
import service.HumanService;

/**
 * @author hcalpay
 * @Date 25.12.2022
 */

@SpringBootApplication
@ComponentScan(basePackages = {"repository", "service", "entity"})
@EnableJpaRepositories(basePackages = "repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"entity"})
public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        AddressService addressService = applicationContext.getBean(AddressService.class);
        addressService.addAddress();

        CarService carService = applicationContext.getBean(CarService.class);
        carService.addCar();

        carService.findCar(1);


    }
}
