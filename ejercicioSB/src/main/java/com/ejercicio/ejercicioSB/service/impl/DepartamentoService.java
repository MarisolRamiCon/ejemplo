package com.ejercicio.ejercicioSB.service.impl;

import com.ejercicio.ejercicioSB.entity.Departamento;
import com.ejercicio.ejercicioSB.repository.DepartamentoRepository;
import com.ejercicio.ejercicioSB.service.IDepartamentoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service

public class DepartamentoService implements IDepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;
    @Override
    public List<Departamento> readAll() {
        return departamentoRepository.findAll();
    }

    @Override
    public Departamento readById(Integer id) {
        Optional<Departamento> departamentoOptional = departamentoRepository.findById(id);
        if(departamentoOptional.isPresent()){
            return departamentoOptional.get();
        }else{
            return new Departamento();
        }

    }

    @Override
    public Departamento create(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public String deleteById(Integer id) {
        Optional<Departamento> departamentoOptional=departamentoRepository.findById(id);
        if (departamentoOptional.isPresent()){
            departamentoRepository.deleteById(id);
            return "Departamento borrado exitosamente";

        }else{
        return "El departamento no se encuentra";
        }
    }
}
