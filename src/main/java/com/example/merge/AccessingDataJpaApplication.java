package com.example.merge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AccessingDataJpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(AccessingDataJpaApplication.class);
		CarRepository carRepository = context.getBean(CarRepository.class);
		Car car = new Car(1l);
		car.setName("Ferrari");

		Wheel wheel = new Wheel(1l, "first-wheel");
		wheel.setOwnerCar(car);

		car.getWheels().add(wheel);
		carRepository.save(car);

		// Assume we have found the car already
		car = carRepository.findById(1l).get();

		// Load the wheels of this car
		Car car1 = carRepository.loadWheelsForCar(car);

		System.out.println(car1.getWheels().size());
	}
}


