package cl.duoc.ProyectoCliente;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.ProyectoCliente.domain.Cliente;

/**
 *
 * @author Matias
 */

@Controller
@Slf4j
public class ControladorCliente {
    
    @GetMapping("/")
    public String Inicio(Model modelo){
        
        Cliente c = new Cliente();
        c.setNombre("Matias");
        c.setApellido("Carrasco");
        c.setEmail("matias@animalfriend.cl");
        c.setDireccion("San Fernando 1550");
        c.setEdad("36");
        
        modelo.addAttribute("c", c);
        
        return "index";
    }
    
    
    
}
