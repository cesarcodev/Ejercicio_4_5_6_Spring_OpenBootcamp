package com.ejercicios.Ejercicio_4_5_6_Spring;

import com.ejercicios.Ejercicio_4_5_6_Spring.entities.Laptop;
import com.ejercicios.Ejercicio_4_5_6_Spring.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Ejercicio456SpringApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(Ejercicio456SpringApplication.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"Lenovo",16,250,645.45, LocalDate.of(2013, 12, 1));
		Laptop laptop2 = new Laptop(null,"HP",64,250,800.41, LocalDate.of(2020, 7, 12));

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
