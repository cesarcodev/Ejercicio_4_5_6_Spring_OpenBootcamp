package com.ejercicios.Ejercicio_4_5_6_Spring.repository;


import com.ejercicios.Ejercicio_4_5_6_Spring.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository <Laptop, Long> {
}
