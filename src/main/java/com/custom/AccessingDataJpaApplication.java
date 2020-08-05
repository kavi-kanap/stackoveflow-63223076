package com.custom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = MyRepositoryImpl.class)
public class AccessingDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AccessingDataJpaApplication.class);
		CarRepository carRepository = context.getBean(CarRepository.class);
		BusRepository busRepository = context.getBean(BusRepository.class);

		System.out.println("Saving Car : " + carRepository.save(new Car(1l,"car")).getName());
		System.out.println("Finding Car : " + carRepository.findById(1l).get().getName());
		System.out.println("Calling sharedCustomMethod on car repo : ");
		carRepository.sharedCustomMethod(1l);

		System.out.println("Saving Bus : " + busRepository.save(new Bus(1,"car")).getName());
		System.out.println("Finding Bus : " + busRepository.findById(1).get().getName());
		System.out.println("Calling sharedCustomMethod on bus repo : ");
		busRepository.sharedCustomMethod(1);
	}
}