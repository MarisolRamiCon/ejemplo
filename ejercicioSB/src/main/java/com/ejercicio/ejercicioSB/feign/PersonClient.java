package com.ejercicio.ejercicioSB.feign;

import com.ejercicio.ejercicioSB.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Persona", url = "https://6721642e98bbb4d93ca84a26.mockapi.io/api/v4/")
public interface PersonClient {
    @GetMapping("/Personas")
    List<Person> getData();

    /*@GetMapping("/api/products/{id}")
    Product getProductById(@PathVariable("id") Long id);*/

}
