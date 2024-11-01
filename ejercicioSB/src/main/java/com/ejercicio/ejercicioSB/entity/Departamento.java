package com.ejercicio.ejercicioSB.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "m2")
    private Double m2;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "is_active")
    private Boolean isActive=true;


/*
    public Departamento(Integer id, Double m2, Double precio) {
        this.id = id;
        this.m2 = m2;
        this.precio = precio;
    }

    public Departamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }*/
}
