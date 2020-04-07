package com.djhoyos.citasweb.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoPersona {
 
    private long id;
    private ComandoTipoDocumento tipo_documento;
    private String documento;
    private String nombre;
    private String celular;
    private String direccion;
    private String email;
    private boolean estado;

}
