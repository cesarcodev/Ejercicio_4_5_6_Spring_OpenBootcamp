package com.ejercicios.Ejercicio_4_5_6_Spring.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private Integer ram;
    private Integer disco;
    private Double precio;
    private LocalDate fecha_fabricacion;

    public Laptop() {
    }

    public Laptop(Long id, String marca, Integer ram, Integer disco, Double precio, LocalDate fecha_fabricacion) {
        this.id = id;
        this.marca = marca;
        this.ram = ram;
        this.disco = disco;
        this.precio = precio;
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getDisco() {
        return disco;
    }

    public void setDisco(Integer disco) {
        this.disco = disco;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(LocalDate fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }
}