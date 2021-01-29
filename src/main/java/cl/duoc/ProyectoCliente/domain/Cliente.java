package cl.duoc.ProyectoCliente.domain;

import lombok.Data;

/**
 *
 * @author Matias
 */

@Data
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String edad;
    
}
