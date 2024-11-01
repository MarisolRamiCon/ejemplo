package com.ejercicio.ejercicioSB.controller;

import com.ejercicio.ejercicioSB.entity.Departamento;
import com.ejercicio.ejercicioSB.service.impl.DepartamentoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public List<Departamento> readAll() {
        return departamentoService.readAll();
    }

    @GetMapping("/departamentos/{id}")
    public Departamento readById(@PathVariable Integer id) {
        return departamentoService.readById(id);
    }

    @GetMapping("/departamento/Precio")
    public List<Departamento> findByPrecio(@RequestParam Double precio){
        return departamentoService.findByPrecio(precio);
    }

    @GetMapping("/departamento/lowerPrecio")
    public List<Departamento> findByPrecioLessThan(@RequestParam Double precio){
        return departamentoService.findByPrecioLessThan(precio);
    }

    @PostMapping("/departamentos")
    public Departamento create(@RequestBody Departamento departamento) {
        return departamentoService.create(departamento);
    }

    @PutMapping("/departamentos")
    public Departamento update(@RequestBody Departamento departamento){
        return departamentoService.update(departamento);
    }

    @DeleteMapping("/departamentos")
    public String deleteById(@RequestParam Integer id){
        return departamentoService.deleteById(id);
    }

    @GetMapping("/departamento/precioM2")
    public List<Departamento> findByPrecioAndM2(@RequestParam Double precio, @RequestParam Double m2){
        return departamentoService.findByPrecioAndM2(precio, m2);
    }

}
