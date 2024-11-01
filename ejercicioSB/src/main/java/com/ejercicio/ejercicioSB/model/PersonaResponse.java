package com.ejercicio.ejercicioSB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaResponse {
    private Long id;
    private String nombre;
    private Long edad;
    private Long idDepartamento;

}
