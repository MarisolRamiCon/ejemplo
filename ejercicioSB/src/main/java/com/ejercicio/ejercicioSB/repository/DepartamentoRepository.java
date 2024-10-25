package com.ejercicio.ejercicioSB.repository;

import com.ejercicio.ejercicioSB.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
    public List<Departamento> findByPrecio(Double precio);
    public List<Departamento> findByPrecioLessThan(Double precio);


}
